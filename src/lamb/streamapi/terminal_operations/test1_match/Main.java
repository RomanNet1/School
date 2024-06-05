package lamb.streamapi.terminal_operations.test1_match;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list2 = Arrays.asList("Moscow", "NY", "Tokyo", "NY", "Tokyo", "1", "2", "one");

        boolean anyMatch = list2.stream()
                .anyMatch(val -> val.startsWith("o")); // ищем если где нибудь "o"
        System.out.println(anyMatch);

        List<String> list3 = Arrays.asList("Moscow", "NY", "Tokyo", "NY", "Tokyo", "1", "2", "one");

        boolean allMatch = list3.stream()
                .allMatch(val -> val.startsWith("o")); // ищем если есть  "o" во всех лементах
        System.out.println(allMatch);
    }
}
