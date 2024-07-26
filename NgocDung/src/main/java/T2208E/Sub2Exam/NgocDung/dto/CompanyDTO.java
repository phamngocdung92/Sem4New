package T2208E.Sub2Exam.NgocDung.dto;

import T2208E.Sub2Exam.NgocDung.entity.Department;

import java.util.List;

public class CompanyDTO {
    private Long companyId;
    private String companyName;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
