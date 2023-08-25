//TODO: Faça um CodeReview (utilizando comentários indicando melhorias)
// para o código do Slide “Regra de Escoteiro” da Aula 1.
// packages: palyer & playerRefactored: https://www.javaguides.net/2018/02/interface-segregation-principle.html
package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Valor percentual: " + processo(120,20));
    }


//  Exercício 2:
//  1- Criar um método para a TaxaServ para que não seja feito muitas chamadas para o banco de dados
//  2- criar uma variável de contexto global desse método
//  3- criar variáveis para todos os serviços, menos o VIP. Este é chamado em um só lugar. Para ele criar um método;
//  4- criar um método geral que vai chamar as classes;

    public static int ServClasseD(){
        //TaxaServ + Hosp
        return 10+350;
    }
    public static int ServClasseC(){
        //TaxaServ + Hosp + Cafe + Almoço
        return 10+350+30+70;
    }
    public static int ServClasseB(){
        //TaxaServ + Hosp + Cafe + Almoço + Janta
        return 10+350+30+70+80;
    }
    public static int ServClasseA(){
        //TaxaServ + Hosp + Cafe + Almoço + Janta + VIP
        return 10+350+30+70+80+500;
    }

//    Exercício 1:
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