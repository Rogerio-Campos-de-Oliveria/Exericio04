// 1 - Pacote
package br.com.iterasys;
// Lista de Exercícios 04
// Exercício 1:
// 1 - Crie funções que calculem a área das seguintes formas geométricas: quadrado, retângulo, triangulo e circulo
// 2 - Peça para o ChatGPT criar essas mesmas funções. Compare o resultado com o seu
// 3 - Crie os testes de unidade simples para as suas funções
// 4 - Peça para o ChatGPT criar os testes de unidade simples para as funções que ele criou


// 2 - Importação de Bibliotecas

// 3 - Classe
public class Calculadora {
    // 3.1 - Atributos

    // 3.2 - Funções e Métodos
    public static int calcularQuadrado(int lado){

        int  area = lado * lado;
        System.out.println("A area total do quadrado e " + area);
        return area;

    } // fim do calcularQuadrado

    public static int calcularRetangulo(int lado, int altura ){

        int  area = lado * altura;
        System.out.println("A area total do retangulo e " + area);
        return area;

    } // fim do calcularRetangulo

    public static int calcularTriangulo(int lado, int altura ){

        int  area = (lado * altura) / 2;
        System.out.println("A area total do triangulo e " + area);
        return area;

    } // fim do calcularTriangulo

    public static double calcularCirculo(double raio, double pi ){

        double  area = raio * raio * pi;
        System.out.println("A area total do circulo e " + area);
        return area;

    } // fim do calcularCirculo

} // fim da classe Calculadora
