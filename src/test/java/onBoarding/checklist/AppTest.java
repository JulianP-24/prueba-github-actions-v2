package onBoarding.checklist;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private calculadora calculadoraTest;

    @Before
    public void setup() {
        calculadoraTest = new calculadora();
    }

    @Test
    public void deberiaCalcularLaSumaBien() {
        double resEsperado = 25;
        double respuesta = calculadoraTest.suma(10, 15);
        assertEquals(resEsperado, respuesta, 0);
    }

    @Test
    public void deberiaCalcularLaRestaBien() {
        double resEsperado = -5;
        double respuesta = calculadoraTest.resta(10, 15);
        assertEquals(resEsperado, respuesta, 0);
    }

    @Test
    public void deberiaCalcularLaRestaBienCaso2() {
        double resEsperado = 75;
        double respuesta = calculadoraTest.resta(100, 25);
        assertEquals(resEsperado, respuesta, 0);
    }

    @Test
    public void deberiaCalcularLaMultiplicacionBien() {
        double resEsperado = 25;
        double respuesta = calculadoraTest.multiplicacion(5, 5);
        assertEquals(resEsperado, respuesta, 0);
    }

    @Test
    public void deberiaCalcularLaMultiplicacionBienCaso2() {
        double resEsperado = 0;
        double respuesta = calculadoraTest.multiplicacion(5, 0);
        double respuesta1 = calculadoraTest.multiplicacion(0, 5);
        assertEquals(resEsperado, respuesta, 0);
        assertEquals(resEsperado, respuesta1, 0);
    }

    @Test
    public void deberiaCalcularLaDivisionBien() {
        double resEsperado = 2;
        double respuesta = calculadoraTest.division(8, 4);
        assertEquals(resEsperado, respuesta, 0);
    }

}