package domain.models;

import domain.enums.Cor;

public class Retangulo extends FormaGeometricaAbstrata {

    private double base;
    private double altura;

    public Retangulo(Cor cor, double espessura, double base, double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(Cor cor, double espessura, double lado) {
        super(cor, espessura);
        this.base = lado;
        this.altura = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base + 2*espessura) * (altura + 2*espessura);
    }

    @Override
    public double perimetro() {
        return 2*(base + 2*espessura) + 2*(altura + 2*espessura);
    }
}
