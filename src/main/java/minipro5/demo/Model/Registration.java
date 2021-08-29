package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id" , "program_id"})
})

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registration_id;

    @NotBlank
    private LocalDate regDate;

    @NotBlank
    private Integer semester;

    @Min(0)
    private String verification;

    //Association with and attribute
    //Student-Submission-Qualifaction
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "student_id" , nullable = false)
    private Student student;

    //Student-registration-program
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "program_id", nullable = false)
    private Program program;

    @OneToMany(mappedBy = "registration" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Session> session;

}
