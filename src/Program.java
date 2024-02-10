import Entidade.Produto;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Entre com as informacoes do produto: ");
        System.out.print("Nome: ");
        produto.name = sc.nextLine();
        System.out.print("Preco: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantity = sc.nextInt();
        System.out.println();
        System.out.println("Dados do produto: " + produto);
        
        System.out.println();

        System.out.println("Entre com um numero de produtos a ser adicionado no estoque: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        System.out.println();
        System.out.println("Atualizacao dos dados do produto: " + produto);

        System.out.println();

        System.out.println("Entre com um numero de produtos a ser removidos no estoque: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println();
        System.out.println("Atualizacao dos dados do produto: " + produto);

        sc.close();
    }
}
