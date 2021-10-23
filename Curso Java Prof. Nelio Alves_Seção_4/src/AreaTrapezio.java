import java.util.Locale;

public class AreaTrapezio {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

        double b, B, h, area;
        //Boa prática, indique o tipo do número, se a expressão for de ponto flutuante(não inteira)
        //Para double use: .0       // Para float use: f
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        /*b = 6f;
        B = 8f;
        h = 5f;

        area = (b + B) / 2f * h;

        System.out.println(area);*/



    }
}