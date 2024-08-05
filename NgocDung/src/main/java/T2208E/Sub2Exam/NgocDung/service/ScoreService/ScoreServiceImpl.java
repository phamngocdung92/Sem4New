package T2208E.Sub2Exam.NgocDung.service.ScoreService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqAddScoreStudent;
import T2208E.Sub2Exam.NgocDung.entity.StudentEntity;
import T2208E.Sub2Exam.NgocDung.entity.StudentScoreEntity;
import T2208E.Sub2Exam.NgocDung.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    ScoreRepository scoreRepository;

    @Override
    public String addScore (ReqAddScoreStudent inputDto){
        StudentScoreEntity studentScoreEntity = new StudentScoreEntity();
        studentScoreEntity.setStudent_id(inputDto.getStudentId());
        studentScoreEntity.setSubject_id(inputDto.getSubjectId());
        studentScoreEntity.setScore1(inputDto.getScore1());
        studentScoreEntity.setScore2(inputDto.getScore2());
        scoreRepository.save(studentScoreEntity);
        return "Add score success";
    }
    public Double calculateScore (double score1, double score2){
        return 0.3 * score1 + 0.7 * score2;
    }


    public String ConvertScoreToGrade(double score) {
        String grade = "";
        if (score >= 8.0 && score < 10){
            grade ="A";
        }
        if (score >= 6.0 && score < 7.9)  {
            grade ="B";
        }
        if (score >= 4.0 && score < 5.9)  {
            grade ="D";
        }
        if (score < 4.0)  {
            grade ="F";
        }
        return grade;
    }
}
