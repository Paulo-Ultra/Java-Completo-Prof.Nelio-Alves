import java.util.Scanner;
public class CondicionalComposta {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();
        //Condição dentro do parênteses ()
        if ( hora < 12) {
            System.out.println("Bom dia");
            //Comandos dentro das chaves {}
            //Se a condição for verdadeira é executado o bloco de comandos
            //Se não, pula o bloco de comandos e executa o comando do "else"
        }
        else {
            System.out.println("Boa tarde");
        }

        sc.close();
    }
}