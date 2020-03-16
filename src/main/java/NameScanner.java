import java.util.Scanner;
public class NameScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();

        while (!(name == ""))
            if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("bob")) {
                System.out.println("Welcome " + name);
                return;
            } else {
                System.out.println("Wrong input try again");
                System.out.println("What is your name?");
                name = sc.nextLine();


            }
    }
}