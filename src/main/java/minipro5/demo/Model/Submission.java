package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id" , "qualification_id"})
})

public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long submission_id;

    //Student-submission-qualification

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "qualification_id", nullable = false)
    private Qualification qualification;

    @NotBlank
    private String FileName;

    @NotBlank
    private String Certificates;
}


