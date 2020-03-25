package pdream.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pdream.demo.entity.Student;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dongjianzhu
 * @since 2019-12-30
 */
public interface StudentService extends IService<Student> {

    boolean update(Integer id, String mobile);

    Student get(Integer id);

}
