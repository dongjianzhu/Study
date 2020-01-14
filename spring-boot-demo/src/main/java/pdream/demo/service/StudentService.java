package pdream.demo.service;

import pdream.demo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

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

}
