package school.L8.L_8_6;

public class Main {
    public static void main(String[] args) {
        func(10, 11);
        func(-5, 10);
        func(12, 6);
        func(6, 12);
        func(7, 7);
        func(14, 14);
        func(9, 18);

    }

    private static void func(int a, int b) {
        double x;
        if(a!=b){
             x = a/2 + b;

        }else {
             x = b/2 + a;
        }
        if(x < 15){
            System.out.println("X = " + x);
        }else {
            System.out.println(x);
        }
    }
}
