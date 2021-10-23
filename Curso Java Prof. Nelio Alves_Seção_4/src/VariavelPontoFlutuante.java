import java.util.Locale;

public class VariavelPontoFlutuante {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        double x = 10.35784;

        System.out.println(x);

        //Regra para printf

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //Regra para print e println

        System.out.println ("Resultado = " + x + " Metros");


    }
}
