import java.util.Scanner;

public class variaveis {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("============== VARIAVEIS ==============");
        System.out.println("=======================================");
        System.out.println("");
        
        // declarando variaveis
        Scanner scanner = new Scanner(System.in); //objeto scanner para ler entrada do usuario
        String name = "Ewerton Fiamoncini"; //String para textos
        int birthYear = 1999; //int para numeros inteiros
        float height = 1.75f; //float para numeros decimais
        char gender = 'M'; //char para caracteres
        boolean isStudent = true; //boolean para verdadeiro ou falso
        
        System.out.print("Digite seu nome: ");
        name = scanner.nextLine(); //lendo entrada do usuario para a variavel name

        System.out.print("Digite seu ano de nascimento: ");
        birthYear = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        height = scanner.nextFloat();

        System.out.print("Digite seu gênero (M/F): ");
        gender = scanner.next().charAt(0);

        System.out.print("Você é estudante? (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.println("");
        System.out.println("Variáveis declaradas com sucesso!");
        System.out.println("");


        // variaveis adicionadas recentemente mostradas no programa
        System.out.println("Nome da Variavel | Valores | Tipos");
        System.out.println("name |" + name + "| String");
        System.out.println("birthYear |" + birthYear + "| int");
        System.out.println("height |" + height + "| float");
        System.out.println("gender |" + gender + "| char");
        System.out.println("isStudent |" + isStudent + "| boolean");
        System.out.println("");
        System.out.println("Olá, " + name + "! Você nasceu em " + birthYear + ", tem " + height + "m de altura, " + gender + " de gênero."); // concatenação de variáveis    
        System.out.println("É estudante: " + isStudent);
        System.out.println("");
        
        scanner.close();

    }
}