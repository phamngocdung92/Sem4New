package T2208E.Sub2Exam.NgocDung.service.DepartmentService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqDepartment.ReqDetailDeptDto;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResDepartment.ResDetailDeptDto;
import T2208E.Sub2Exam.NgocDung.entity.DepartmentEntity;
import T2208E.Sub2Exam.NgocDung.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public ResDetailDeptDto getDetailDepartment(ReqDetailDeptDto dto) {
        try {
            DepartmentEntity department = departmentRepository.findById(dto.getId()).get();
            department.getName();
            department.getCompany();
            department.getUsers();
            int userCount = department.getUsers().size();
            ResDetailDeptDto resultData = new ResDetailDeptDto();
            resultData.setId(department.getId());
            resultData.setName(department.getName());
            resultData.setCompanyId(department.getCompany().getId());
            resultData.setNumberOfEmployee(userCount);
            return resultData;
        }
        catch (Exception e) {
            return null;
        }
    }
}
