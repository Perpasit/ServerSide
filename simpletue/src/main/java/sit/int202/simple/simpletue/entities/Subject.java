package sit.int202.simple.simpletue.entities; //represent from database

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Subject {
    private String id;
    private String title;
    private double credit;
}
