package T2208E.Sub2Exam.NgocDung.service.ScoreService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqAddScoreStudent;
import org.springframework.stereotype.Service;

@Service
public interface ScoreService {
    String addScore (ReqAddScoreStudent inputDto);
    Double calculateScore (double score1, double score2);
    String ConvertScoreToGrade (double score);
}
