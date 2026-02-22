

package entities;

public class Retangulo {
    public double a;
    public double b;

    public double area() {
      double p = a*b;
      return p;
    }

    public double perimetro() {
      double c = 2*(a+b);
      return c;
    }

    public double diagonal() {
        double d = Math.sqrt(a*a+b*b);
    }
}
