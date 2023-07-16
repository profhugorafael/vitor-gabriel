package domain.models;

import domain.enums.Cor;
import domain.interfaces.FormaGeometrica;

public class Circulo extends FormaGeometricaAbstrata {

    public static final double PI = 3.14159265;
    private double raio;

    public Circulo(Cor cor, double espessura, double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*(raio + espessura)*(raio + espessura);
    }

    @Override
    public double perimetro() {
        return 2*(raio+espessura)*PI;
    }
}
