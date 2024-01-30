package uchebnikTeoria;

public class Test {
    public static void main(String[] args) {
//        getLastChar("qwerty");
//        int[] arr = new int[] {10,20,30};
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (int arr1 : arr) {
//            System.out.println(arr1);
//        }
//
//        var email = " SupporT@hexlet.io\n";
//        email = email.trim();
//        System.out.println(email);

//        var name = "?????How much is the fish?";
//        name = name.replace("?", "");
//        System.out.println(name);

        String a =  getHiddenCard("1234567812345678");
        System.out.println(a);


    }

    private static void getLastChar(String text) {
        System.out.println(text.charAt(text.length() - 1));
    }


    public static String getHiddenCard(String in, int num) {
        String result = "*".repeat(num) + in.substring(12);
        return result;
    }

    public static String getHiddenCard(String in) {
        String result = "*".repeat(4) + in.substring(12);

        return result;
    }
}
