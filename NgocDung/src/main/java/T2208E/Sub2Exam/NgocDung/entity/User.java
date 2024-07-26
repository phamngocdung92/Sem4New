package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private String userName;
    private String firstName;
    private String lastName;
    private String address;
    private Long departmentId;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;
}
