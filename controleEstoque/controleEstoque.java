import java.util.ArrayList;
import java.util.List;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class controleEstoque {
    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<>();
        estoque.add(new Produto("Teclado", 150.0, 10));
        estoque.add(new Produto("Mouse", 80.0, 2));   // Estoque baixo!
        estoque.add(new Produto("Monitor", 900.0, 0)); // Sem estoque!
        estoque.add(new Produto("Fone", 200.0, 15));

        // --- CALCULAR VALOR TOTAL ---
        double valorTotalGeral = 0;
        for (Produto p : estoque) {
            valorTotalGeral += (p.preco * p.quantidade);
        }
        System.out.println("Valor total do estoque: R$ " + valorTotalGeral);

        // --- FILTRAR REPOSIÇÃO (CONTINUE) ---
        System.out.println("\nProdutos para repor (menos de 5 unidades):");
        for (Produto p : estoque) {
            if (p.quantidade >= 5) {
                continue; // Se tem estoque ok, pula para o próximo
            }
            System.out.println("- " + p.nome + " (Apenas " + p.quantidade + " un)");
        }

        // --- BUSCA (BREAK) ---
        String busca = "Mouse";
        boolean encontrado = false;
        for (Produto p : estoque) {
            if (p.nome.equalsIgnoreCase(busca)) {
                encontrado = true;
                break; // Encontrou? Para o loop!
            }
        }
        System.out.println("\nProduto " + busca + " em estoque? " + (encontrado ? "Sim" : "Não"));
    }
}