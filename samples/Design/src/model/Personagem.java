package model;

public class Personagem {
    private String nome;
    private double forca;
    private double velocidade;
    private double defesa;

    public Personagem(String nome, double forca, double velocidade, double defesa) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", forca=" + forca +
                ", velocidade=" + velocidade +
                ", defesa=" + defesa +
                '}';
    }
}
