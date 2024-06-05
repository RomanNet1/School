package lamb.streamapi.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Tho");
        list.add("Three");
        Stream stream = list.stream();
        stream.forEach(System.out::println);


    }
}
