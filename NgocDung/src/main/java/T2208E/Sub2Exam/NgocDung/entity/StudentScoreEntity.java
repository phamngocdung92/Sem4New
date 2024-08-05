package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/*
* student_score_id int auto_increment primary key,
student_id int,
subject_id int,

Enterprise Application Development in Java EE – Set01 Practical Paper 2/3

Enterprise Application Development in Java EE - SET01

score1 decimal(5,2),
score2 decimal(5,2),
constraint fk_student_id foreign key (student_id) references
student_t(student_id),
constraint fk_subject_id foreign key (subject_id) references
subject_t(subject_id)
* */
@Entity
@Getter
@Setter
@Table(name = "student_score_t")
public class StudentScoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_score_id;
    private int student_id;
    private int subject_id;
    private double score1;
    private double score2;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private SubjectEntity subject;

    public int getStudent_score_id() {
        return student_score_id;
    }

    public void setStudent_score_id(int student_score_id) {
        this.student_score_id = student_score_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public SubjectEntity getSubject() {
        return subject;
    }

    public void setSubject(SubjectEntity subject) {
        this.subject = subject;
    }
}
