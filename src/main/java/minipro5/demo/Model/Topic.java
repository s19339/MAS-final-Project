package minipro5.demo.Model;

import lombok.*;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Topic {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long topic_id;

    //Composition
    //Assignment -topic
    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id" ,nullable = false ,updatable = false)
    private Assignment owner;

    @NotBlank
    private String name;
    @NotBlank
    private String description;



}
