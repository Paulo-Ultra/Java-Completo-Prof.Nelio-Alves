import java.util.Locale;

public class Casting {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;
        //Casting -> É a conversão explícita de um tipo para outro.
        System.out.println(resultado);

    }
}
