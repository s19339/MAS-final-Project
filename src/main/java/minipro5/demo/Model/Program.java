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
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long program_id;

    @NotBlank
    private String name;

    @Min(0)
    private String semester;

    @NotBlank
    private Integer duration;

    //Association with and attribute
    //Student-registration-program

    @OneToMany(mappedBy = "program" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Registration> registrations;


    @ManyToOne
    @JoinColumn(name ="qualification_id") //basic association
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Qualification qualification;

    @OneToMany(mappedBy = "program" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Course> courses;

    @OneToOne(mappedBy = "program", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Fee fees;


}
