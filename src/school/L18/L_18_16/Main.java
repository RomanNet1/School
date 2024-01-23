package school.L18.L_18_16;

public class Main {
    public static void main(String[] args) {

        int doun = 10, up = 99, n = 10;
        int[] m = new int[n];

        fill(m, doun, up);
        write(m);
    }

    private static void write(int[] m) {
        String text1 = ""; // для четных
        String text2 = ""; // нечетные

        // 1 второй вариант

//        for (int i = 0; i < m.length; i++) {
//            if(m[i]%2==0){
//                System.out.print(m[i] + " ");
//            }
//        }
//
//        System.out.println();
//
//        for (int i =0; i < m.length; i ++) {
//            if(m[i]%2!=0){
//                System.out.print(m[i] + " ");
//            }
//        }

        // 2 второй вариант

        for (int i = 0; i < m.length; i++) {
            if (m[i] % 2 == 0) {
                text1 = text1 + " " + m[i];
            } else {
                text2 = text2 + " " + m[i];
            }
        }
        System.out.println(text1 + "\n" + text2);

    }

    private static void fill(int[] m, int doun, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = doun + (int) ((up - doun + 1) * Math.random());
        }
    }
}
