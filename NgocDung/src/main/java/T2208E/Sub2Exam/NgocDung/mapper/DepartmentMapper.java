package T2208E.Sub2Exam.NgocDung.mapper;

import T2208E.Sub2Exam.NgocDung.dto.DepartmentDTO;
import T2208E.Sub2Exam.NgocDung.entity.Department;
import T2208E.Sub2Exam.NgocDung.entity.User;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentMapper {
    public static DepartmentDTO entityToDto(Department department){
        DepartmentDTO dto = new DepartmentDTO();
        BeanUtils.copyProperties(department, dto);
        List<User> users = department.getUsers();
        dto.setUserDto(users.stream().map(UserMapper::entityToDto).collect(Collectors.toList()));
        return dto;
    }
}
