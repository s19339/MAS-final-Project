package minipro5.demo.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Student extends Person {

    //inheritance
    //person-student-teacher
    @ElementCollection
    @CollectionTable(name = "student_subjects", joinColumns = @JoinColumn(name = "student_id"))
    @Builder.Default
    private Set<String> subject = new HashSet<>();

    @Min(1)
    private int year;

    //Association with and attribute
    //Student-Assigned-Assignment
    @OneToMany(mappedBy = "student" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Assigned> assigned;

    @OneToMany(mappedBy = "makeChanges" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Change> changes;


    //Association with and attribute
    //Student-submission-qualification
    @OneToMany(mappedBy = "student" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Submission> submissions;


    //Student-registration-program
    @OneToMany(mappedBy = "student" , cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Registration> registration;

}
