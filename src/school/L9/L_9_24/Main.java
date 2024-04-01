package school.L9.L_9_24;

public class Main {
    public static void main(String[] args) {
        gora(152);

    }

    private static void gora(int a) {
        if(a < 0){
            a = -a;
        }
        int a1 = a/100;
        int a2 = (a/10)%10;
        int a3 = a%10;
        if(a1 < a2 && a3 < a2){
            System.out.println("Гора");
        }else {
            System.out.println("Нет");
        }
    }
}
