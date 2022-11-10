package Automovel;

import java.util.Scanner;

public class carro extends Automovel {

    String tracao;

   public carro(){
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

public String getPolegada(){
    return tracao;
}
public String setPolegada(String t){
    System.out.println("Coloque o tamanho da roda");
    try (Scanner Dadoinformado = new Scanner(System.in)) {
        String t2 = Dadoinformado.nextLine();
        return tracao = t2;
    }
}
}

// public class carro extends Automovel {
//     //super(Aut)

//      void AlterarCor(){
//         System.out.println("Coloque uma outra cor:");
//          String OutraCor = Dadoinformado.nextLine();
//          cor = OutraCor;
//          System.out.println("Outra cor:" + cor);
//     }

//     void AlterarValor(){
//         System.out.println("Coloque um outro valor:");
//         Double OutroValor = Dadoinformado.nextDouble();
//         valor = OutroValor;
//         System.out.println("Outro valor:" + valor);
//     }

//     void AlterarAno(){
//         System.out.println("Coloque um outro ano:");
//         int OutroAno = Dadoinformado.nextInt();
//         ano = OutroAno;
//         System.out.println("Outro ano:" + ano);
//     }

//     void AlterarMarca(){
//         System.out.println("Coloque um outra marca:");
//         String OutraMarca = Dadoinformado.nextLine();
//         marca = OutraMarca;
//         System.out.println("Outra marca:" + marca);
// }
// }

// package Automovel;

// public class carro extends Automovel {

//     public carro() {
//         super(cor, valor, ano, marca);
//     }

//     // configurando o get porque as variáveis são privadas
//     public String getCor() {
//         return cor;
//     }

//     // configurando o set porque as variáveis são privadas
//     public String setCor(String Cor) {
//         return cor = Cor;
//     }

//     // configurando o get porque as variáveis são privadas
//     public Double getValor() {
//         return valor;
//     }

//     // configurando o set porque as variáveis são privadas
//     public Double setValor(Double Valor) {
//         return valor = Valor;
//     }

//     // configurando o get porque as variáveis são privadas
//     public int getAno() {
//         return ano;
//     }

//     // configurando o set porque as variáveis são privadas
//     public int setAno(int Ano) {
//         return ano = Ano;
//     }

//     // configurando o get porque as variáveis são privadas
//     public String getMarca() {
//         return marca;
//     }

//     // configurando o set porque as variáveis são privadas
//     public String setMarca(String Marca) {
//         return marca = Marca;
//     }

// }
