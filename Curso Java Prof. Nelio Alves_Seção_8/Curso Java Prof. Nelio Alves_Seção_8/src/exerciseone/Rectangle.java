package exerciseone;

public class Rectangle {
    public double widht;
    public double height;

    public double area() {
       return widht * height;
    }

    public double perimeter () {
        double per;
        return per = 2 * (widht + height);
    }

    public double diagonal () {
        return Math.sqrt(widht * widht + height * height);
    }
}
