package T2208E.Sub2Exam.NgocDung.service.StudentService;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqCreateStudent;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqShowScore;
import T2208E.Sub2Exam.NgocDung.dto.responseDto.pkgResStudent.ResShowStudentScore;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    String createStudent(ReqCreateStudent inputDto);
    ResShowStudentScore showStudentScore(ReqShowScore inputDto);
}
