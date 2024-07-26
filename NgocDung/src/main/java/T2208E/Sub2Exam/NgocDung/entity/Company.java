package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String companyName;
    private Long corporationId;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;

    @ManyToOne
    @JoinColumn(name = "corporationId")
    private Corporation corporation;

    @OneToMany(mappedBy = "company")
    private List<Department> departments;
}
