package school.L9.L_9_5;



//  10 11  12
//   7  8   9
//   4  5   6
//   1  2   3
public class Main {
    public static void main(String[] args) {

        func(1);
        func(2);
        func(3);
        func(4);
        func(5);
        func(6);
        func(7);
        func(8);
        func(9);
        func(0);






//        System.out.println();
//
//        System.out.println(1/3);
//        System.out.println(2/3);
//        System.out.println(3/3);
//
//        System.out.println();
//
//        System.out.println(4/3);
//        System.out.println(5/3);
//        System.out.println(6/3);
//
//        System.out.println();
//        System.out.println(7/3);
//        System.out.println(8/3);
//        System.out.println(9/3);
//
//        System.out.println();
//        System.out.println(10/3);
//        System.out.println(11/3);
//        System.out.println(12/3);

    }

    private static void func(int i) {
        int mesto = i%3;
        int etag = i/3;

        if(i == 0){
            System.out.println("Квартиру с номером 0 нет");

        }else {
            if (mesto == 1){
                System.out.println("Номер квартиры - " + i);
                System.out.println("Квартира слева");
                etag = etag + 1;
                System.out.println("Этаж квартиры - " + etag);
                System.out.println();
            } else if (mesto == 2) {
                System.out.println("Номер квартиры - " + i);
                System.out.println("Квартира в центре");
                etag = etag + 1;
                System.out.println("Этаж квартиры - " + etag);
                System.out.println();
            }else if(mesto == 0){
                System.out.println("Номер квартиры - " + i);
                System.out.println("Квартира справа");
                System.out.println("Этаж квартиры - " + etag);
                System.out.println();
            }else {
                System.out.println("Номер квартиры - " + i);
                System.out.println("Место квартиры неизвестно");
                System.out.println("Этаж квартиры - неизвестно");
                System.out.println();
            }
        }




    }
}
