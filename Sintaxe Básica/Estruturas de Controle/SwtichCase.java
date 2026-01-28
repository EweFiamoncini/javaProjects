import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class SwtichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE CONTROLE ==============");
        System.out.println("====================================================");

        // declarando variaveis
        String palavra = "";

        System.out.print("Digite uma palavra (casa, carro, moto, aviao): ");
        palavra = scanner.nextLine(); // lendo a palavra digitada pelo usuario

        // estrutura switch-case para verificar o valor da variavel 'palavra'
        switch (palavra.toLowerCase()) { // convertendo a palavra para minusculo para evitar erros de comparacao
            case "casa":
                System.out.println("Palavra encontrada!");
                System.out.println("");
                break; // encerrando o case
            case "carro":
                System.out.println("Palavra encontrada!");
                System.out.println("");
                break; // encerrando o case
            case "moto":
                System.out.println("Palavra encontrada!");
                System.out.println("");
                break; // encerrando o case
            case "aviao":
                System.out.println("Palavra encontrada!");
                System.out.println("");
                break; // encerrando o case
            case "sair":
                System.out.println("Encerrando o programa. Ate mais!");
                System.out.println("");
                break; // encerrando o case sair
            default:
                System.out.println("Palavra nao reconhecida.");
                System.out.println("");
                break; // encerrando o case padrao
        }

        scanner.close();
    }
}
