/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Random;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author aluno
 */
public class atividade {

// Crie uma função para pedir um número inteiro ao usuário. 
//    Toda vez que você precisar de um número informado pelo usuário, 
//    utilize ela. Ela não tem parâmetro e o retorno é o valor digitado pelo usuário.
    public static int InserirNumero() {
        Scanner e = new Scanner(System.in);
        System.out.println("digite um numero:");
        int num = e.nextInt();

        return num;

    }
//Faça uma função para gerar números aleatórios. 
//    Esta função deve receber um número inteiro como limite de valor
//            e retornar um número entre 1 e esse limite. Assim, toda vez 
//                    que você precisar de um número qualquer pode usar a função
//                            do exercício anterior ou a deste.

    public static int NumAleatorio() {
        Random r = new Random();

        int n = r.nextInt(60);
        System.out.println(n);

        return n;
    }
//Faça uma função que receba um número inteiro e imprima o mês correspondente ao número. Por exemplo,
//  2 corresponde à “fevereiro”. A função deve mostrar uma mensagem de erro caso 
//  o número recebido não faça sentido.  Dica: verifique no texto o tipo do retorno
//  e o tipo do parâmetro. Em funções eles podem ser iguais ou diferentes, não tem problema.

    public static String mes() {

        int n = InserirNumero();

        String mes;
        if (n == 1) {
            return "Janeiro";
        } else if (n == 2) {
            return "Fevereiro";
        } else if (n == 3) {
            return "Março";

        } else if (n == 4) {
            return "Abril";

        } else if (n == 5) {
            return "Maio";
        } else if (n == 6) {
            return "Junho";
        } else if (n == 7) {
            return "Julho!";

        } else if (n == 8) {
            return "Agosto!";
        } else if (n == 9) {
            return "Setembro";
        } else if (n == 10) {
            return "Outubro!";
        } else if (n == 11) {
            return "novembro!";
        } else if (n == 12) {
            return "Dezembro";

        } else {
            return "Numero invalido";
        }

    }

    public static void main(String[] args) {

//        NumAleatorio();
System.out.println("O mês é " + mes());
    }

}
