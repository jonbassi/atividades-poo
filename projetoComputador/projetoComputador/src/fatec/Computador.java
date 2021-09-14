package fatec;

import java.util.Scanner;

public class Computador {

    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("Marca: "+marca);
        System.out.println("Cor: "+cor);
        System.out.println("Modelo: "+modelo);
        System.out.println("Número de série: "+numeroSerie);
        System.out.println("Preço: "+preco);
    }

    public void calcularValor(){
        if(marca == "HP"){
            preco += (preco * 30)/100;
        }else{
            if(marca == "IBM"){
                preco += (preco * 50)/100;
            }
        }
    }

    public int alterarValor(int valor){
        preco += valor;
        if(valor >0){
            System.out.println("Valor alterado");
            return 1;
        }else{
            System.out.println("Valor não alterado");
            return 0;
        }

    }

}
