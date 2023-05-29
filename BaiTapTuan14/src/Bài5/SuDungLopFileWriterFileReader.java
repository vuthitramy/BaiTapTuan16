package Bài5;
import java.io.*;

public class SuDungLopFileWriterFileReader {
    public static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static boolean writeFile(String path, String content) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(content);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\IdeaProjects\\BaiTapTuan14\\test.txt";
        String content = "Hello, world!\nThis is a test file.\n";
        boolean success = writeFile(path, content);
        if (success) {
            System.out.println("Write file successfully!");
            String readContent = readFile(path);
        } else {
            System.out.println("Write file error!");
        }
    }
}
