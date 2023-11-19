package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraTest {

    @Test
    public static void chamarQuadrado() {
        int lado = 5;
        int resultadoEsperado = 25;
        int resultadoCalculado = Calculadora.calcularQuadrado(lado);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado);

    }

    @Test
    public static void chamarRetangulo() {
        int lado = 2;
        int altura = 4;
        int resultadoEsperado = 8;
        int resultadoCalculado = Calculadora.calcularRetangulo(lado, altura);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado);


    }

    @Test
    public static void chamarTriangulo() {
        int lado = 10;
        int altura = 8;
        int resultadoEsperado = 40;
        int resultadoCalculado = Calculadora.calcularTriangulo(lado, altura);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado);


    }

    @Test
    public static void chamarCirculo() {
        double raio = 5;
        double pi = 3.1428;
        double resultadoEsperado = 78.57;
        double resultadoCalculado = Calculadora.calcularCirculo(raio, pi);
        Assert.assertEquals(resultadoCalculado, resultadoEsperado);

    }
}
