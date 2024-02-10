package Retangulo;

public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        return largura * altura;
    }

    public double perimetro() {
        return 2 * altura + 2 * largura;
    }

    public double diagonal() {
        return Math.sqrt((altura * altura) + (largura * largura));
    }
    
}
