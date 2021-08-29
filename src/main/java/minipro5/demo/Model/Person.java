package minipro5.demo.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@SuperBuilder

public abstract class Person {

    //inheritance
    // person- teacher- student

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long person_id;

    @NotBlank(message = "Cannot be null")
    @Size(min = 2 , max = 250)
    private String firstName;

    @NotBlank(message = "Cannot be null")
    @Size(min = 2 , max = 250)
    private String lastName;

    @NotBlank(message = "Cannot be null")
    @Size(min = 2 , max = 250)
    private String address;

    @ManyToOne
    @JoinColumn(name ="Bus_id") //basic association
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Bus UsesBus;

}
