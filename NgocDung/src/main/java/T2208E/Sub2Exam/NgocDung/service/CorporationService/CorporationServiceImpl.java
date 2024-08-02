package T2208E.Sub2Exam.NgocDung.service.CorporationService;

import T2208E.Sub2Exam.NgocDung.config.properties.CommonProperties;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResCorporation.ResGetCorpDetail;
import T2208E.Sub2Exam.NgocDung.entity.CompanyEntity;
import T2208E.Sub2Exam.NgocDung.entity.CorporationEntity;
import T2208E.Sub2Exam.NgocDung.entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CorporationServiceImpl implements CorporationService{

    @Autowired
    CommonProperties CommonProperties;
    @Override
    public ResGetCorpDetail getCorporationDetail() {
        try {
            CorporationEntity corporation = new CorporationEntity();
            corporation.getName();
            corporation.getCompanies();
            int companyCount = corporation.getCompanies().size();
            CompanyEntity company = new CompanyEntity();
            company.getDepartments();
            int departmentCount = company.getDepartments().size();
            DepartmentEntity department = new DepartmentEntity();
            department.getUsers();
            int userCount = department.getUsers().size();
            List resultData = new ArrayList();
            resultData.add(companyCount);
            resultData.add(departmentCount);
            resultData.add(userCount);
            ResGetCorpDetail showingResult = new ResGetCorpDetail();
            showingResult.setContent(resultData);
            showingResult.setPageNumber(CommonProperties.getDefaultPageNumber());
            showingResult.setPageSize(CommonProperties.getDefaultPageSize());
            return showingResult;
        }
        catch (Exception e) {
            ResGetCorpDetail showingResult = new ResGetCorpDetail();
            showingResult.setContent(null);
            showingResult.setPageNumber(CommonProperties.getDefaultPageNumber());
            showingResult.setPageSize(CommonProperties.getDefaultPageSize());
            return showingResult;
        }
    }
}
