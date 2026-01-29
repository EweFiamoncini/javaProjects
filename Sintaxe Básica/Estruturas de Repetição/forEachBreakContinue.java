import java.util.Scanner; // importando a classe Scanner para ler entrada do usuario

public class forEachBreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner para ler entrada do usuario

        System.out.println("====================================================");
        System.out.println("============== ESTRUTURAS DE REPETIÇÃO ==============");
        System.out.println("====================================================");

        System.out.println("=== Estrutura For-Each com Break e Continue ===");

        System.out.print("\nDigite o nome dos alunos para adicionar na lista: ");
        String alunos = scanner.nextLine(); // lendo a quantidade de frutas

        String[] listaAlunos = alunos.split(","); // criando um array para armazenar as frutas

        System.out.print("Digite o nome do aluno que deseja buscar (para usar 'break' e 'continue'): ");
        String alunoBusca = scanner.nextLine(); // lendo o nome do aluno para buscar

        System.out.println("\nPesquisando aluno...");
        for (String aluno : listaAlunos) {
            aluno = aluno.trim(); // removendo espaços em branco extras
            if (aluno.equalsIgnoreCase("João")) {
                System.out.println("Aluno 'João' encontrado! Interrompendo a busca.");
                break; // interrompe o loop se o aluno for "João"
            }
            if (!aluno.equalsIgnoreCase(alunoBusca)) {
                System.out.println("Aluno '" + aluno + "' não é o aluno buscado. Continuando...");
                continue; // pula para a próxima iteração se não for o aluno buscado
            }
            System.out.println("Aluno '" + aluno + "' encontrado na lista!");
        }

        scanner.close();
    }
}
