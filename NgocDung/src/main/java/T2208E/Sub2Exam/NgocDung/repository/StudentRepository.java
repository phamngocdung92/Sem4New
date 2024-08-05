package T2208E.Sub2Exam.NgocDung.repository;

import T2208E.Sub2Exam.NgocDung.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
