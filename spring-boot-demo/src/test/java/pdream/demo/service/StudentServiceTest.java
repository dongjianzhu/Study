package pdream.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pdream.demo.entity.Student;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    StudentService service;

    @Test
    void getById() {
        Student student = service.getById(903);
        System.out.println(student);
    }

    @Test
    void update() {
        boolean update = service.update(903, "13800138000");
        System.out.println(update);
    }

    @Test
    void get() {
        Student student = service.get(903);
        System.out.println(student);
    }
}