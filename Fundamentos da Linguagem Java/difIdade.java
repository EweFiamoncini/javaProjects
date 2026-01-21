public class difIdade {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.println("===========================================================");
        System.out.println("================= Cálculo da Diferença de Idade ===========");
        System.out.println("===========================================================");
        System.out.println("");

        System.out.println("=============== Cadastro da primeira pessoa ===============");
        System.out.print("Digite o nome de uma pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade dessa pessoa: ");
        int idade1 = Integer.parseInt(scanner.nextLine());

        System.out.println("");
        System.out.println("=============== Cadastro da segunda pessoa ================");
        System.out.print("Digite o nome de uma pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade dessa pessoa: ");
        int idade2 = Integer.parseInt(scanner.nextLine());

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("");
        System.out.println("===========================================================");
        System.out.println("============= Cálculo concluído com sucesso! ==============");
        System.out.println("===========================================================");
        System.out.println("");
        System.out.printf("A diferença de idade entre %s e %s é de %s anos", nome1, nome2, diferenca);
        System.out.println("");
        System.out.println("");
    }
}