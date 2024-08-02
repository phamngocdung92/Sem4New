package T2208E.Sub2Exam.NgocDung.controller;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqCreateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqSearchUserDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqUpdateUserDto;
import T2208E.Sub2Exam.NgocDung.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getAllUser")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }
    @PostMapping("/searchUser")
    public ResponseEntity<?> searchUser(@RequestBody ReqSearchUserDto criteria) {
        return ResponseEntity.ok(userService.searchUser(criteria));
    }
    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody ReqCreateUserDto inputDto ) {
        return ResponseEntity.ok(userService.createUser(inputDto));
    }
    @PutMapping("/updateUser")
    public ResponseEntity<?> updateUser(@RequestBody ReqUpdateUserDto inputDto, Long id) {
        return ResponseEntity.ok(userService.updateUser(inputDto, id));
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestParam Long id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }
    @GetMapping("/downloadUserFile")
    public ResponseEntity<?> downloadUserFile() {
        return ResponseEntity.ok(userService.downloadUserFile());
    }
}
