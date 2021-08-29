package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fee_id;

    @Min(0)
    private Double amount;

    @Min(0)
    private Double extraCharges;

    @OneToOne
    @MapsId
    @JoinColumn(name = "program_id")
    private Program program;
}
