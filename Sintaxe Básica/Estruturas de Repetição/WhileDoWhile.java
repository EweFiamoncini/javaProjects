import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class WhileDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE REPETIÇÃO ==============");
        System.out.println("====================================================");
        
        System.out.println("=== Estrutura de Repetição While e Do-While ===");

        System.out.print("\nDigite a quantidade de repetições que deseja realizar: ");
        int nRepet = scanner.nextInt(); // lendo a quantidade de repetições

        System.out.println("\n--- Estrutura While ---");
        int contadorWhile = 1; // inicializando o contador para o while
        while (contadorWhile <= nRepet) {
            System.out.println("Repetição número: " + contadorWhile);
            contadorWhile++; // incrementando o contador
        }

        System.out.println("\n--- Estrutura Do-While ---");
        int contadorDoWhile = 1; // inicializando o contador para o do-while
        do {
            System.out.println("Repetição número: " + contadorDoWhile);
            contadorDoWhile++; // incrementando o contador
        } while (contadorDoWhile <= nRepet);

        scanner.close();
    }
}
