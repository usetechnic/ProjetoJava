package Automovel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Automóvel \n");

        Automovel Carro = new Automovel();

        //objeto.método abaixo
        // Carro.AlterarCor("branco");
        // System.out.println("Cor: " + Carro.cor + "\n");

        // Carro.AlterarValor(10000);
        // System.out.println("Valor (R$): " + Carro.valor + "\n");
        
        // Carro.AlterarAno(2020);
        // System.out.println("Ano: " + Carro.ano + "\n");
        
        // Carro.AlterarMarca("Fiat");
        // System.out.println("Marca: " + Carro.marca + "\n");

        //configurando o set porque coloquei as variáveis como privado
        Carro.setCor("branco");
        Carro.setValor(90000.0);
        Carro.setAno(2002);
        Carro.setMarca("chevrolet");

        //exibindo na tela com o get que foi configurado no set dentro do arquivo Automovel
        System.out.println("A cor é: \n" + Carro.getCor());
        System.out.println("O valor é: \n" + Carro.getValor());
        System.out.println("O ano é: ");
        System.out.println(Carro.getAno());
        System.out.println("A marca é: \n" + Carro.getMarca());
        
    }
}

