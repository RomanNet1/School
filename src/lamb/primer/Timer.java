package lamb.primer;

import java.time.LocalTime;

public class Timer implements RunRun{

    @Override
    public void run() {
        System.out.println(LocalTime.now());
    }
}
