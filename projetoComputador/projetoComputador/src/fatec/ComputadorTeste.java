package fatec;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {

        Computador computadorHP = new Computador();

        computadorHP.marca = "HP";

        computadorHP.imprimir();
        computadorHP.calcularValor();
        computadorHP.imprimir();

        Computador computadorIBM = new Computador();

        computadorIBM.marca = "IBM";

        computadorIBM.imprimir();
        computadorIBM.calcularValor();
        computadorIBM.imprimir();


        computadorIBM.alterarValor(computadorIBM.alterarValor(1));








    }
}
