public class SisGestaoFrete {
    public static void main(String[] args) {
        // Dados de teste
        String tipo = "PACOTE";
        double peso = 25.0;
        boolean querSeguro = true;

        // 1. Switch Expression (Moderna e concisa)
        double valorBase = switch (tipo) {
            case "DOCUMENTO" -> 5.0;
            case "PACOTE" -> 15.0;
            case "FRAGIL" -> 30.0;
            case "" -> 0.0;
            default -> 10.0;
        };

        // 2. Estrutura if-else (Para intervalos complexos)
        double adicionalPeso;
        if (peso <= 5) {
            adicionalPeso = peso * 2.0;
        } else if (peso <= 20) {
            adicionalPeso = peso * 5.0;
        } else {
            // Acima de 20kg: taxa por kg + taxa fixa de grande porte
            adicionalPeso = (peso * 10.0) + 50.0;
        }

        // 3. Operador Ternário (Decisão simples de valor)
        double subtotal = valorBase + adicionalPeso;
        double valorSeguro = querSeguro ? subtotal * 0.02 : 0.0;

        double totalFinal = subtotal + valorSeguro;

        // Saída formatada
        System.out.println("---------- RESUMO DO FRETE ----------");
        System.out.printf("Categoria: %s%n", (tipo == "" ? "NÃO INFORMADA" : tipo));
        System.out.printf("Peso:      %.2f kg%n", peso);
        System.out.printf("Seguro:    %s%n", (querSeguro ? "Sim" : "Não"));
        System.out.println("-------------------------------------");
        System.out.printf("TOTAL:     R$ %.2f %n%n", totalFinal);
    }
}