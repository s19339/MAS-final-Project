package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long course_id;

    @Min(0)
    private String courseName;

    @NotBlank
    private double credit;

    @NotBlank
    private int semester;

    @ManyToOne
    @JoinColumn(name = "program_id") //basic association
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Program program;

    @ManyToOne
    @JoinColumn(name = "teacher_id") //basic association
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Teacher course;
}
