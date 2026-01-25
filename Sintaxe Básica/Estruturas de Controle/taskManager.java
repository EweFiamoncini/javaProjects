import java.util.ArrayList;
import java.util.Scanner;

public class taskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        int option = 0;

        while (option != 4) {
            System.out.println("\n--- MY TASKS ---");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choice one option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    //logic for add
                    System.out.println("\n--- ADD TASK ---");
                    System.out.println("Type in your Task and hit enter to save.");
                    String task = scanner.nextLine();
                    break;
                case 2:
                    //logic for list (use at for loop)
                    break;
                case 3:
                    //logic for remove
                    break;
                case 4:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nOption invalid.");
            }
        }
        scanner.close();
    }
}
