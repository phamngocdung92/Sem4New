package T2208E.Sub2Exam.NgocDung.mapper;

import T2208E.Sub2Exam.NgocDung.dto.DepartmentDto;
import T2208E.Sub2Exam.NgocDung.dto.UserDto;
import T2208E.Sub2Exam.NgocDung.entity.DepartmentEntity;
import T2208E.Sub2Exam.NgocDung.entity.UserEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto entityToDto(UserEntity entity) {
        if (entity == null) return null;
        UserDto dto = new UserDto();
        BeanUtils.copyProperties(entity, dto);
        if (entity.getDepartment() != null) {
            dto.setDepartmentId(entity.getDepartment().getId());
        }
        return dto;
    }

    public static UserEntity dtoToEntity(UserDto dto) {
        if (dto == null) return null;
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(dto, entity);
        if (dto.getDepartmentId() != null) {
            DepartmentEntity department = new DepartmentEntity();
            department.setId(dto.getDepartmentId());
            entity.setDepartment(department);
        }
        return entity;
    }

    public static List<UserDto> entityListToDtoList(List<UserEntity> entities) {
        if (entities == null) return null;
        return entities.stream()
                .map(UserMapper::entityToDto)
                .collect(Collectors.toList());
    }
}
