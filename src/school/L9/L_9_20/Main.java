package school.L9.L_9_20;

public class Main {
    public static void main(String[] args) {
        lock(70);
        lock(4000);
        lock(205);

    }

    private static void lock(int second) {
        int min;
        int sec;
        if(second > 3600){
            System.out.println("Расчет не производится");
        }else {
            min = second / 60;
            sec = second % 60;
            System.out.println("Минут - " + min + " " + "Секунд - " + sec);
        }

    }
}
