import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosChar {
    public static void main(String args[]) {
        //O Locale nesse caso é importante para usar o "." e não "," no estilo do Brasil
        Locale.setDefault(Locale.US);
        //Metodo Scanner para entrar com dados
        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);


        System.out.println("Você digitou: " + x);

        sc.close();

    }
}