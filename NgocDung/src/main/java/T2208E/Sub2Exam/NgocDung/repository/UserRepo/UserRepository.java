package T2208E.Sub2Exam.NgocDung.repository.UserRepo;

import T2208E.Sub2Exam.NgocDung.dto.UserDTO;
import T2208E.Sub2Exam.NgocDung.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
