package guskova.nrv.potokivoda_vivoda;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // -------- создание папки---------------------------------------------------------------------//
 /*       //File dir1 = new File("SomeDir");// dir1.mkdir() - создание папки

//        if(dir1.mkdir()){
//            System.out.println("Папка " + dir1.getName() + " создана");
//        }else {
//            System.out.println("Папка " + dir1.getName() + " НЕ создана");
//        }
*/
// -------- переименование папки----------------------------------------------------------------//
/*
//        File newDir1 = new File("NewDir");
//
//        if(dir1.renameTo(newDir1)){
//            System.out.println("Папка " + dir1.getName() + " переименована");
//        }else {
//            System.out.println("Папка " + dir1.getName() + " НЕ переименована");
//        }
*/
// -------- удаление папки----------------------------------------------------------------------//
 /*
//        if(newDir1.delete()){
//            System.out.println("Папка " +newDir1.getName() + " удалена");
//        }else {
//            System.out.println("Папка " + newDir1.getName() + " НЕ удалена");
//        }

*/
// -------- создание фаила ---------------------------------------------------------------------//


//        File file = new File("hello_new.txt");
//
////        if(file.createNewFile()){
////            System.out.println("Фаил " + file.getName() + " создан");
////        }else {
////            System.out.println("Папка " + file.getName() + " НЕ создан");
////        }
//
//        /*----------------*/
//
//        if (file.exists()) {
//            System.out.println("Фаил существует");
//        } else {
//            System.out.println("Фаил не существует");
//        }
//
//        /*----------------*/
//
//        if (file.canRead()) {
//            System.out.println("Фаил доступен для чтения");
//        } else {
//            System.out.println("Фаил не доступен для чтения");
//        }
//
//        /*----------------*/
//
//        if (file.canWrite()) {
//            System.out.println("Фаил доступен для записи");
//        } else {
//            System.out.println("Фаил не доступен для записи");
//        }
//
//        /*----------------*/
//
//        System.out.println(file.lastModified());
//        System.out.println(file.length());


        // -------- проверка пути, фиил или директория ----------------------------------------------------------------------//

        //определяем объект для каталога
        File dir2 = new File("src/main/java");
        //если объект представляет каталог
        if (dir2.isDirectory()) {
            //получаем все вложенные объекты в каталоге
            for (File item : dir2.listFiles()) {
                //проверяем является ли объект каталогом
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " - каталог");
                } else {
                    System.out.println(item.getName() + " - фаил");
                }
            }
        }


    }
}


//        File file1 = new File("SomeDir", "hello.txt");
//        File file2 = new File(dir1, "hello2.txt");