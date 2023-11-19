package br.com.iterasys;

public class CalculadoraChatGBT {

    // Função para calcular a área do quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Função para calcular a área do retângulo
    public static double calcularAreaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    // Função para calcular a área do triângulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Função para calcular a área do círculo
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        // Exemplos de uso das funções
        double ladoQuadrado = 5.0;
        double comprimentoRetangulo = 6.0;
        double larguraRetangulo = 4.0;
        double baseTriangulo = 8.0;
        double alturaTriangulo = 5.0;
        double raioCirculo = 3.0;

        // Calcular e exibir as áreas
        System.out.println("Area do quadrado: " + calcularAreaQuadrado(ladoQuadrado));
        System.out.println("Area do retangulo: " + calcularAreaRetangulo(comprimentoRetangulo, larguraRetangulo));
        System.out.println("Area do triangulo: " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
        System.out.println("Area do círculo: " + calcularAreaCirculo(raioCirculo));
    }
}


