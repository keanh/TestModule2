import java.io.IOException;
import java.util.Scanner;

public class Client {
    PhoneBook phoneBook = new PhoneBook();
    Scanner scanner = new Scanner(System.in);
    Function function = new Function();
    RegexEmail regexEmail = new RegexEmail();
    RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();

    public void test(){
        function.test();
    }

    public void checkRegexPhoneNumber(String phoneNumber){
        while(!regexPhoneNumber.validate(phoneNumber)){
            System.out.println("Số điện thoại không hợp lệ");
            System.out.println("Nhập lại số điện thoại");
            phoneNumber = scanner.nextLine();
        }
    }

    public void checkRegexEmail(String email){
        while(!regexEmail.validate(email)){
            System.out.println("Email không hợp lệ");
            System.out.println("Nhập lại email");
            email = scanner.nextLine();
        }
    }

    public void showList(){
        function.showList();
    }

    public void menu(){
        function.menu();
    }

    public void add(){
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        phoneBook.setName(name);
        System.out.println("Nhập số điện thoại");
        String phoneNumber = scanner.nextLine();
        while(!regexPhoneNumber.validate(phoneNumber)){
            System.out.println("Số điện thoại không hợp lệ");
            System.out.println("Nhập lại số điện thoại");
            phoneNumber = scanner.nextLine();
        }
        phoneBook.setPhoneNumber(phoneNumber);
        System.out.println("Nhập ngày sinh");
        String birthday = scanner.nextLine();
        phoneBook.setBirthday(birthday);
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        phoneBook.setAddress(address);
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        while(!regexEmail.validate(email)){
            System.out.println("Email không hợp lệ");
            System.out.println("Nhập lại email");
            email = scanner.nextLine();
        }
        phoneBook.setEmail(email);
        System.out.println("Nhập giới tính");
        String sex = scanner.nextLine();
        phoneBook.setSex(sex);
        function.add(phoneBook);
    }

    public void updatePhoneNumber(){
        System.out.println("Nhập số điện thoại cần sửa");
        String number = scanner.nextLine();
        while(!regexPhoneNumber.validate(number)){
            System.out.println("Số điện thoại không hợp lệ");
            System.out.println("Nhập lại số điện thoại");
            number = scanner.nextLine();
        }
        if (function.checkPhoneNumber(number)){
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sinh");
            String birthday = scanner.nextLine();
            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            System.out.println("Nhập email");
            String email = scanner.nextLine();
            while(!regexEmail.validate(email)){
                System.out.println("Email không hợp lệ");
                System.out.println("Nhập lại email");
                email = scanner.nextLine();
            }
            System.out.println("Nhập giới tính");
            String sex = scanner.nextLine();
            function.update(number,name,birthday,address,email,sex);
        }else {
            System.out.println("Không tìm thấy số cần sửa");
        }

    }

    public void removePhoneNumber(){
        System.out.println("Nhập số điện thoại muốn xóa");
        String number = scanner.nextLine();
        boolean check = function.checkPhoneNumber(number);
        if (check){
            System.out.println("Tìm thấy số");
            System.out.println("Nhập Y để xác nhận xóa");
            String input = scanner.nextLine();
            if (input.equals("Y")){
                function.remove(number);
            }
        }else{
            System.out.println("Không tìm thấy");
        }
    }

    public void searchPhoneNumber(){
        System.out.println("Nhập số điện thoại muốn tìm");
        String phoneNumber = scanner.nextLine();
        function.search(phoneNumber);
    }

    public void readFile() throws IOException {
        function.readFile();
    }

    public void writeFile() throws IOException {
        function.writeFile();
    }
}
