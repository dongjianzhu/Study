package pdream.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    private  DataSource dataSource;

    @Test
    void contextLoads() {

        HikariDataSource hikariDataSource = (HikariDataSource) dataSource;
        int maximumPoolSize = hikariDataSource.getMaximumPoolSize();
        System.out.println(maximumPoolSize);
    }

}
