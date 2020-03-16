import java.util.Scanner;
public class NameScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Welcome" + name);
        } else {
            System.out.println("Wrong input try again");
        }
    }
}