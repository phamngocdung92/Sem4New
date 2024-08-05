package T2208E.Sub2Exam.NgocDung.service.ManufacturerService;

import T2208E.Sub2Exam.NgocDung.dto.ManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqManufacturer.ReqCreateManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqManufacturer.ReqUpdateManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResManufacturer.ResDeleteManufactureDto;
import T2208E.Sub2Exam.NgocDung.entity.ManufacturerEntity;
import T2208E.Sub2Exam.NgocDung.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{
    @Autowired
    ManufacturerRepository manufacturerRepository;
    @Override
    public ManufacturerDto getAllManufacturer() {
        List<ManufacturerEntity> manufacturer = manufacturerRepository.findAll();
        List<ManufacturerDto> result = new ArrayList<>();
        for(ManufacturerEntity m : manufacturer){
            result.add(getManufacDto(m.getId(), m));
        }
        ManufacturerDto res = new ManufacturerDto();
        res.setContent(result);
        return res;
    }
    private ManufacturerDto getManufacDto(long manuFacId, ManufacturerEntity m) {
        ManufacturerDto res = new ManufacturerDto();
        res.setId(m.getId());
        res.setName(m.getName());
        res.setOrigin(m.getOrigin());
        res.setDesctiption(m.getDesctiption());
        res.setCreatedBy(m.getCreatedBy());
        res.setCreatedTime(m.getCreatedTime());
        res.setUpdatedBy(m.getUpdatedBy());
        res.setUpdatedTime(m.getUpdatedTime());
        res.setStatus(m.getStatus());
        return res;
    }
    @Override
    public ManufacturerDto createManufacturer(ReqCreateManufacturerDto inputDto) {
        ManufacturerEntity manufacturer = new ManufacturerEntity();
        manufacturer.setName(inputDto.getName());
        manufacturer.setOrigin(inputDto.getOrigin());
        manufacturer.setDesctiption(inputDto.getDesctiption());
        if(inputDto.getCreatedBy() == null || StringUtils.isEmpty(inputDto.getCreatedBy()))
        {
            manufacturer.setCreatedBy("admin");
        }
        else{
            manufacturer.setCreatedBy(inputDto.getCreatedBy());
        }
        if(inputDto.getCreatedTime() == null || StringUtils.isEmpty(inputDto.getCreatedTime()))
        {
            LocalDateTime date = LocalDateTime.now();
            manufacturer.setCreatedTime(date);
        }
        else
        {
            manufacturer.setCreatedTime(inputDto.getCreatedTime());
        }
        manufacturerRepository.save(manufacturer);
        return getAllManufacturer();
    }

    @Override
    public ManufacturerDto updateManufacturer(ReqUpdateManufacturerDto inputDto, Long id) {
        ManufacturerEntity manufacturer = manufacturerRepository.findById(id).get();
        manufacturer.setName(inputDto.getName());
        manufacturer.setOrigin(inputDto.getOrigin());
        manufacturer.setDesctiption(inputDto.getDesctiption());
        if(inputDto.getUpdatedBy() == null || StringUtils.isEmpty(inputDto.getUpdatedBy()))
        {
            manufacturer.setUpdatedBy("admin");
        }
        else{
            manufacturer.setUpdatedBy(inputDto.getUpdatedBy());
        }
        if(inputDto.getUpdatedTime() == null || StringUtils.isEmpty(inputDto.getUpdatedTime()))
        {
            LocalDateTime date = LocalDateTime.now();
            manufacturer.setUpdatedTime(date);
        }
        else
        {
            manufacturer.setUpdatedTime(inputDto.getUpdatedTime());
        }
        manufacturer.setStatus(inputDto.getStatus());
        manufacturerRepository.save(manufacturer);
        return getAllManufacturer();
    }

    @Override
    public ResDeleteManufactureDto deleteManufacturer(Long id) {
        ManufacturerEntity manufacturer = manufacturerRepository.findById(id).get();
        if(manufacturer.getProducts().isEmpty())
        {
            manufacturer.setStatus(0); //0 inactive, 1 active
            ResDeleteManufactureDto res = new ResDeleteManufactureDto();
            res.setMessage("Delete success");
            return res;
        }
        else
        {
            ResDeleteManufactureDto res = new ResDeleteManufactureDto();
            res.setMessage("Delete fail");
            return res;
        }
    }

}
