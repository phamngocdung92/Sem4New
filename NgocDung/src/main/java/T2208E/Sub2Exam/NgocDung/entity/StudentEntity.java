package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/*
create table student_t (
student_id int auto_increment primary key,
student_code varchar(20) not null,
full_name varchar(100) not null,
address varchar(255)
);
* */
@Entity
@Getter
@Setter
@Table(name = "student_t")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    @Column(name = "student_code")
    private String student_code;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "student")
    private StudentScoreEntity scores;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_code() {
        return student_code;
    }

    public void setStudent_code(String student_code) {
        this.student_code = student_code;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentScoreEntity getScores() {
        return scores;
    }

    public void setScores(StudentScoreEntity scores) {
        this.scores = scores;
    }
}
