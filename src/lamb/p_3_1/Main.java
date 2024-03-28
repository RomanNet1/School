package lamb.p_3_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Artist a1 = new Artist("London");
        Artist a3 = new Artist("London");
        Artist a2 = new Artist("Africa");

        List<Artist> list = new ArrayList<>();

        list.add(a1);
        list.add(a2);
        list.add(a3);

        int count = 0;

        for (Artist artist : list
        ) {
            if (artist.isFrom("London")) {
                count++;
            }

        }

        System.out.println(count);


    }
}
