package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String departmentName;
    private Long companyId;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;

    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;

    @OneToMany(mappedBy = "department")
    private List<User> users;
}
