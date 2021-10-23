import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosDouble {
    public static void main(String args[]) {
        //O Locale nesse caso é importante para usar o "." e não "," no estilo do Brasil
        Locale.setDefault(Locale.US);
        //Metodo Scanner para entrar com dados
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();


        System.out.printf("Você digitou: %.2f", x);

        sc.close();

    }
}