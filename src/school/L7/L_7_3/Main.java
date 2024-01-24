package school.L7.L_7_3;

public class Main {
    public static void main(String[] args) {

        print(2, 6);
        print(4, 4);
        print(9, 2);
        print(4, 9);
        print(3, 9);
        print(6, 0);
    }
    public static void print(int a, int b){
        if(a%3 == b%4){
            System.out.println(a - b);
        }else {
            System.out.println(b - a);
        }
    }
}
