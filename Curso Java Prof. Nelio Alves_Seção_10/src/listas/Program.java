package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //List é uma interface e ArrayList a implementa assim como a LinkedList
        //ArrayList pega as características de uma lista encadeada e junta com as de array para ajudar no acesso sequencial a elementos
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

//        list.remove("Maria");
//        list.remove(1);


        System.out.println(list.size());
        for(String x : list) {
            System.out.println(x);
        }
        //Método de remover usando predicado: // /*todo String x tal que x.charAt(0) seja igual a "M" */
        //Predicado porque retorna se é verdadeiro ou falso
        list.removeIf(x -> x.charAt(0) == 'M'); //Pega a primeira letra dos nomes na posição 0
        System.out.println("------------------");
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        //quando retorna verdadeiro o método retorna 1
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        //quando retorna falso o método retorna -1
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        System.out.println("------------------");

        //O stream aceita funções lambdas Java 8 em diante
        //funcção filter recebe o predicado, mas ele não é compativel com list
        //O tipo list recebe o collect(Collectors.toList()) para poder ser usada funcção lambda
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
