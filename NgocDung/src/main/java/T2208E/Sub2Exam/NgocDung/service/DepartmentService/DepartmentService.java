package T2208E.Sub2Exam.NgocDung.service.DepartmentService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqDepartment.ReqDetailDeptDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResDepartment.ResDetailDeptDto;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    ResDetailDeptDto getDetailDepartment(ReqDetailDeptDto dto);
}
