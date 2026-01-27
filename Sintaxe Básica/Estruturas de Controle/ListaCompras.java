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
        System.out.println("Número de itens na lista de compras: " + listaCompras.size());

        // exibindo primeiro item da lista
        System.out.println("");
        System.out.println("Primeiro item da lista: " + listaCompras.get(0));

        // exibindo ultimo item da lista
        System.out.println("");
        System.out.println("Ultimo item da lista: " + listaCompras.get(listaCompras.size() - 1));

        // exibir a lista de compras
        System.out.println("");
        System.out.println("Lista de Compras:");
        for (String lista : listaCompras) {
            System.out.println(lista);
        }

        System.out.println("");
    }
}
