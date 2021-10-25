import java.util.Scanner;
public class IfDentroDeOutroIf {
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
        //Pode ser criado um bloco de if dentro de um else, contudo sempre lembrar que o else não tem condição
        else if(hora < 18){
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}