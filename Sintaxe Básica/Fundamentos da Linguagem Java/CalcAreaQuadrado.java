
public class CalcAreaQuadrado {
    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("============== CÁLCULO DE ÁREA DO QUADRADO ==============");
        System.out.println("=========================================================");

        var Scanner = new java.util.Scanner(System.in);

        System.out.println("");
        System.out.print("Digite o lado do quadrado: ");
        double lado = Scanner.nextDouble();

        double area = lado * lado;

        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("============= CÁLCULO CONCLUÍDO COM SUCESSO! ============");
        System.out.println("=========================================================");
        System.out.println("");
        System.out.println("A área do quadrado de lado " + lado + " é: " + area);
        System.out.println("");
    
        Scanner.close();
    }
}