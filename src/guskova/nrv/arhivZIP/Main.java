package guskova.nrv.arhivZIP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {

        //архивация

//        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("zip_out.zip"));
//            FileInputStream fis = new FileInputStream("notes.txt")) { //new FileInputStream("notes.txt") - создаем фаил(поток скорее) из которого будем считывать
//
//            ZipEntry entry = new ZipEntry("packed_notes.txt"); // данные фаил будем архивировать
//            zout.putNextEntry(entry);
//
//            //считываем содержимое файла в массиве byte
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//
//            // добавляем содержимое к архиву
//            zout.write(buffer);
//
//            //закрываем текущюю запись для новой записи
//            zout.closeEntry();
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//
//        }

        //*****************************************************************************

        // разархивировать

        try (ZipInputStream zin = new ZipInputStream(new
                FileInputStream("zip_out.zip"))) {
            ZipEntry entry;
            String name;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName(); // получим название файла
                // распаковка
                FileOutputStream fout = new FileOutputStream(name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



    }//psvm
}
