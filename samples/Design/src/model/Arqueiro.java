package model;

public class Arqueiro extends Personagem {
    private double precisao;
    private double agilidade;

    public Arqueiro(String nome, double forca, double velocidade, double defesa, double precisao, double agilidade) {
        super(nome, forca, velocidade, defesa);
        this.precisao = precisao;
        this.agilidade = agilidade;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public String toString() {
        return "Arqueiro{" +
                "precisao=" + precisao +
                ", agilidade=" + agilidade +
                '}';
    }
}
