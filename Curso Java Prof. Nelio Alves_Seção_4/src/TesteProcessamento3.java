import java.util.Locale;

public class TesteProcessamento3 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = a / b;
        //Como as variaveis são inteiras e o compilador entende que o resultado será número inteiro, por isso o resultado será 2.0 e não 2.5
        System.out.println(resultado);

    }
}