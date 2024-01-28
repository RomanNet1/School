package school.L8.L_8_4;

public class Main {
    public static void main(String[] args) {
        print(59);
        print(8);
        print(21);
        print(20);
        print(0);
    }

    private static void print(int x) {
        int t;
        if(x/10 >= 5){
            t = 20;
        }else {
            t = 0;
        }
        System.out.println(t);
    }
}
