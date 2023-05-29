package Bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataToATextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            // khai báo đường dẫn đến file cần ghi và đọc
            String filePath = "C:\\Users\\Admin\\IdeaProjects\\BaiTapTuan14\\demo.txt";

            // nhập dữ liệu từ bàn phím và ghi vào file
            System.out.println("Nhập dữ liệu:");
            String data = scanner.nextLine();
            fw = new FileWriter(filePath);
            fw.write(data);

            // đọc dữ liệu từ file và hiển thị ra màn hình
            FileReader fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fw != null) fw.close();
                scanner.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
