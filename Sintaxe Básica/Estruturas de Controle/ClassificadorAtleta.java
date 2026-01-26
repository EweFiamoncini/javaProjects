public class ClassificadorAtleta {
    public static void main(String[] args) {

        //dados do participante
        String name = "Ewerton";
        Object entrada = 90; // Pode ser 90, "LESIONADO", null, etc.
        boolean temMedalha = true;

        //lógica para classificação
        String classificacao = switch (entrada) {
            case Integer p -> {
                // lógica if-else para as faixas de pontuação
                if (p > 0 && p <= 49) {
                    yield "Iniciante"; // yield para escrever o resultado
                } else if (p >= 50 && p <= 84) {
                    yield "Profissional";
                } else if (p >= 85 && p <= 100) {
                    yield "Elite";
                } else {
                    yield "Pontuação fora do range";
                }
            }
            //equalsIgnoredCase para ignorar letras maiusculas ou minusculas
            case String s when s.equalsIgnoreCase("LESIONADO") -> "Aguardando recuperação";
            case String s when s.equalsIgnoreCase("APOSENTADO") -> "Homenageado na galeria";
            case null -> "Dados inválidos";
            default -> "Categoria desconhecida";
        };

        // Operador ternário para adicionar " + Medalhista" se tiver medalha
        String resultadoFinal = classificacao + (temMedalha ? ", é Medalhista." : ", sem medalhas.");

        // resultado final
        System.out.println("================ Classificação de Atleta =====================");
        System.out.printf("Atleta: %s %n", name);
        System.out.printf("Classificação: %s %n", resultadoFinal);
        System.out.println("==============================================================");
    }
}