package school.L9.L_9_21;

public class Main {
    public static void main(String[] args) {
        lock(45632);
        lock(3601);
        lock(3702);

    }

    private static void lock(int second) {
        int min;
        int sec;
        int hour;
        if(second > 3600 * 24){
            System.out.println("Расчет не производится");
        }else {
            hour = second / 3600;
            min = (second % 3600) / 60;
            sec = (second % 3600) % 60;
            System.out.println("Часов - " + hour + " Минут - " + min + " " + "Секунд - " + sec);
        }

    }
}
