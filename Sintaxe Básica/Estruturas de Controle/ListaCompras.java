import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>();

        listaCompras.add("Café");
        listaCompras.add("Cerveja");
        listaCompras.add("Carne");

        listaCompras.remove(1);

        System.out.println(listaCompras.size());

        for (String item : listaCompras) {
            System.out.println("Item: " + item);
        }
    }
}
