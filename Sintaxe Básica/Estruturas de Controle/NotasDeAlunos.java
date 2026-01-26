import java.util.Arrays;

public class NotasDeAlunos {
    public static void main(String[] args) {
        double[] nota = new double[4];

        nota[0] = 7.5;
        nota[1] = 8.0;
        nota[2] = 3.4;
        nota[3] = 10.0;

        double media = Arrays.stream(nota).sum() / nota.length;

        System.out.println(media);
    }
}
