package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

//// create corporation table
//CREATE TABLE Corporation (
//        corporationId INT PRIMARY KEY AUTO_INCREMENT,
//        corporationName VARCHAR(100) NOT NULL,
//        createdBy INT,
//        createdTime DATETIME,
//        updatedBy INT,
//        updatedTime DATETIME,
//        );

@Entity
public class Corporation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long corporationId;
    private String corporationName;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;

    @OneToMany(mappedBy = "corporation")
    private List<Company> companies;
}
