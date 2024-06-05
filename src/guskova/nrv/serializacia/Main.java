package guskova.nrv.serializacia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        // Серриализация - это сохраниение в фаил объекта. его данные. поля()

//        // создадим экземпляр класса сохраненной игры
//        GameProgress gameProgress = new GameProgress(94, 10, 2, 254.32);
//
//        // откроем выходной поток для записи в файл
//        try (FileOutputStream fos = new FileOutputStream("save.dat");
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//
//            // запишем экземпляр класса в файл
//            oos.writeObject(gameProgress);
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

        // десириализация

        GameProgress gameProgress = null;
        // откроем входной поток для чтения файла
        try (FileInputStream fis = new FileInputStream("save.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            // десериализуем объект и скастим его в класс
            gameProgress = (GameProgress) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(gameProgress);


    }


}
