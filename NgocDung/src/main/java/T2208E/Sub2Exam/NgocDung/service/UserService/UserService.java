package T2208E.Sub2Exam.NgocDung.service.UserService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqCreateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqSearchUserDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqUser.ReqUpdateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResUser.ResCreateUserDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResUser.ResSearchUserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    ResSearchUserDto getAllUser();
    ResSearchUserDto searchUser(ReqSearchUserDto criteria);
    ResCreateUserDto createUser(ReqCreateUserDto inputDto);
    String updateUser(ReqUpdateUserDto inputDto, Long id);
    String deleteUser(Long id);
}
