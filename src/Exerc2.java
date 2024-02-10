import Empregado.Emp;
import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp empregado = new Emp();

        System.out.println("Nome do Empregado:");;
        empregado.nome = sc.nextLine();
        System.out.println("Salário bruto do Empregado:");;
        empregado.salario_bruto = sc.nextDouble();
        System.out.println("Imposto a ser retirado do salario do Empregado:");;
        empregado.imposto = sc.nextDouble();

        System.out.println("Empregado: " + empregado);
        System.out.println("Qual o percentual incrementado no salario?");
        double per = sc.nextDouble();
        empregado.salario_com_taxa(per);
        System.out.println();
        System.out.println("Novos dados do empregados: " + empregado);

        sc.close();
    }
}
