package minipro5.demo.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder

public class Teacher extends Person {

    //inheritance
    @NotBlank(message = "Cannot be null")
    @Size(min = 2 , max = 250)
    private String subjectTeaching;

    @Min(500)
    private Double salary;

    @OneToMany(mappedBy = "course" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Course> courses;

}