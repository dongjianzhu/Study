package pdream.demo;

import com.alibaba.excel.EasyExcel;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author dongjianzhu
 * @date 2019年12月27日
 */
@SpringBootApplication
@MapperScan("pdream.demo.mapper")
@EnableCaching
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        /*String path = "C:\\Users\\dongjianzhu\\Desktop\\data.xlsx";
//        String path = "C:\\Users\\dongjianzhu\\Desktop\\shop.xlsx";
        joinStr(path)*/
        ;

    }

    static void joinStr(String path) {
        EasyExcel.read(path, Data.class, new DataListener()).sheet().doRead();
    }


}
