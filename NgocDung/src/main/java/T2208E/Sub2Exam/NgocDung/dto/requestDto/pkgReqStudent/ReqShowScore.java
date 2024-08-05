package T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent;

import T2208E.Sub2Exam.NgocDung.dto.ShowingResultDto;

public class ReqShowScore extends ShowingResultDto {
    private int studentId;
    private int subjectId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}
