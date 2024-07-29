package T2208E.Sub2Exam.NgocDung.mapper;

import T2208E.Sub2Exam.NgocDung.dto.CompanyDto;
import T2208E.Sub2Exam.NgocDung.dto.DepartmentDto;
import T2208E.Sub2Exam.NgocDung.entity.CompanyEntity;
import T2208E.Sub2Exam.NgocDung.entity.CorporationEntity;
import T2208E.Sub2Exam.NgocDung.entity.DepartmentEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyMapper {
    public static CompanyDto entityToDto(CompanyEntity entity) {
        if (entity == null) return null;
        CompanyDto dto = new CompanyDto();
        BeanUtils.copyProperties(entity, dto);
        if (entity.getCorporation() != null) {
            dto.setCorporationId(entity.getCorporation().getId());
        }
        return dto;
    }

    public static CompanyEntity dtoToEntity(CompanyDto dto) {
        if (dto == null) return null;
        CompanyEntity entity = new CompanyEntity();
        BeanUtils.copyProperties(dto, entity);
        if (dto.getCorporationId() != null) {
            CorporationEntity corporation = new CorporationEntity();
            corporation.setId(dto.getCorporationId());
            entity.setCorporation(corporation);
        }
        return entity;
    }
}
