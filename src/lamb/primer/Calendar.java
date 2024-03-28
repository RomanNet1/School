package lamb.primer;

import java.time.LocalDate;

public class Calendar implements RunRun{
    @Override
    public void run() {
        var date = LocalDate.now();
        System.out.println("Сегодня " + date.getDayOfWeek());
    }
}
