import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
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
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task Inserted!");
                    break;
                case 2:
                    //logic for list (use at for loop)
                    System.out.println("\n--- LIST TASKS ---");
                    //Check if the list has anything
                    if (tasks.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        //size() gives the current size of the list
                        for (int i = 0; i < tasks.size(); i++) {
                            //we use .get(i) instead of [i]
                            System.out.println(i + " - " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    //logic for remove
                    if (tasks.isEmpty()) {
                        System.out.println("Nothing to remove.");
                    } else {
                        System.out.print("Enter the task number to remove: ");
                        int index = scanner.nextInt();

                        //We check if the index exists so as not to give an error.
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index); //The arraylist "pulls" the other items
                            System.out.println("Task successfully removed!");
                        } else {
                            System.out.println("That number does not exist on the list!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nExiting program...");
                    break;
                default:
                    System.out.println("\nOption invalid.");
            }
        }
        scanner.close();
    }
}
