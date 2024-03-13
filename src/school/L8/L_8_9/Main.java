package school.L8.L_8_9;

public class Main {
    public static void main(String[] args) {
        func(1, 2);
    }

    private static void func(int a, int b) {
        int c;
        if (a % 2 != 1) {
            b = a / 2;
            c = (a + b) % 10;
            System.out.println(a + b + c);
        } else {
            b = a / 2 + 1;
            c = (a * b) % 10;
            System.out.println(c - a - b);
        }


    }
}
