package org.example;

public class PoligonoAdapter extends PoligonoLados {

    private IPoligono poligonoNome;

    public PoligonoAdapter(IPoligono poligonoNome) {
        this.poligonoNome = poligonoNome;
    }

    public String recuperarPoligono() {
        if(this.getLados() == 3)
            poligonoNome.setPoligono("Triangulo");
        else
            if(this.getLados() == 4)
                poligonoNome.setPoligono("Quadrilátero");
            else
                if(this.getLados() == 5)
                    poligonoNome.setPoligono("Pentágono");
                else
                    if(this.getLados() == 6)
                        poligonoNome.setPoligono("Hexágono");
                    else
                        if(this.getLados() == 7)
                            poligonoNome.setPoligono("Heptágono");
                        else
                            if(this.getLados() == 8)
                                poligonoNome.setPoligono("Octógono");
                            else
                                if(this.getLados() == 9)
                                    poligonoNome.setPoligono("Eneágono");
                                else
                                    if(this.getLados() == 10)
                                        poligonoNome.setPoligono("Decágono");
                                    else
                                        poligonoNome.setPoligono("Sem nome");

    return poligonoNome.getPoligono();
    }

    public void salvarPoligono() {
        if(poligonoNome.getPoligono().equals("Triangulo"))
            this.setLados(3);
        else
            if(poligonoNome.getPoligono().equals("Quadrilátero"))
                this.setLados(4);
            else
                if(poligonoNome.getPoligono().equals("Pentágono"))
                    this.setLados(5);
                else
                    if(poligonoNome.getPoligono().equals("Hexágono"))
                        this.setLados(6);
                    else
                        if(poligonoNome.getPoligono().equals("Heptágono"))
                            this.setLados(7);
                        else
                            if(poligonoNome.getPoligono().equals("Octógono"))
                                this.setLados(8);
                            else
                                if(poligonoNome.getPoligono().equals("Eneágono"))
                                    this.setLados(6);
                                else
                                    if(poligonoNome.getPoligono().equals("Decágono"))
                                        this.setLados(7);
                                    else
                                        this.setLados(0);
    }
}
