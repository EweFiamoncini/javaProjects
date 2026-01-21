public class cadNameDate {
    public static void main(String[] args) {

        System.out.println("===================================================================");
        System.out.println("============== Cadastro de Nome e Data de Nascimento ==============");
        System.out.println("===================================================================");
        System.out.println("");

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite seu nome: ");
        var name = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2026;
        
        int age = currentYear - birthYear;

        System.out.println("");
        System.out.println("===================================================================");
        System.out.println("================= Cadastro concluido com sucesso! =================");
        System.out.println("===================================================================");

        System.out.println("");
        System.out.println("Olá, " + name + "! Você tem " + age + " anos.");     
        System.out.println("");


    }
}