import java.util.Scanner;
public class While {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);


        int soma = sc.nextInt();
        int resultado = 0;
        while(soma != 0){
            resultado += soma;
            soma = sc.nextInt();
        }
        /*while (condição) { -------- Sintaxe
            comando 1
            comando 2
        }*/

        System.out.println(resultado);


        sc.close();
    }
}