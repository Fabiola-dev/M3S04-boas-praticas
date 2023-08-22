//TODO: Faça um CodeReview (utilizando comentários indicando melhorias)
// para o código do Slide “Regra de Escoteiro” da Aula 1.

package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Valor percentual: " + processo(120,20));
    }

//    1- alterar o nome do método para um que deixe claro o que o método faz;
//    2- nome das variáveis indicando o que elas representam;
//    3- usar 'p' antes do nome da variável, parâmetro;
//    4- como é uma operação simples, não é preciso declarar uma variável. Fazer
//    o cálculo já no return

    public static double processo(double x, double y) {
        double resultado = 0;
        resultado = x * (y/100);
        return resultado;
    }
}