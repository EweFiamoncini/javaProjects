import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class SwtichCaseExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE CONTROLE ==============");
        System.out.println("====================================================");

        // declarando variaveis
        char operacao = ' ';
        int n1 = 0;
        int n2 = 0;
        double calculo = 0;

        System.out.println("=== Estrutura Switch-Case Expression ===");

        System.out.print("\nDigite um numero: ");
        n1 = scanner.nextInt(); // lendo o numero digitado pelo usuario

        System.out.print("\nDigite outro numero: ");
        n2 = scanner.nextInt(); // lendo o segundo numero digitado pelo usuario

        System.out.print("\nQual tipo de operacao (+, -, *, /): ");
        operacao = scanner.next().charAt(0); // lendo a operacao matematica desejada pelo usuario

        // estrutura switch-case para verificar o valor da variavel 'operacao'
        String resultado = switch (operacao) { // convertendo a palavra para minusculo para evitar erros de comparacao
            case '+' -> {
                calculo = n1 + n2;
                yield "Adição realizada!";
            }
            case '-' -> {
                calculo = n1 - n2;
                yield "Subtração realizada!";
            }
            case '*' -> {
                calculo = n1 * n2;
                yield "Multiplicação realizada!";
            }
            case '/' -> {
                if (n2 == 0) {
                    yield "Erro: Divisão por zero";
                }
                calculo = (double) n1 / n2;
                yield "Divisao realizada!";
            }
            default -> {
                yield "Operação inválida!";
            }
        };

        System.out.println("\n" + resultado + " Resultado: " + calculo + "\n");

        scanner.close();
    }
}
