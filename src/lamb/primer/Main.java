package lamb.primer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Timer timer = new Timer();
//        timer.run();
//
//        RunRun r = new Calendar();
//        r.run();

        ArrayList<RunRun> list = new ArrayList<>();

        list.add(new Timer());
        list.add(new Calendar());

        for(RunRun element: list){
            element.run();
        }



    }
}
