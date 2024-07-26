package T2208E.Sub2Exam.NgocDung.mapper;

import T2208E.Sub2Exam.NgocDung.dto.DepartmentDTO;
import T2208E.Sub2Exam.NgocDung.dto.UserDTO;
import T2208E.Sub2Exam.NgocDung.entity.User;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;

public class UserMapper {
    public static UserDTO entityToDto (User user){
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(user, dto);
        DepartmentDTO departmentDTO = DepartmentMapper.entityToDto(user.getDepartment());
        dto.setDepartment(departmentDTO);
        return dto;
    }
    public static User dtoToEntity (UserDTO dto){
        User user = new User();
        BeanUtils.copyProperties(dto, user);
        return user;
    }
}
