package org.example;

public class PoligonoNome implements IPoligono {

    private String nomenclatura;

    @Override
    public String getPoligono() {
        return this.nomenclatura;
    }

    @Override
    public void setPoligono(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }
}
