import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declarando e inicializando a lista
        ArrayList<String> listaCompras = new ArrayList<>();

        // exibir a lista de compras
        for (int i = 0; i < 3; i++) {
            System.out.println("Item " + (i + 1) + " da lista: ");
            listaCompras.add(scanner.next());
        }

        System.out.println(listaCompras.size());

        for (String item : listaCompras) {
            System.out.println("Item cadastrado na posição " + listaCompras.indexOf(item) + ": " + item);
        }

        scanner.close();
    }
}
