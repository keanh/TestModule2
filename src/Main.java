import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        client.test();
        int choice = -1;
        while (choice != 0){
            client.menu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    client.showList();
                    break;
                case 2:
                    client.add();
                    break;
                case 3:
                    client.updatePhoneNumber();
                    break;
                case 4:
                    client.removePhoneNumber();
                    break;
                case 5:
                    client.searchPhoneNumber();
                    break;
                case 6:
                    client.readFile();
                    break;
                case 7:
                    client.writeFile();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
