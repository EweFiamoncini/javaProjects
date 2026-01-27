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

        //exibindo tamanho da lista
        System.out.println("Número de itens na lista de compras: " + listaCompras.size());

        // exibir a lista de compras
        System.out.println("Lista de Compras:");
        for (String lista : listaCompras) {
            System.out.println(lista);
        }
    }
}
