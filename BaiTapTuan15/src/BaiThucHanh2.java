import javax.lang.model.element.Name;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BaiThucHanh2 {
    public static boolean writeData (String data,String fileName){
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(data.getBytes());
            fos.close();
            return true;
        }catch ( IOException e ){
            e.printStackTrace();
            return false;
        }

    }
    public static String readData(String fileName){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            byte[] buffer = new byte[1024];
            int lenght = fis.read(buffer);
            String resultData = new String(buffer,0 , lenght);
            fis.close();
            return resultData;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        String data = "This is sample data to be written into the file.";
        String fileName ="data.dat";
        boolean success = writeData(data,fileName);
        System.out.println("Data written successfully?" + success);
        String resultData = readData(fileName);
        if (resultData != null){
            System.out.println("Data read from file: " + resultData);
        } else {
            System.out.println("Error reading data from file.");
        }
        }
    }

