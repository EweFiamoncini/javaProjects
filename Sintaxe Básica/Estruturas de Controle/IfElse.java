import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE CONTROLE ==============");
        System.out.println("====================================================");

        String palavra = "Programação";

        System.out.println("");
        System.out.println("=== if else ===");
        
        System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine(); // lendo entrada do usuario para a variavel palavra
        
        System.out.println("Digite um número inteiro: ");
        double numero = scanner.nextDouble(); // lendo entrada do usuario para a variavel numero

        System.out.println("=== Usando If-Else em numeros ===");
        // verificando se o número é positivo ou negativo
        System.out.println("");
        // estrutura if-else
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // verificando se o numero é divisivel por 3 e 5
        System.out.println("");
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 3 e 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3 e 5.");
        }

        // verificando se o numero é inteiro ou decimal
        System.out.println("");
        double numeroDecimal = numero; // convertendo int para double
        if (numeroDecimal % 1 == 0) {
            System.out.println("O número " + numeroDecimal + " é um número inteiro.");
        } else {
            System.out.println("O número " + numeroDecimal + " é um número decimal.");
        }

        System.out.println("");
        System.out.println("=== Usando If-Else em Palavras ===");
        // verificando se a palavra é igual a "Java"
        System.out.println("");
        if (palavra.equals("Java")) {
            System.out.println("A palavra digitada é Java.");
        } else {
            System.out.println("A palavra digitada não é Java.");
        }

        // verificando o tamanho da palavra
        System.out.println("");
        System.out.println("O tamanho da palavra digitada é: " + palavra.length());

        // verificando se a palavra é vazia
        System.out.println("");
        if (palavra.isEmpty()) {
            System.out.println("A palavra digitada é vazia.");
        } else {
            System.out.println("A palavra digitada não é vazia.");
        }

        // verificando se a palavra contém a letra 'a'
        System.out.println("");
        if (palavra.contains("a")) {
            System.out.println("A palavra digitada contém a letra 'a'.");
        } else {
            System.out.println("A palavra digitada não contém a letra 'a'.");
        }

        // verificando se a palavra começa com a letra 'P'
        System.out.println("");
        if (palavra.startsWith("P")) {
            System.out.println("A palavra digitada começa com a letra 'P'.");
        } else {
            System.out.println("A palavra digitada não começa com a letra 'P'.");
        }

        // verificando se a palavra termina com a letra 'o'
        System.out.println(""); 
        if (palavra.endsWith("o")) {
            System.out.println("A palavra digitada termina com a letra 'o'.");
        } else {
            System.out.println("A palavra digitada não termina com a letra 'o'.");
        }

        scanner.close();
    }
}
