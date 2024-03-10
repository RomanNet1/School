package school.L17.L_17_1;

public class Main {
    public static void main(String[] args) {
        double r1;
        int x1, x2, b1, b2;
        int x14 = 0;

        //1
        x2 = fun1(x14, 11/12); // ошибка, не объявлена переменная x14

        //2
        //fun1(5.9/3,0); // ошибка, первый параметр должен быть int

        //3
//        if(fun1(7, x1) > 0){ // ошибка, второй параметр должен быть  double
//            r1 = 7;
//        }

        //4
//        if(fun1(7, x1) == b1){ // ошибка,
//            fun2 = 7;
//        }

        //5
//        b1 = fun1(fun2(b2), r1){ // ошибка, не инициализированны переменные
//
//        }

        //6
        //System.out.println(fun2(x1 > x2)); // ошибки, неправильно параметры

        //7
        //System.out.println(fun2(b1 - b2)); // ошибка, не инициализированны переменные
    }

    static int fun1(int x, double y){
        return 0;
    }
    static int fun2(int b){
        return 0;
    }
}
