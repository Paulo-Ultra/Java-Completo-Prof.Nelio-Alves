package membrosestaticos.exercise;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double dollar, double dollarAmount) {
        return dollar * dollarAmount * (1.0 + IOF);

    }
}
