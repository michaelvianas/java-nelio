import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);

    Triangle x = new Triangle();
    Triangle y = new Triangle();

    System.out.println("Entre com as medidas do triângulo X");
    x.a = scan.nextDouble();
    x.b = scan.nextDouble();
    x.c = scan.nextDouble();

    System.out.println("Entre com as medidas do triângulo Y");
    y.a = scan.nextDouble();
    y.b = scan.nextDouble();
    y.c = scan.nextDouble();

    double areaX = x.calcularArea();

    double areaY = y.calcularArea();

    System.out.printf("Área do triângulo X: %.4f\n", areaX);
    System.out.printf("Área do triângulo Y: %.4f\n", areaY);

    if (areaX > areaY) {
      System.out.println("Maior área: triângulo X");
    } else
      System.out.println("Maior área: triângulo Y");

    scan.close();
  }
}
