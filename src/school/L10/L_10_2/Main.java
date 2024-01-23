package school.L10.L_10_2;

public class Main {
    public static void main(String[] args) {
        int x = random(-9,9);
        int y = random(-9,9);

        System.out.println(x + " " + y);

        if(x > y){
            System.out.println("Первое число больше");
        }
        if(x < y){
            System.out.println("Второе число больше");
        }
        if(x == y){
            System.out.println("Числа равны");
        }

    }

    public static int random(int a, int b){
        return  a + (int)(Math.random() * (b - a + 1));
    }
}
