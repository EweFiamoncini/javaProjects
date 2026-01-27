import java.util.Scanner;

public class ConversorMoedas {
    public  static void main(String[] args) {
        //criando objeto scanner para leitura de dados do cmd
        Scanner scanner = new Scanner(System.in);

        //definicao de taxas de cambio
        double taxaUsd = 1.09;
        double taxaBrl = 5.40;

        System.out.println("--- Bem vindo ao conversor de moedas ---");

        //pedir valor para usuario
        System.out.println("Digite o valor em Euros: ");
        double valorEuros = scanner.nextDouble();

        //menu de opções
        System.out.println("Escolha a moeda que seja converter: ");
        System.out.println("1. Dólar(USD)");
        System.out.println("2. Real(BRL)");
        System.out.println("Opção: ");
        int opcao = scanner.nextInt();

        //logia para conversão e exibição
        if (opcao == 1) {
            double resultado = valorEuros * taxaUsd;
            System.out.printf("O valor em Dólares é: %s %n", resultado);
        } else if (opcao == 2) {
            double resultado = valorEuros * taxaBrl;
            System.out.printf("O valor em Real é: %s %n", resultado);
        } else {
            System.out.println("Opção inválida! Fechando programa...");
        }

        //fechar o conversor
        scanner.close();
        System.out.println("Obrigado por usar o conversor!");

        System.out.println("Rodando o programa....");
    }
}
