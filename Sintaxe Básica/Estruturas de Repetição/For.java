import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE REPETIÇÃO ==============");
        System.out.println("====================================================");

        // declarando variaveis
        int nRepet = 0;

        System.out.println("=== Estrutura For ===");

        System.out.print("\nDigite a quantidade de repetições com limite de 99999: ");
        nRepet = scanner.nextInt(); // lendo o numero digitado pelo usuario

        // estrutura de repetição for
        if (nRepet < 1 || nRepet > 99999) {
            System.out.println("\nValor inválido! Por favor, insira um número entre 1 e 99999.\n");
            scanner.close();
            return;
        }

        for (int i = 1; i <= nRepet; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
