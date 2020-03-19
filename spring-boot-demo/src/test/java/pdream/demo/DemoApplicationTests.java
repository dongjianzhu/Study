package pdream.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        HikariDataSource hikariDataSource = (HikariDataSource) dataSource;
        int maximumPoolSize = hikariDataSource.getMaximumPoolSize();
        System.out.println(maximumPoolSize);
    }

}
