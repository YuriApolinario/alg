/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class calculadora {
public static void calc(){

}
    public static void pedirNumero() {
        Scanner e = new Scanner(System.in);
        int n,n2;

        System.out.println("Digite um numero");
       n = e.nextInt();

    }

    public static void soma() {
       Scanner e = new Scanner(System.in);
        int n,n2; 
        System.out.println("insira o primeiro numero:");
        n = e.nextInt();
        System.out.println("insira o 2 numero:");
        n2 = e.nextInt();
        System.out.println("o resultado é" + (n + n2));
    }

    public static void dividir(double n) {
        Scanner e = new Scanner(System.in);
        int n,n2; 
        System.out.println("insira o primeiro numero:");
        n = e.nextInt();
        System.out.println("insira o 2 numero:");
        n2 = e.nextInt();
        System.out.println("o resultado é" + (n / n2));
    }

    public static void mutiplicar(int n) {
        Scanner e = new Scanner(System.in);
        int n,n2; 
        System.out.println("insira o primeiro numero:");
        n = e.nextInt();
        System.out.println("insira o 2 numero:");
        n2 = e.nextInt();
        System.out.println("o resultado é" + (n * n2));
    }

    public static void subtrair(int n) {
         Scanner e = new Scanner(System.in);
        int n, n2 ; 
        
        System.out.println("insira o primeiro numero:");
        n = e.nextInt();
        
        System.out.println("insira o 2 numero:");
        n2 = e.nextInt();
        
        System.out.println("o resultado é" + (n - n2));
    }

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("--1 Soma--------------");
        System.out.println("--2 multiplicação-----");
        System.out.println("--3");
        if (n == 1) {
            return "";
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

        }
        
        
    }

}
