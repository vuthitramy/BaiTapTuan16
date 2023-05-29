import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BaiThucHanh1 {
    public static void main(String[] args) {
        try{
//tạo file person.dat
            File file = new File("person.dat");
            FileOutputStream fos = new FileOutputStream(file);
            String data = "Hello world";
            fos.write(data.getBytes());
            FileInputStream fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1){
                System.out.println((char) content);
            }
            fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = fis.read(buffer)) != -1){
                System.out.println(new String(buffer, 0,lenght));
            }
            fos.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();


        }
    }
}

