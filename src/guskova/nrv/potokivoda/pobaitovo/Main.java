package guskova.nrv.potokivoda.pobaitovo;


/* байовые потоки ввода вывода     */

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        String text = "Hello World!";
//
//        //Запись
//
//        try(FileOutputStream fos = new FileOutputStream("notes.txt")) {
//
//            //перевод строки в массив байтов
//            byte[] bytes = text.getBytes();
//
//            //запись байтов в фаил
//            fos.write(bytes,0,bytes.length); //запись с 0 позиции до конца , можно ис 5 начать
//
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//****************************************************************************************************
        //Чтение

//        try (FileInputStream fis = new FileInputStream("notes.txt")) {
//            int i;
//            //считываем фаил пока есть доступные байты
//            while ((i = fis.read()) != -1) {  // read() --- возвращает один байт
//                System.out.print((char) i);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        //****************************************************************************************************

        // Работа с буффером

//        String text = "Hello world!";
//
//        byte[] buffer = text.getBytes();
//
//        // создаем входной байтовый поток
//        // и передаем его в входной буферизированный поток
//        try (ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//             BufferedInputStream bis = new BufferedInputStream(in)) {
//            int c;
//            while ((c = bis.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//**********************************************************************************************************

        //Запись

        String text = "Hello world!";
        byte[] buffer = text.getBytes();

        try(FileOutputStream out = new FileOutputStream("notes.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out)) {
            //запись байтов в фаил
            bos.write(buffer,0,buffer.length);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
