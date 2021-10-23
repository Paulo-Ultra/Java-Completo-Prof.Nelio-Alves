import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosVariosDados {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        //Metodo Scanner para entrar com dados
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();


        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f", z);


        
        sc.close();

    }
}