import java.io.*;
import java.util.ArrayList;

public class Function {
    ArrayList<PhoneBook> arrayList = new ArrayList<>();
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String path = "D:\\Module 2\\TestModule2\\data1";
    File file = new File(path);

    PhoneBook phoneBook1 = new PhoneBook("Nguyễn Văn A","0971234567","01-01-1989","Mỹ Đình - Hà Nội","vana@codegym.vn","Nam");
    PhoneBook phoneBook2 = new PhoneBook("Nguyễn Thị B","0971234568","01-01-1990","Thanh Xuân - Hà Nội","nguyenthib@codegym.vn","Nữ");

    public void menu(){
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("Chọn chức năng theo số(để tiếp tục)");
        System.out.println("1.Xem danh sách");
        System.out.println("2.Thêm mới");
        System.out.println("3.Cập nhật");
        System.out.println("4.Xóa");
        System.out.println("5.Tìm kiếm");
        System.out.println("6.Đọc từ file");
        System.out.println("7.Ghi vào file");
        System.out.println("8.Thoát");
        System.out.println("Chọn chức năng:");
    }

    public void test(){
        arrayList.add(phoneBook1);
        arrayList.add(phoneBook2);
    }

    public void showList(){
        for (PhoneBook phoneBook:arrayList){
            System.out.println(phoneBook);
        }
    }

    public boolean add(PhoneBook phoneBook){
        if (!arrayList.contains(phoneBook)){
            return arrayList.add(phoneBook);
        }return false;
    }

    public boolean update(String number, String name, String birthday, String address, String email, String sex){
        for (PhoneBook phoneBook:arrayList){
            if (phoneBook.getPhoneNumber().equals(number)){
                phoneBook.setName(name);
                phoneBook.setBirthday(birthday);
                phoneBook.setAddress(address);
                phoneBook.setEmail(email);
                phoneBook.setSex(sex);
                System.out.println("Cập nhật thành công");
                return true;
            }
        }
        return false;
    }

    public boolean remove(String phoneNumber){
        for (PhoneBook phoneBook:arrayList){
            if (phoneBook.getPhoneNumber().equals(phoneNumber)){
                arrayList.remove(phoneBook);
                return true;
            }
        }
        return false;
    }

    public boolean checkPhoneNumber(String phoneNumber){
        for (PhoneBook phoneBook:arrayList){
            if (phoneBook.getPhoneNumber().equals(phoneNumber)){
                return true;
            }
        }
        return false;
    }

    public boolean search(String number){
        ApproximatString approximatString = new ApproximatString(number);
        for (PhoneBook phoneBook:arrayList){
            if (phoneBook.getPhoneNumber().equals(number)){
                System.out.println(phoneBook);
                return true;
            }else{
                boolean checkPhoneNumber = approximatString.SoSanh(phoneBook.getPhoneNumber());
                if (checkPhoneNumber){
                    System.out.println(phoneBook);
                    return true;
                }
            }
        }
        return false;
    }

    public void readFile() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            String[] word =line.split(",");
            PhoneBook phoneBook = new PhoneBook(word[0],word[1],word[2],word[3],word[4],word[5]);
            arrayList.add(phoneBook);
        }
        bufferedReader.close();
    }

    public void writeFile() throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (PhoneBook phoneBook:arrayList){
            bufferedWriter.write(String.valueOf(phoneBook));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
