package minipro5.demo.Model;

import lombok.*;
import org.aspectj.lang.annotation.Before;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Bus {
//basic class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Cannot be null")
    @Size(min = 2 , max = 250)
    private String name;

    @NotBlank(message = "Cannot be null")
    @Size(min = 2 , max = 250)
    private String model;

    @Min(10)
    private Double cost;

    @OneToMany(mappedBy = "UsesBus", fetch = FetchType.LAZY)  //basic association
    @Builder.Default                                          //person-bus
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Person> person = new HashSet<>();

}
