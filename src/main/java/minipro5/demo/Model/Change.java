package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Change {
    //basic class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long change_id;


    @NotBlank
    private Date date;

    @Min(0)
    private String type;

    @NotBlank
    private String reason;

    @ManyToOne
    @JoinColumn(name ="student_id") //basic association
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Student makeChanges;
}
