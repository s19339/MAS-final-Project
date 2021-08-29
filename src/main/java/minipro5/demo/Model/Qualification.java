package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long qualification_id;

    @NotBlank
    private Integer minPercentage;

    @Min(0)
    private String description;

    //Association with and attribute
    //Student-Submission-Qualifaction
    @OneToMany(mappedBy = "qualification" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Submission> submission;

//    @NotBlank
//    @ManyToOne
//    @JoinColumn(name = "program_id", nullable = false)
//    private Program program;

}
