public class RegistroVenda {
    public static void main(String[] args) {
        // declaração de variaveis
        String nomeProduto = "Teclado Mecãnico";
        double precoUnitaio = 1025.14;
        int quantidade = 3;

        System.out.println("########## Sistema para calculo de venda de produto ##########");
        System.out.println("\n");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preço unitario: R$" + precoUnitaio);
        System.out.println("Quantidade: " + quantidade);

        // calculo da venda
        double valorTotal = precoUnitaio * quantidade;

        System.out.println("\n");
        System.out.println("O produto " + nomeProduto + " custou o valor total de: R$" + valorTotal);
        System.out.println("\n");
    }
}