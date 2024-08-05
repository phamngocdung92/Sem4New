package T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent;

import T2208E.Sub2Exam.NgocDung.dto.ShowingResultDto;

public class ReqCreateStudent extends ShowingResultDto {
    private String studentCode;
    private String studentName;
    private String studentAddress;

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
