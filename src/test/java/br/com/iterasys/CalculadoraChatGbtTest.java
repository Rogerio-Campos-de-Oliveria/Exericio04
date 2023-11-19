package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraChatGbtTest {

    @Test
    public void testAreaQuadrado() {
        double lado = 5.0;
        double resultadoEsperado = 25.0;
        double resultadoCalculado = CalculadoraChatGBT.calcularAreaQuadrado(lado);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado, 0.0001);
    }

    @Test
    public void testAreaRetangulo() {
        double comprimento = 6.0;
        double largura = 4.0;
        double resultadoEsperado = 24.0;
        double resultadoCalculado = CalculadoraChatGBT.calcularAreaRetangulo(comprimento, largura);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado, 0.0001);
    }

    @Test
    public void testAreaTriangulo() {
        double base = 8.0;
        double altura = 5.0;
        double resultadoEsperado = 20.0;
        double resultadoCalculado = CalculadoraChatGBT.calcularAreaTriangulo(base, altura);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado, 0.0001);
    }

    @Test
    public void testAreaCirculo() {
        double raio = 3.0;
        double resultadoEsperado = 28.2743;
        double resultadoCalculado = CalculadoraChatGBT.calcularAreaCirculo(raio);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado, 0.0001);
    }
}




