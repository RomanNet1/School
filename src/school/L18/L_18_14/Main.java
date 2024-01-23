package school.L18.L_18_14;

/*
* write(int[] m, int n) --- n может быть только 1 или 2
* 1 - первая половина чисел массива
* 2 - вторая половина массива
*
*
* */

public class Main {
    public static void main(String[] args) {
        int doun = 100, up = 999, n = 11;

        int[] m = new int[n];
        fill(m, doun, up);
        write(m, 3);     // первая половина массива
        write(m, 2);     // вторая половина массива

    }

    private static void write(int[] m, int n) {
        int a = (m.length % 2 == 0) ? 0 : 1; // проверям четный или нечетный массив
        switch (n) {
            case (1):
                for (int i = 0; i < (m.length / 2) + a; i++) {
                    System.out.print(m[i] + " ");
                }
                System.out.println();
                break;
            case (2):
                for (int i = m.length - m.length / 2; i < m.length; i++) {

                    System.out.print(m[i] + " ");

                }
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }

    private static void fill(int[] m, int doun, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = doun + (int) ((up - doun + 1) * Math.random());
        }
    }

}
