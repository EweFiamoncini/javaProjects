import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class CalculosMatematicos {
    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println("============== CÁLCULOS MATEMÁTICOS ==============");
        System.out.println("==================================================");
        
        // declaração de variaveis
        var Scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario
        double num1, num2;

        // lendo dois números do usuário
        System.out.println("");
        System.out.print("Digite o primeiro número: ");
        num1 = Scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = Scanner.nextDouble();

        // realizando cálculos básicos
        double soma = num1 + num2; // + adição
        double subtracao = num1 - num2; // - subtração
        double multiplicacao = num1 * num2; // * multiplicação
        double divisao = num1 / num2; // / divisão
        double modulo = num1 % num2; // % restante da divisão

        // realizando calculos avançados
        double potencia = Math.pow(num1, num2); // potência
        double raizQuadrada = Math.sqrt(num1); // raiz quadrada
        double valorAbsoluto = Math.abs(num1); // valor absoluto
        double arredondarCima = Math.ceil(num1); // arredondar para cima
        double arredondarBaixo = Math.floor(num1); // arredondar para baixo
        double arredondar = Math.round(num1); // arredondar para o inteiro mais próximo
        double maximo = Math.max(num1, num2); // valor máximo
        double minimo = Math.min(num1, num2); // valor mínimo
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("============= CÁLCULO CONCLUÍDO COM SUCESSO! ============");
        System.out.println("=========================================================");
        System.out.println("");
        System.out.println("--- Resultados dos cálculos básicos: ---");
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + modulo);
        System.out.println("");
        System.out.println("--- Resultados dos cálculos avançados: ---");
        System.out.println("");
        System.out.println("Potência: " + potencia);
        System.out.println("Raiz Quadrada: " + raizQuadrada);
        System.out.println("Valor Absoluto: " + valorAbsoluto);
        System.out.println("Arredondar para cima: " + arredondarCima);
        System.out.println("Arredondar para baixo: " + arredondarBaixo);
        System.out.println("Arredondar para o inteiro mais próximo: " + arredondar);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);

        System.out.println("");

        Scanner.close();
    }
}