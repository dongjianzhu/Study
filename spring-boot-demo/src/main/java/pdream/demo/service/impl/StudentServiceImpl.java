package pdream.demo.service.impl;

import org.springframework.transaction.annotation.Transactional;
import pdream.demo.entity.Student;
import pdream.demo.mapper.StudentMapper;
import pdream.demo.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dongjianzhu
 * @since 2019-12-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean update(Integer id, String mobile) {
        Student student = new Student().setMobile(mobile).setId(id);
        boolean b = updateById(student);
        int i = 1 / 0;
        return b;
    }
}
