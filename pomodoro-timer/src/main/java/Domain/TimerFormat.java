package Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TimerFormat {

    // id, user, time, type(enum), started(boolean), timeStarted (timestamp)

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int timeRemaining;
    // will be changed to user type
    private String user;
    private boolean started;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStarted;
    @Enumerated(value = EnumType.STRING)
    private Type type;

public enum  Type{

    taskTime,
    longBreak,
    shortBreak;

}

}
