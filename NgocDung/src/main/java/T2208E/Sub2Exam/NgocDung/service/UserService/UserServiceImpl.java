package T2208E.Sub2Exam.NgocDung.service.UserService;

import T2208E.Sub2Exam.NgocDung.dto.UserDTO;
import T2208E.Sub2Exam.NgocDung.entity.User;
import T2208E.Sub2Exam.NgocDung.repository.UserRepo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return
    }

}
