package T2208E.Sub2Exam.NgocDung.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/*
* subject_id int auto_increment primary key,
subject_code varchar(20) not null,
subject_name varchar(100) not null,
credit int not null
* */
@Entity
@Getter
@Setter
@Table(name = "subject_t")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subject_id;
    @Column(name = "subject_code")
    private String subject_code;
    @Column(name = "subject_name")
    private String subject_name;
    @Column(name = "credit")
    private int credit;
    @OneToMany(mappedBy = "subject")
    private StudentScoreEntity scores;

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public StudentScoreEntity getScores() {
        return scores;
    }

    public void setScores(StudentScoreEntity scores) {
        this.scores = scores;
    }
}
