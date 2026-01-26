public class CalcAreaTriangulo {
    public static void main(String[] args) {
        
        var scanner = new java.util.Scanner(System.in);
    
        System.out.println("===========================================================");
        System.out.println("============= Cálculo da Área de um Triângulo =============");
        System.out.println("===========================================================");
        System.out.println("");

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("");
        System.out.println("===========================================================");
        System.out.println("============= Cálculo concluído com sucesso! ==============");
        System.out.println("===========================================================");
        System.out.println("");
        System.out.println("A área do triângulo é: " + area);
        System.out.println("");
    }
}