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
        // estrutura else-if
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número " + numero + " é zero.");
        }
        // operador ternario
        String resultado = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "zero"; // atribuindo resultado com operador ternário
        System.out.println("Usando operador ternário: O número " + numero + " é " + resultado + ".");

        // verificando se o número é grande, médio ou pequeno
        System.out.println("");
        if (numero > 100) {
            System.out.println("O número " + numero + " é grande.");
        } else if (numero > 10) {
            System.out.println("O número " + numero + " é médio.");
        } else {
            System.out.println("O número " + numero + " é pequeno.");
        }
        // operador ternario
        resultado = (numero > 100) ? "grande" : (numero > 10) ? "médio" : "pequeno"; // atribuindo resultado com operador ternário
        System.out.println("Usando operador ternário: O número " + numero + " é " + resultado + ".");

        // verificando se o número é múltiplo de 2, 3 ou 5
        System.out.println("");
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 2.");
        } else if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3.");
        } else if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 5.");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 2, 3 ou 5.");
        }
        // operador ternario
        resultado = (numero % 2 == 0) ? "múltiplo de 2" : (numero % 3 == 0) ? "múltiplo de 3" : (numero % 5 == 0) ? "múltiplo de 5" : "não é múltiplo de nenhum"; // atribuindo resultado com operador ternário
        System.out.println("Usando operador ternário: O número " + numero + " é " + resultado + ".");

        // verificando se o número está na faixa de 1 a 10, 11 a 20 ou fora dessas faixas
        System.out.println("");
        if (numero >= 1 && numero <= 10) {
            System.out.println("O número " + numero + " está na faixa de 1 a 10.");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("O número " + numero + " está na faixa de 11 a 20.");
        } else {
            System.out.println("O número " + numero + " está fora das faixas de 1 a 20.");
        }
        // operador ternario
        resultado = (numero >= 1 && numero <= 10) ? "está na faixa de 1 a 10" : (numero >= 11 && numero <= 20) ? "está na faixa de 11 a 20" : "está fora das faixas de 1 a 20"; // atribuindo resultado com operador ternário
        System.out.println("Usando operador ternário: O número " + numero + " " + resultado + ".");

        System.out.println("");
        scanner.close();
    }
}
