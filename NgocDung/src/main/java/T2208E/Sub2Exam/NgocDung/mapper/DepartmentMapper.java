package T2208E.Sub2Exam.NgocDung.mapper;

import T2208E.Sub2Exam.NgocDung.dto.DepartmentDto;
import T2208E.Sub2Exam.NgocDung.entity.CompanyEntity;
import T2208E.Sub2Exam.NgocDung.entity.DepartmentEntity;
import T2208E.Sub2Exam.NgocDung.entity.UserEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentMapper {
    public static DepartmentDto entityToDto(DepartmentEntity entity) {
        if (entity == null) return null;
        DepartmentDto dto = new DepartmentDto();
        BeanUtils.copyProperties(entity, dto);
        if (entity.getCompany() != null) {
            dto.setCompanyId(entity.getCompany().getId());
        }
        return dto;
    }

    public static DepartmentEntity dtoToEntity(DepartmentDto dto) {
        if (dto == null) return null;
        DepartmentEntity entity = new DepartmentEntity();
        BeanUtils.copyProperties(dto, entity);
        if (dto.getCompanyId() != null) {
            CompanyEntity company = new CompanyEntity();
            company.setId(dto.getCompanyId());
            entity.setCompany(company);
        }
        return entity;
    }
}
