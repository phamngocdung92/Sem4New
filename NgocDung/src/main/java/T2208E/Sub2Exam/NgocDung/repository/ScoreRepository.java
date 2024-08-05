package T2208E.Sub2Exam.NgocDung.repository;

import T2208E.Sub2Exam.NgocDung.entity.StudentEntity;
import T2208E.Sub2Exam.NgocDung.entity.StudentScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<StudentScoreEntity, Integer>{
}
