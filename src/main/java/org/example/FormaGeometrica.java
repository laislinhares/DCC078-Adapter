package org.example;

public class FormaGeometrica {

    IPoligono poligono;
    PoligonoAdapter persistencia;

    public FormaGeometrica() {
        poligono = new PoligonoNome();
        persistencia = new PoligonoAdapter(poligono);
    }

    public void setPoligono(String polig) {
        poligono.setPoligono(polig);
        persistencia.salvarPoligono();
    }

    public String getPoligono() {
        return persistencia.recuperarPoligono();
    }

    public int getLados() {
        return persistencia.getLados();
    }
}
