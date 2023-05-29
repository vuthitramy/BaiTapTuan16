package BaiThucHanh1;

import java.io.File;
import java.io.IOException;

public class main1 {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        file.createNewFile();
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }
}
