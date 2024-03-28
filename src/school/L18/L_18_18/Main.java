package school.L18.L_18_18;

public class Main {
    public static void main(String[] args) {
        int doun = 10, up = 99, n = 10;

        //int[] m = new int[n];
        int[] m = {10, 56, 68, 74, 85, 96};
        fill(m, doun, up);
        write(m);
    }

    private static void write(int[] m) {
        int t = m.length / 2;
        for (int i = 0; i < t; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for (int i = m.length - 1; i >= m.length / 2; i--) {

            System.out.print(m[i] + " ");

        }
    }

    private static void fill(int[] m, int doun, int up) {
        for (int i = 0; i < m.length; i++) {
            int k = (int)(100 * Math.random());
            m[i] = doun + (int) ((up - doun + 1) * Math.random());
            if(k%2 == 0){
                m[i] = -m[i];
            }
        }
    }
}
