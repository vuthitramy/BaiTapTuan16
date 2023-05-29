package Bài1;

import java.io.FileReader;
import java.io.IOException;

public class main3 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("demo.txt");

            int c;
            while ((c = fr.read()) != -1){
                System.out.println((char) c);

            }

            fr.close();
        }catch (IOException e){
            System.out.println("không thể đọc file.");
        }
    }
}


/**Cau 2: lớp FileReadẻ được kês thừa từ lớp inputStreamReader và được kê sthuwaf từ titerface closeable
 * caau3:muc dich cua lop filereader duoc dung de doc ki tu trong file
 * cau4: co 3 phuong thuc khoi tao
 * cau5: thuong dung nhung phuong thuc close,read
 * **/
