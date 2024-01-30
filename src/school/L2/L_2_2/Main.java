package school.L2.L_2_2;

public class Main {
    public static void main(String[] args) {
//        String s = "Hello, friend!";
//        int lng = s.length();
//        for (int i = 0; i < lng; i++) {
//            System.out.print(s.charAt(i) + "-");
//        }
//
//        System.out.print("H-e-l-l-o-,-f-r-i-e-n-d!");
        String s1 = "Hello";
        String s2 = "friend";
        int lng1 = s1.length();
        int lng2 = s2.length();
        for (int i = 0; i < lng1; i++) {
            System.out.print(s1.charAt(i) + "-");
        }
        System.out.print(",");
        for (int i = 0; i < lng2; i++) {
            System.out.print("-" + s2.charAt(i));
        }
        System.out.print("!");


    }
}
