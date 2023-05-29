package Bai4;

import java.io.File;
import java.io.IOException;

public class SuDungLopFile {
    public static void main(String[] args) {
        try {
            File fileObj = new File("newFile.txt");
            if (fileObj.createNewFile()) {
                System.out.println("File được tạo thành công.");
            } else {
                System.out.println("File đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Đã có lỗi xảy ra.");
            e.printStackTrace();
        }
    }
}
