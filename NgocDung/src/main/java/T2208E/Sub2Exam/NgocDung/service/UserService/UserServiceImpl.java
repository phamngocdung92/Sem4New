package T2208E.Sub2Exam.NgocDung.service.UserService;

import T2208E.Sub2Exam.NgocDung.repository.DepartmentRepository;
import T2208E.Sub2Exam.NgocDung.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final DepartmentRepository departmentRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, DepartmentRepository departmentRepository){
        this.userRepository = userRepository;
        this.departmentRepository = departmentRepository;
    }
}
