import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            File file = new File("my.txt");
            FileOutputStream fos = new FileOutputStream(file);
            String data = " Xin Chao ";
            fos.write(data.getBytes());
            FileInputStream fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1){
                System.out.print((char) content);
            }
            fis.read(fis.readAllBytes());
            fis.close();
            fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
