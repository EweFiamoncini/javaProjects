import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MINHAS TAREFAS ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    //lógica para adicionar
                    System.out.println("\n--- ADICIONAR TAREFA ---");
                    System.out.println("Digite sua tarefa e aperte 'enter' para salvar.");
                    String tarefa = scanner.nextLine();
                    break;
                case 2:
                    //lógica para listar (usar um for loop)
                    break;
                case 3:
                    //lógica para remover
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }
        scanner.close();
    }
}
