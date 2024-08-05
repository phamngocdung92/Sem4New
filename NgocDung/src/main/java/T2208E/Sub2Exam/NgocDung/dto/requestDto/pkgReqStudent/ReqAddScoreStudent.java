package T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent;

import T2208E.Sub2Exam.NgocDung.dto.ShowingResultDto;

public class ReqAddScoreStudent extends ShowingResultDto {
    private int studentId;
    private int subjectId;
    private double score1;
    private double score2;

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

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }
}
