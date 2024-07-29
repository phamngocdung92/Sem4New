package T2208E.Sub2Exam.NgocDung.mapper;

import T2208E.Sub2Exam.NgocDung.dto.CorporationDto;
import T2208E.Sub2Exam.NgocDung.entity.CorporationEntity;
import org.springframework.beans.BeanUtils;

public class CorporationMapper {
    public static CorporationDto entityToDto(CorporationEntity entity) {
        if (entity == null) return null;
        CorporationDto dto = new CorporationDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public static CorporationEntity dtoToEntity(CorporationDto dto) {
        if (dto == null) return null;
        CorporationEntity entity = new CorporationEntity();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}