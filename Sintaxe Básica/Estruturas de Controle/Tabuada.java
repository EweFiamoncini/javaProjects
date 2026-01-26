import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        
        // laço infinito para permitir multiplas tabuadas
        while (true) {

            // pede pro usuario digitar um numero
            System.out.println("Digite um numero para ver a tabuada: ");
            // le o numero
            int number = scanner.nextInt();

            // loop para calcular a tabuada
            System.out.println("===========  Tabuada de " + number + "  ===========");

            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " x " + j + " = " + (number * j));
            }

            System.out.println("======================================");

            // laço para ver se o usuario quer outra tabuada
            for (char c = 's'; c == 's' || c == 'S';) {
                
                // pergunta se o usuario quer ver outra tabuada
                System.out.println("Deseja ver outra tabuada? (s/n)");
                // le a resposta
                char r = scanner.next().charAt(0);
                
                // verifica a resposta
                if (r == 'n' || r == 'N') {
                    // encerra o programa
                    System.out.println("Encerrando o programa. Obrigado!");
                    return;
                    // sai do laço
                } else if (r == 's' || r == 'S') {
                    // continua o laço externo
                    break;
                    // sai do laço interno
                } else {
                    // resposta invalida
                    System.out.println("Resposta invalida. Por favor, digite 's' para sim ou 'n' para nao.");
                }
            }
        }
    }
};