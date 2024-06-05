package guskova.nrv.potokivoda.posimvolno;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MAin {
    public static void main(String[] args) {
//        String text = "Hello World";
//
//        try (FileWriter writer = new FileWriter("notes1.txt", false)) { // true - будет дописываться в фаил
//
//            // запись всей строки
//            writer.write(text);
//
//            // запись по символам
//            writer.append('\n');
//            writer.append('!');
//
//            // дозаписываем и очищаем буфер
//            writer.flush();
//
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


        //*********************************************************************************

        //Чтение символов

//        try (FileReader reader = new FileReader("notes1.txt")) {
//            // читаем посимвольно
//            int c;
//            while ((c = reader.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


        //***************---Чтение-----//******************************************************************

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("notes.txt"), StandardCharsets.UTF_8))) {

            String s;
            while ((s = br.readLine()) != null) {
                System.out.print(s);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //******************************************************************

        // Запись

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            String text = "Hello World!";
            bw.write(text);
            bw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //******************************************************************

        // Чтение из буфера

        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
            //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



    }//end psvm
}//end class
