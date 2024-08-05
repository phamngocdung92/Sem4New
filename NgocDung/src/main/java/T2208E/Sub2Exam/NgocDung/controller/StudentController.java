package T2208E.Sub2Exam.NgocDung.controller;

import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqAddScoreStudent;
import T2208E.Sub2Exam.NgocDung.dto.requestDto.pkgReqStudent.ReqCreateStudent;
import T2208E.Sub2Exam.NgocDung.service.ScoreService.ScoreService;
import T2208E.Sub2Exam.NgocDung.service.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/create")
    public ResponseEntity<?> createStudent(@RequestBody ReqCreateStudent inputDto ) {
        return ResponseEntity.ok(studentService.createStudent(inputDto));
    }
    @PostMapping("/addScore")
    public ResponseEntity<?> addScore(@RequestBody ReqAddScoreStudent inputDto ) {
        return ResponseEntity.ok(scoreService.addScore(inputDto));
    }
}
