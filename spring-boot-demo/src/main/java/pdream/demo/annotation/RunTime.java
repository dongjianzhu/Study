package pdream.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dongjianzhu
 * @date 2020/3/21 11:37
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunTime {

    String name();

    /**
     * 如果没有默认值 就是必填
     *
     * @return
     */
    int age() default 18;
}
