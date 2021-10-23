import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosInteger {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        //Metodo Scanner para entrar com dados
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();


        System.out.println("Você digitou: " + x);

        sc.close();

    }
}