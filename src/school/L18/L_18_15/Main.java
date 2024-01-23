package school.L18.L_18_15;

public class Main {
    public static void main(String[] args) {

        int doun = 100, up = 999, n = 10;
        int[] m = new int[n];

        fill(m, doun, up);
        write(m);
    }

    private static void write(int[] m) {

        for (int i = 0; i < m.length; i += 2) {
            System.out.print(m[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < m.length; i += 2) {

            System.out.print(m[i] + " ");

        }
    }

    private static void fill(int[] m, int doun, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = doun + (int) ((up - doun + 1) * Math.random());
        }
    }
}
