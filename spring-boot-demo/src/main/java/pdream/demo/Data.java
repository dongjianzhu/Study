package pdream.demo;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @author dongjianzhu
 * @date 2020/3/23 20:25
 */
@lombok.Data
public class Data {

    /*@ExcelProperty("成交金额指数")
    private Long index;

    @ExcelProperty("成交金额")
    private Long number;*/

    @ExcelProperty("成交单量指数")
    private Long index;

    @ExcelProperty("成交单量")
    private Long number;

    public static void main(String[] args) {
        System.out.println(3.4794e+05);
    }

}
