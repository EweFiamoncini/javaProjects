import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {

        // declarando e inicializando a lista
        ArrayList<String> listaCompras = new ArrayList<>();

        // criando lista de compras
        listaCompras.add("Café");
        listaCompras.add("Pão");
        listaCompras.add("Queijo");
        listaCompras.add("Presunto");
        listaCompras.add("Açúcar");
        listaCompras.add("Leite");

        // Titulo da lista
        System.out.println("---- LISTA DE COMPRAS ----");

        // exibindo tamanho da lista
        System.out.println("");
        System.out.println("Número de itens na lista de compras: " + listaCompras.size()); // .size() retorna o tamanho
                                                                                           // da lista

        // exibindo primeiro item da lista
        System.out.println("");
        System.out.println("Primeiro item da lista: " + listaCompras.get(0)); // .get() retorna o item no índice
                                                                              // especificado

        // exibindo ultimo item da lista
        System.out.println("");
        System.out.println("Ultimo item da lista: " + listaCompras.get(listaCompras.size() - 1)); // .size() -1 retorna
                                                                                                  // o índice do último
                                                                                                  // item

        // exibir a lista de compras
        System.out.println("");
        System.out.println("Lista de Compras:");
        for (String lista : listaCompras) {
            System.out.println(lista);
        }

        System.out.println("");
        // exibindo lista de compras em ordem reversa
        System.out.println("Lista de Compras (Ordem Reversa):");
        for (int i = listaCompras.size() - 1; i >= 0; i--) {
            System.out.println(listaCompras.get(i));
        }

        System.out.println("");
        // exibindo lista de compras formatada
        System.out.println("Lista de Compras (Formatada):");
        for (int i = 0; i < listaCompras.size(); i++) {
            if (i == listaCompras.size() - 1) {
                System.out.print(listaCompras.get(i) + ".");
            } else {
                System.out.print(listaCompras.get(i) + ", ");
            }
        }
        System.out.println("");

        System.out.println("");
        // exibindo lista de compras ordenada
        System.out.println("Lista de Compras (Ordenada):");
        listaCompras.sort(String::compareTo);
        for (String item : listaCompras) {
            System.out.println(item);
        }

        System.out.println("");
        // removendo um item da lista
        listaCompras.remove("Café"); // .remove() remove o item especificado da lista
        System.out.println("Lista de Compras após remover Café: ");
        for (String item : listaCompras) {
            System.out.println(item);
        }

        System.out.println("");
        // exibindo lista de compras com indices
        System.out.println("Lista de Compras (com índices):");
        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println(i + ": " + listaCompras.get(i));
        }

        System.out.println("");
        // removendo um item pelo índice
        listaCompras.remove(2); // .remove(index) remove o item no índice especificado
        System.out.println("Lista de Compras após remover o item no índice 2: ");
        for (String item : listaCompras) {
            System.out.println(item);
        }

        System.out.println("");
        // verificando se a lista contém um item
        String contem = "Leite";
        boolean contemItem = listaCompras.contains(contem); // .contains retorna true ou false
        System.out.println("A lista de compras contém " + contem + ": " + contemItem);

        System.out.println("");
        // exibindo lista de compras vazia ou não
        boolean estaVazia = listaCompras.isEmpty(); // .isEmpty() retorna true se a lista estiver vazia
        System.out.println("A lista de compras está vazia: " + estaVazia);

        System.out.println("");
        // exibindo lista de compras limpada
        listaCompras.clear(); // .clear remove todos os itens da lista
        System.out.println("Lista de Compras após limpar: ");
        for (String item : listaCompras) {
            System.out.println(item);
        }

        System.out.println("");
        // exibindo lista de compras vazia ou não
        boolean vazia = listaCompras.isEmpty(); // .isEmpty() retorna true se a lista estiver vazia
        System.out.println("A lista de compras está vazia: " + vazia);

        System.out.println("");
    }
}
