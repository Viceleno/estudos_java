
import Retangulo.Retangulo;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo rec = new Retangulo();

        System.out.println("Diga qual e a altura do retangulo!");
        rec.altura = sc.nextDouble();
        System.out.println();
        System.out.println("Diga qual e a largura do retangulo!");
        rec.largura = sc.nextDouble();
        System.out.println();
        System.out.printf("A area do retangulo e: %.2f%n", rec.area());
        System.out.println();
        System.out.printf("O perimetro do retangulo e: %.2f%n", rec.perimetro());
        System.out.println();
        System.out.printf("A diagonal do retangulo e: %.2f%n", rec.diagonal());

        sc.close();
    }
    
}
