package Automovel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Monte sua moto \n");
        moto moto = new moto();



        moto.setCor("");
        moto.setValor(0);
        moto.setAno(0);        
        moto.setMarca(null);
        moto.setPolegada(0);
        moto.setEstado(null);
        System.out.println("Cor: " + moto.getCor() + "\n Valor: " + moto.getValor() + "\n Ano: " + moto.getAno() + "\n Marca: " + moto.getMarca() + "\n Tamanho da roda: " + moto.getPolegada() + "\n Estado do carro: " + moto.getEstado());

        //objeto.método abaixo
        // Carro.AlterarCor("branco");
        // System.out.println("Cor: " + Carro.cor + "\n");

        // Carro.AlterarValor(10000);
        // System.out.println("Valor (R$): " + Carro.valor + "\n");
        
        // Carro.AlterarAno(2020);
        // System.out.println("Ano: " + Carro.ano + "\n");
        
        // Carro.AlterarMarca("Fiat");
        // System.out.println("Marca: " + Carro.marca + "\n");

}
}
