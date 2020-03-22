package pdream.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import pdream.demo.entity.ResponseResult;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;

/**
 * 全局异常
 *
 * @author dongjianzhu
 * @version 1.0
 * @date 2019年9月6日 下午3:32:45
 */
@ControllerAdvice
@Slf4j
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseResult handleException(Exception e) {
        log.error("系统异常", e);
        return new ResponseResult(400, "系统异常");
    }

    /**
     * @param e
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(TypeMismatchException.class)
    public ResponseResult handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        log.warn("参数非法", e);
        return new ResponseResult(400, "参数非法");
    }

    /**
     * 请求参数不能正确读取解析时，抛出的异常，比如传入和接受的参数类型不一致
     *
     * @param e
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseResult handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.warn("参数非法", e);
        return new ResponseResult(400, "参数非法");
    }

    /**
     * 异步超时
     *
     * @param e 异步超时异常
     */
    @ResponseStatus(HttpStatus.NOT_MODIFIED)
    @ExceptionHandler(AsyncRequestTimeoutException.class)
    public ResponseResult handleAsyncRequestTimeoutException(AsyncRequestTimeoutException e) {
        log.warn("异步任务超时", e);
        return new ResponseResult(304, "异步任务超时");
    }

    /**
     * 处理 @Valid
     *
     * @param e 参数绑定异常
     */
    @ExceptionHandler(BindException.class)
    public ResponseResult handleBindException(BindException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        String defaultMessage = fieldError.getDefaultMessage();
        log.error(defaultMessage);
        return new ResponseResult(400, "参数非法");
    }

    /**
     * 处理针对参数较少，没有封装成对象的情况
     *
     * @param e
     * @return
     * @Valid @PathVariable("id") @Max(value = 5,message = "超过 id 的范围了") Integer id
     * ps：一定一定不要忘记在类上加上 Validated 注解了，这个参数可以告诉 Spring 去校验方法参数。
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseResult handleConstraintViolationException(ConstraintViolationException e) {
        for (ConstraintViolation<?> constraintViolation : e.getConstraintViolations()) {
            String message = constraintViolation.getMessage();
            log.error(message);
            return new ResponseResult(400, message);
        }
        return new ResponseResult(400, "参数非法");
    }

    /**
     * 针对@Valid和@RequestBody一起
     *
     * @param e 参数绑定异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        for (ObjectError objectError : allErrors) {
            String defaultMessage = objectError.getDefaultMessage();
            log.error(objectError.getObjectName() + ":" + defaultMessage);
            return new ResponseResult(1000, defaultMessage);
        }
        return new ResponseResult(400, "参数非法");
    }

}