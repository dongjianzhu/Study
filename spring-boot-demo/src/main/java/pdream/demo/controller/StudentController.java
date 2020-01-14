package pdream.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pdream.demo.entity.Student;
import pdream.demo.service.StudentService;

import javax.validation.constraints.Max;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dongjianzhu
 * @since 2019-12-30
 */
@Controller
@RequestMapping("/student")
@Slf4j
@Validated
public class StudentController {

    @Autowired
    StudentService service;

    /**
     * 如果不能匹配正则表达则报404
     * ps：测试日志
     *
     * @param id
     * @return
     */
    @RequestMapping("/get/{id:\\d+}")
    @ResponseBody
    public Student get(@PathVariable("id") @Max(value = 903, message = "{student.id.Max.message}") Integer id) {
        log.debug("debug log......");
        log.info("info log......");
        log.error("error log...");
        return service.getById(id);

    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(Student student) {
        System.out.println(student);
        service.save(student);
        return "success";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(Integer id, String mobile) {
        service.update(id, mobile);
        return "success";
    }

    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public IPage<Student> listStudent(Page<Student> page) {
        return service.page(page);
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", "hello springboot");
        return modelAndView;
    }

}
