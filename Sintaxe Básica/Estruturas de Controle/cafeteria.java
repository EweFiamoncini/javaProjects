import java.util.ArrayList;
import java.util.Scanner;

public class cafeteria {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cafeExpresso = new ArrayList<String>();
        cafeExpresso.add("Café Expresso Médio | R$ 9.00");
        cafeExpresso.add("Capuccino | R$ 9.00");
        cafeExpresso.add("Expresso Duplo | R$ 10.50");
        cafeExpresso.add("Chocolate Belga | R$ 15,75");

        ArrayList<String> lanches = new ArrayList<String>();
        lanches.add("Queijo quente | R$ 12.75");
        lanches.add("Pão na chapa | R$ 13.50");

        String cardapio = "";
        double total = 0;
        int opcao = 0;
        int pedido = 0;

        System.out.println("--- Bem vindo ao JAVA COFFE ---");

        do {
            System.out.println("--- MENU | JAVA COFFE ---");
            System.out.println("1. Ver Cardápio e fazer pedido");
            System.out.println("2. Ver meus pedidos");
            System.out.println("3. Encerrar pedido");
            System.out.println("Selecione uma das opções acima: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("--- FAZER PEDIDO | JAVA COFFE ---");
                    System.out.println("--- CARDÁPIO | JAVA COFFE ---");
                    System.out.println("--- Café Expresso ----");
                    for (String c : cafeExpresso) {
                        System.out.println(c);
                    }
                    System.out.println("--- Lanches ---");
                    for (String l : lanches) {
                        System.out.println(l);
                    }
                    System.out.println("Digite qual numero do item que deseja referente ao cardápio listado acima:");
                    pedido = scanner.nextInt();

                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                case 3:
                    System.out.println("--- ENCERRAR CONTA ---");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 3);

        if (total >= 20) {
            total = total * 0.90;
            System.out.println("Você ganhou 10% de desconto!");
        }

        System.out.printf("Total a pagar: R$ %.2f\n", total);
        System.out.println("Obrigado pela preferência!");

    }
}