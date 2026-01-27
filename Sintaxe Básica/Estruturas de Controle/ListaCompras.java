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

        // exibir a lista de compras
        for (String lista : listaCompras) {
            System.out.println(lista);
        }
    }
}
