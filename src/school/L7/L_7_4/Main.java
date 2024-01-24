package school.L7.L_7_4;

public class Main {
    public static void main(String[] args) {
        print(165);
        print(5555);

    }

    private static void print(int x) {
        int a = x % 100;
        if (x == a){
            System.out.println("Ok");
        }else {
            System.out.println("No");

        }
    }
}
