import java.util.Locale;

public class VariosElementosNoMesmoComando {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d e ganha %.2f reais%n", nome, idade, renda);

    }
}