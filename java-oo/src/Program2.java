import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = leia.nextLine();
        System.out.print("Preço: ");
        produto.preco = leia.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = leia.nextInt();

        System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);

        leia.close();
    }
}