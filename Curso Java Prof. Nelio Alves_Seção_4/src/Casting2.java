import java.util.Locale;

public class Casting2 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

        double a;
        int b;

        a = 5.0;
        b = (int) a;

        //Quando o compilador entende que você vai perder uma informação é necessário usar o casting
        System.out.println(b);

    }
}
