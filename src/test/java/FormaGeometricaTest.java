import org.example.FormaGeometrica;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormaGeometricaTest {

    @Test
    public void deveRetornarNomePoligono() {
        FormaGeometrica formaGeometrica = new FormaGeometrica();
        formaGeometrica.setPoligono("Triangulo");
        assertEquals("Triangulo", formaGeometrica.getPoligono());
    }

    @Test
    public void deveRetornarLadosPoligono() {
        FormaGeometrica formaGeometrica = new FormaGeometrica();
        formaGeometrica.setPoligono("Triangulo");
        assertEquals(3, formaGeometrica.getLados());
    }
}
