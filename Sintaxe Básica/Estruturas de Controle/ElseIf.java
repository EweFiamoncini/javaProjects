import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario 

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE CONTROLE ==============");
        System.out.println("====================================================");

        System.out.println("");
        System.out.println("=== else if ===");

        //declarando variavel
        double numero = 15;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextDouble(); // lendo entrada do usuario para a variavel numero

        // verificando se o número é positivo, negativo ou zero
        System.out.println("");
        System.out.println("=== Verificando se o número é positivo, negativo ou zero ===");
        // estrutura else-if
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número " + numero + " é zero.");
        }
        
        scanner.close();
    }
}
