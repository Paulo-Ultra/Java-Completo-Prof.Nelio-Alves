import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosString {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        //Metodo Scanner para entrar com dados
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();


        System.out.println("Você digitou: " + x);

        sc.close();

    }
}