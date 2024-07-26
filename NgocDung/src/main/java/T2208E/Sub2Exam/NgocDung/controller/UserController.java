package T2208E.Sub2Exam.NgocDung.controller;

import T2208E.Sub2Exam.NgocDung.dto.UserDTO;
import T2208E.Sub2Exam.NgocDung.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }
    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long userId, @RequestBody UserDTO userDTO) {
        return userService.updateUser(userId, userDTO);
    }
   //get user detail by id
    @GetMapping("/detail/{id}")
    public UserDTO getUserDetailById(@PathVariable("id") long userId) {
        return userService.getUserDetailById(userId);
    }
    //get user detail by name
    @GetMapping("/detail/{name}")
    public UserDTO getUserDetailByName(@PathVariable("name") String userName) {
        return userService.getUserDetailByName(userName);
    }
}
