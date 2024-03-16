package school.L9.L_9_2;

public class Main {
    public static void main(String[] args) {

        print(20, 31);
        print(6, 100);
        print(28, 8);
        print(10, 10);
        print(10, 1);

    }

    public static void print(int a, int b){
        boolean c = a > 10 || b > 100;
        System.out.println(c);
    }
}
