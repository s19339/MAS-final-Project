package minipro5.demo.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Session {
    //basic class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long session_id;


    @NotBlank
    private int sessionCode;

    @NotBlank
    private LocalDate fromDate;


    @NotBlank
    private LocalDate toDate;


    @ManyToOne
    @JoinColumn(name ="registration_id") //basic association
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Registration registration;
}
