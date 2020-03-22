package pdream.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import pdream.demo.annotation.RunTime;

import java.lang.reflect.Method;

/**
 * 运行时间的切面
 *
 * @author dongjianzhu
 * @date 2020/3/20 21:58
 */
@Aspect
@Component
public class RunTimeAspect {

    /**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     * 通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * pdream.demo.controller.StudentController.*(..)))")
    public void pointCut() {

    }

    @Pointcut("@annotation(pdream.demo.annotation.RunTime)")
    public void runTimePointCut() {

    }

    /**
     * 在连接点执行之前执行的通知
     */
    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint);
        System.out.println("before ....");
    }

    /**
     * 在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */
    @After("pointCut()")
    public void after() {
        System.out.println("after ....");
    }

    /**
     * 在连接点执行之后执行的通知（返回通知）
     */
    @AfterReturning("runTimePointCut()")
    public void afterReturning(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        RunTime runTime = method.getAnnotation(RunTime.class);
        System.out.println("注解式拦截 " + runTime.name());
        System.out.println("after returning ....");
    }

    /**
     * 在连接点执行之后执行的通知（异常通知）
     */
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("after  throwing ....");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around ...");
        //开始时间
        long start = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        long end = System.currentTimeMillis();
        System.out.println(point);
        System.out.println(end - start);
        return result;
    }

}
