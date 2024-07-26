package T2208E.Sub2Exam.NgocDung.service.UserService;

import T2208E.Sub2Exam.NgocDung.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<UserDTO> getAllUsers();
    public String addUser(UserDTO dto);
    public String updateUser(long userId, UserDTO dto);
    public UserDTO getUserDetailById(long userId);
    public UserDTO getUserDetailByName(String userName);
}
