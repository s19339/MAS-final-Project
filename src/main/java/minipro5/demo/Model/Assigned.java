package minipro5.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id" , "assignment_id"})
})
public class Assigned {

    //Association with and attribute
    //Student-Assigned-Assignment

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long assigned_id;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "student_id" , nullable = false)
    private Student student;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "assignment_id", nullable = false)
    private Assignment assignment;

    @NotBlank
    private LocalDate startDate;

    @NotBlank
    private LocalDate endDate;

}
