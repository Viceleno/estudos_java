package Empregado;

public class Emp {
    public String nome;
    public double salario_bruto;
    public double imposto;

    public double salario_liquido() {
        return salario_bruto - imposto;
    }

    public void salario_com_taxa(double per) {
        salario_bruto += salario_bruto * per/100.00;
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f", salario_liquido());
    }
    
}
