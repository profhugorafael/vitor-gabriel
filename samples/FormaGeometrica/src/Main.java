import domain.models.Circulo;
import domain.models.FormaGeometricaAbstrata;
import domain.models.Retangulo;
import domain.enums.Cor;

public class Main {

    public static void imprimaSobre(FormaGeometricaAbstrata forma) {
        System.out.println("Area: " + forma.area());
        System.out.println("Perimetro: " + forma.perimetro());
    }

    public static void main(String[] args) {
        // codigo ruim é um código dificil de mudar, extender e entender
        // Retangulo retangulo = new Retangulo();
        imprimaSobre(new Circulo(Cor.ROSA, 1.0, 2.0));
        imprimaSobre(new Retangulo(Cor.AMARELO, 2.0, 4.0));

        var pi = Circulo.PI;
    }
}