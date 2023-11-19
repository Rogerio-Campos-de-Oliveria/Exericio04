package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculadoraTestDD {
    @DataProvider(name = "CalcularRetangulo")
    public Object [][] calcularRetanguloDD() {
        return new Object[][]{
                {4, 4,  16},
                {5, 10, 50},
                {6, 8, 48},
                {8, 9, 72}

        };
    }


    @Test(dataProvider = "CalcularRetangulo")
    public void calcualarRetanguloDD(int num1, int num2, int resultadoEsperado){


    int resultadoAtual =Calculadora.calcularRetangulo(num1, num2);


    Assert.assertEquals(resultadoAtual,resultadoEsperado);

    }




    @DataProvider(name = "CalcularQuadrado")
    public Object[][] calcularQuadrado() {
        return new Object[][]{
                {4, 16},
                {5, 25},
                {7, 49},
                {8, 64},
                {9, 81},

        };
    }

    @Test(dataProvider = "CalcularQuadrado")
    public void calcularQuadradoDD(int num1, int resultadoEsperado){

    int resultadoAtual = Calculadora.calcularQuadrado(num1);

    Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }



    @DataProvider(name = "CalcularTriangulo")
    public Object[][] calcularTriangulo() {
        return new Object[][]{
                {4,  9, 18},
                {5, 10, 25},
                {6,  8, 24},
                {7, 10, 35}

        };

    }

    @Test(dataProvider = "CalcularTriangulo")
    public void calcularTrianguloDD ( int num1, int num2, int resultadoEsperado){

    int resultadoAtual = Calculadora.calcularTriangulo(num1, num2);

    Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }


}
