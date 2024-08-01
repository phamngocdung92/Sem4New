package T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResUser;

import T2208E.Sub2Exam.NgocDung.dto.ShowingResultDto;

import java.util.Date;

public class ResCreateUserDto extends ShowingResultDto {
    private String username;
    private String address;
    private String departmentName;
    private String companyName;
    private String corporationName;
    private String createResult;
    private Date createDate;
    private String createBy;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getCreateResult() {
        return createResult;
    }

    public void setCreateResult(String createResult) {
        this.createResult = createResult;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
