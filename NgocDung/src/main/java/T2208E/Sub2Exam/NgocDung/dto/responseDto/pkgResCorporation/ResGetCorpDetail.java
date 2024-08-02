package T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResCorporation;

import T2208E.Sub2Exam.NgocDung.dto.ShowingResultDto;

import java.time.LocalDateTime;
import java.util.List;

public class ResGetCorpDetail extends ShowingResultDto {
    private String name;
    private String createdBy;
    private LocalDateTime createdTime;
    private String updatedBy;
    private LocalDateTime updatedTime;
    private int numberOfEmployee;
    private int numberOfDepartment;
    private int numberOfCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    public int getNumberOfCompany() {
        return numberOfCompany;
    }

    public void setNumberOfCompany(int numberOfCompany) {
        this.numberOfCompany = numberOfCompany;
    }
}
