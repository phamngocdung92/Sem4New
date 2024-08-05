package T2208E.Sub2Exam.NgocDung.service.ManufacturerService;

import T2208E.Sub2Exam.NgocDung.dto.ManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqManufacturer.ReqCreateManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqManufacturer.ReqUpdateManufacturerDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResManufacturer.ResDeleteManufactureDto;
import org.springframework.stereotype.Service;

@Service
public interface ManufacturerService {
     ManufacturerDto getAllManufacturer();
     ManufacturerDto createManufacturer(ReqCreateManufacturerDto inputDto);
     ManufacturerDto updateManufacturer(ReqUpdateManufacturerDto inputDto, Long id);
     ResDeleteManufactureDto deleteManufacturer(Long id);
}
