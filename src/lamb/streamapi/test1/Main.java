package lamb.streamapi.test1;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Log> logs = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 5),
                new Log("Береза карликовая", 5)
        );

        Stream<Log> stream = logs.stream();

        Stream<Log> filteredStream = stream.filter(x -> x.getCount()<7)
                .filter(x -> !"Дуб монгольский".equalsIgnoreCase(x.getType()));

        filteredStream.forEach(x -> System.out.println(x.getType()));



    }
}
