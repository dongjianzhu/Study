package pdream.demo.entity;

import lombok.Data;

/**
 * @author dongjianzhu
 * @date 2020/3/21 20:31
 */
@Data
public class ResponseResult {

    private Integer code;

    private String msg;

    private Object data;

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
