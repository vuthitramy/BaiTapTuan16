package BaiThucHanh2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}

/**Dòng đầu tiên in ra `Nhập đường dẫn file:` trên console để yêu cầu người dùng nhập đường dẫn đến file text.
 Dòng thứ hai đọc đường dẫn được nhập từ bàn phím bằng Scanner và lưu vào biến `path`.
 Dòng thứ ba tạo một đối tượng `ReadFileExample` mới (giả sử rằng đây là một lớp của bạn trong ứng dụng) và lưu nó vào biến `readfileEx`.
 Dòng cuối cùng gọi phương thức `readFileText` của đối tượng `readfileEx` để đọc file text theo đường dẫn đã nhập.**/