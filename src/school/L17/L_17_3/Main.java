package school.L17.L_17_3;

public class Main {
    public static void main(String[] args) {
        int x = what(7,3);
        int x1 = what(14,35);
        int x11 = what(5,3);

        int x2 = what1(7,3);
        int x3 = what1(14,35);
    }

    private static int what(int a, int b) {
        while (a!=b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println(a);
        return a;

    }

    private static int what1(int a, int b) {
        while (a!=b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println(b);
        return b;
    }
}
