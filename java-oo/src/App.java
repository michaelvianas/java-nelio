import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três valores");
        System.out.print("Número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Número 2: ");
        int num2 = sc.nextInt();
        System.out.print("Número 3: ");
        int num3 = sc.nextInt();

        int maior = Math.max(num1, num2);

        System.out.println("Valor maior entre num1 e num2 é " + maior);

    }
}
