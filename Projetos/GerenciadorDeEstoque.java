import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorDeEstoque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("====================================================");
            System.out.println("============== GERENCIADOR DE ESTOQUE ==============");
            System.out.println("====================================================\n");

            // Menu
            System.out.println("===================== MENU =========================");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar todos os Produtos");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("0. Encerrar Programa");
            System.out.println("====================================================\n");

            // Solicitar escolha do usuário
            System.out.print("# Escolha uma opção: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            // Processar escolha do usuário
            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("1. Cadastrar Produto");
                    System.out.print("# Digite o nome do produto ou 0 para cancelar: ");
                    String nomeProduto = scanner.nextLine();

                    if (nomeProduto.equals("0")) {
                        System.out.println("#### Cadastro cancelado!");
                        break;
                    }

                    System.out.print("# Digite a quantidade do produto: ");
                    int quantidadeProduto = scanner.nextInt();
                    scanner.nextLine();

                    // Adiciona o produto e a quantidade às listas
                    produtos.add(nomeProduto);
                    quantidades.add(quantidadeProduto);

                    break;

                case 2:
                    System.out.println();
                    System.out.println("2. Listar todos os Produtos");
                    if (produtos.isEmpty()) {
                        System.out.println("#### Nenhum produto cadastrado para listar! \n");
                        break;
                    }
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(produtos.get(i) + ": " + quantidades.get(i) + " unidades.");
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("3. Atualizar Quantidade");

                    if (produtos.isEmpty()) {
                        System.out.println("#### Nenhum produto cadastrado para poder atualizar a quantidade! \n");
                        break;
                    }

                    System.out.print("# Digite o nome do produto para atualizar a quantidade ou 0 para cancelar: \n");
                    String busca = scanner.nextLine();

                    if (busca.equals("0")) {
                        System.out.println("#### Atualização cancelada!");
                        break;
                    }

                    int novaQtd = produtos.indexOf(busca);

                    if (novaQtd != -1) {
                        System.out.print("# Digite a nova quantidade: ");
                        int novaQuantidade = Integer.parseInt(scanner.nextLine());
                        quantidades.set(novaQtd, novaQuantidade);
                    } else {
                        System.out.println("#### Error: Produto não encontrado! \n");
                    }

                    break;

                case 0:
                    System.out.println();
                    System.out.println("0. Encerrar Programa");
                    System.out.println("## Obrigado por usar o Gerenciador de Estoque! \n");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("##### Error: Opção inválida! Tente novamente. \n");
                    break;
            }
        }

    }
}
