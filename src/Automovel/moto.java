
package Automovel;

import java.util.Scanner;

public class moto extends Automovel {
    
    String estado;
    int polegadas;

   public moto(){
    super(cor, valor, ano, marca);
   }
   
   public String getCor(){
    return cor;
}

public String setCor(String c) {
    System.out.println("coloque uma cor");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        String c2 = Dadoinformado.nextLine();
        return cor = c2;
    }
}

public double getValor(){
    return valor;
}

public double setValor(double v) {
    System.out.println("Coloque um valor");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        double v2 = Dadoinformado.nextDouble();
        return valor = v2;
    }
}


public int getAno(){
    return ano;
}

public int setAno(int a) {
    System.out.println("Coloque um ano");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        int a2 = Dadoinformado.nextInt();
        return ano = a2;
    }
}


public String getMarca(){
    return marca;
}

public String setMarca(String m) {
    System.out.println("Coloque uma marca");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        String m2 = Dadoinformado.nextLine();
        return marca = m2;
    }
}

public int getPolegada(){
    return polegadas;
}

public int setPolegada(int p){
    System.out.println("Coloque o tamanho da roda");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        int p2 = Dadoinformado.nextInt();
        return polegadas = p2;
    }
}

public String getEstado(){
    return estado;
}

public String setEstado(String e){
    System.out.println("Estado do carro:");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        String e2 = Dadoinformado.nextLine();
        return estado = e2;
    }
}
}
