package boxingunboxingandwrapperclasses;

public class Program {
    public static void main(String[] args) {

        //Boxing coloca um valor de uma variável em um objeto
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        //Para fazer o unboxing é necessário fazer o casting
        //Unboxing traz do objeto e coloca em uma variável o valor.
        int y = (int) obj;

        System.out.println(y);

        //Wrapper Classes - São classes equivalentes aos tipos primitivos


        int z = 20;
        //classe Integer, assim não é necessário fazer o casting com as classes wrapper

        Integer obj1 = z;

        System.out.println(obj1);

        int w = obj1 * 2;

        System.out.println(w);
    }
}
