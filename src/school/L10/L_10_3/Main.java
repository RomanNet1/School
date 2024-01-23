package school.L10.L_10_3;

public class Main {
    public static void main(String[] args) {
        int a, b, down = -9, up = 9;
        a = down + (int)( (up - down + 1) * Math.random());
        b = down + (int)( (up - down + 1) * Math.random());
        System.out.println(a + " " + b);
        if(a > b){
            System.out.println("Большее = " + a);
        }
        if(b > a){
            System.out.println("Большее = " + a);
        }
        if(a > b){
            System.out.println("Меньше = " + b);
        }
        if(b>a){
            System.out.println("Меньше = " + a);
        }
    }
}
