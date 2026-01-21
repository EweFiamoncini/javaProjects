public class calcIMC {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        while (true) {

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu peso em kg: ");
            float peso = scanner.nextFloat();

            System.out.print("Digite sua altura em metros: ");
            float altura = scanner.nextFloat();

            float imc = peso / (altura * altura);

            System.out.printf("%s, seu IMC é: %.2f%n", nome, imc);

            if (imc < 18.5) {
                System.out.println("Classificado como: Abaixo do peso");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Classificado como: Peso ideal");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Classificado como: Leve sobrepeso");
            } else if (imc >= 30 && imc < 34.9) {
                System.out.println("Classificado como: Obesidade grau I");
            } else if (imc >= 35 && imc < 39.9) {
                System.out.println("Classificado como: Obesidade grau II (Severa)");
            } else {
                System.out.println("Classificado como: Obesidade grau III (Mórbida)");

            }

            System.out.print("Deseja fazer um novo cálculo? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            } else if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("Resposta inválida. Encerrando o programa.");
                break;
            }
        }

    }
}