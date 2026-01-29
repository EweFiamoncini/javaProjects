import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class forEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE REPETIÇÃO ==============");
        System.out.println("====================================================");
        
        System.out.println("=== Estrutura For-Each ===");

        System.out.print("\nDigite a quantidade de frutas que deseja adicionar na lista: ");
        int quantidade = scanner.nextInt(); // lendo a quantidade de frutas

        String[] frutas = new String[quantidade]; // criando um array para armazenar as frutas
        scanner.nextLine(); // consumir a quebra de linha pendente
        
        // lendo as frutas do usuario
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // exibindo as frutas usando for-each
        System.out.println("\nFrutas da lista:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        scanner.close();
    }
}
