import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produto> estoque = new ArrayList<>();
        estoque.add(new Produto("Teclado", 150.0, 10));
        estoque.add(new Produto("Mouse", 80.0, 2)); // Estoque baixo!
        estoque.add(new Produto("Monitor", 900.0, 0)); // Sem estoque!
        estoque.add(new Produto("Fone", 200.0, 15));

        // --- ALERTA DE ESTOQUE ---
        for (Produto p : estoque) {
            if (p.quantidade == 0) {
                System.out.println("ALERTA: Produto " + p.nome + " está sem estoque!");
            } else if (p.quantidade < 5) {
                System.out.println("ATENÇÃO: Produto " + p.nome + " com estoque baixo: " + p.quantidade + " unidades.");
            }
        }

        // --- BUSCA (BREAK) ---
        System.out.print("Digite o nome do produto para buscar: ");
        String busca = scanner.nextLine();

        boolean encontrado = false;

        for (Produto p : estoque) {
            if (p.nome.equalsIgnoreCase(busca)) {
                encontrado = true;
                System.out.println("Produto encontrado: " + p.nome + ", Preço: " + p.preco + ", Quantidade: " + p.quantidade);
                break; // Encontrou? Para o loop!
            } else {
                System.out.println("Produto " + busca + " não encontrado.");
                break;
            }
        }
    }
}