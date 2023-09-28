import org.example.FormaGeometrica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FormaGeometricaTest {

    @Test
    void deveRetornarNomePoligono() {
        FormaGeometrica formaGeometrica = new FormaGeometrica();
        formaGeometrica.setPoligono("Triangulo");
        assertEquals("Triangulo", formaGeometrica.getPoligono());
    }

    @Test
    void deveRetornarLadosPoligono() {
        FormaGeometrica formaGeometrica = new FormaGeometrica();
        formaGeometrica.setPoligono("Triangulo");
        assertEquals(3, formaGeometrica.getLados());
    }
}
