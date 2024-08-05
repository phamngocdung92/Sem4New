package T2208E.Sub2Exam.NgocDung.service.StudentService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqCreateStudent;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqShowScore;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResStudent.ResShowStudentScore;
import T2208E.Sub2Exam.NgocDung.entity.StudentEntity;
import T2208E.Sub2Exam.NgocDung.entity.StudentScoreEntity;
import T2208E.Sub2Exam.NgocDung.repository.ScoreRepository;
import T2208E.Sub2Exam.NgocDung.repository.StudentRepository;
import T2208E.Sub2Exam.NgocDung.service.ScoreService.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ScoreService scoreService;
    @Autowired
    ScoreRepository scoreRepository;
    @Override
    public String createStudent(ReqCreateStudent inputDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudent_code(inputDto.getStudentCode());
        studentEntity.setFull_name(inputDto.getStudentName());
        studentEntity.setAddress(inputDto.getStudentAddress());
        studentRepository.save(studentEntity);
        return "Create student success";
    }
    @Override
    public ResShowStudentScore showStudentScore(ReqShowScore inputDto) {
        StudentScoreEntity score = new StudentScoreEntity();
        score.setStudent_id(inputDto.getStudentId());
        String grade = scoreService.ConvertScoreToGrade(scoreService.calculateScore(score.getScore1(), score.getScore2()));
        ResShowStudentScore resShowStudentScore = new ResShowStudentScore();
        resShowStudentScore.setStudentId(score.getStudent_id());
        resShowStudentScore.setSubjectId(score.getSubject_id());
        resShowStudentScore.setScore1(score.getScore1());
        resShowStudentScore.setScore2(score.getScore2());
        resShowStudentScore.setGrade(grade);
        return resShowStudentScore;

    }
}
