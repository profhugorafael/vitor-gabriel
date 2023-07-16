package domain.models;

import domain.enums.Cor;
import domain.interfaces.FormaGeometrica;

public abstract class FormaGeometricaAbstrata implements FormaGeometrica {

    private Cor cor;
    protected double espessura;

    protected FormaGeometricaAbstrata(Cor cor, double espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public double getEspessura() {
        return espessura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }

    public Cor getCor() {
        return this.cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

}
