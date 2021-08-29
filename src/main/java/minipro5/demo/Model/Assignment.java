package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Assignment {

    //Association with and attribute
    //Student-Assigned-Assignment

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long assignment_id;

    @NotBlank
    private String topic;

    @Min(0)
    private double minWords;

    //Association with and attribute
    //Student-Assigned-Assignment
    @OneToMany(mappedBy = "assignment" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Assigned> assigned;

    //Composition
    //Assignment -topic
    @OneToMany(mappedBy = "owner" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Topic> topics = new HashSet<>();
}
