import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE REPETIÇÃO ==============");
        System.out.println("====================================================");

        System.out.println("=== Estrutura ArrayList ===");

        // Digite a quantidade de elementos do array
        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        // Criação do array para armazenar os nomes dos alunos
        String[] nomesAlunos = new String[quantidadeAlunos];

        // Loop para ler os nomes dos alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomesAlunos[i] = scanner.next(); // Armazenando o nome no array
        }

        // Exibindo os nomes dos alunos armazenados no array
        System.out.println("\nNomes dos alunos cadastrados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println((i + 1) + ". " + nomesAlunos[i]);
        }

        scanner.close();
    }
}
