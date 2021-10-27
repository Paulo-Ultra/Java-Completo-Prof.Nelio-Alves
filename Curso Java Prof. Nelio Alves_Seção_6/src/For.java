import java.util.Scanner;
public class For {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
      
        /*for (inicio; condição; incremento) { -------- Sintaxe
                inicio executa somente na primeira vez
                condição, se for V retorna do bloco de condição e volta, se F pula fora do bloco de comandos
                incremento executa toda vez depois de voltar
            comando 1
            comando 2
        }*/

        int N = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }


        System.out.println(soma);


        sc.close();
    }
}