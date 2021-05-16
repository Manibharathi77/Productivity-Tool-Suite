package Controller;

import Domain.TimerFormat;
import TimerRepo.TimerFormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PomodoroController {

    TimerFormatRepository timerFormatRepository;

    @Autowired
    PomodoroController(TimerFormatRepository timerFormatRepository){
        this.timerFormatRepository = timerFormatRepository;
    }

    @PostMapping(path = "/count/save")
    public TimerFormat saveTiming(@RequestBody TimerFormat timerFormat){
        return timerFormatRepository.save(timerFormat);
    }

    @GetMapping(path = "/timers/getAll")
    public List<TimerFormat> getAllTimers(){
        return timerFormatRepository.findAll();
    }

}
