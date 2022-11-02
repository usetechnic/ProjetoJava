package Automovel;

public class carro extends Automovel {

    public carro() {
        super(cor, valor, ano, marca);
    }

    // configurando o get porque as variáveis são privadas
    public String getCor() {
        return cor;
    }

    // configurando o set porque as variáveis são privadas
    public String setCor(String Cor) {
        return cor = Cor;
    }

    // configurando o get porque as variáveis são privadas
    public Double getValor() {
        return valor;
    }

    // configurando o set porque as variáveis são privadas
    public Double setValor(Double Valor) {
        return valor = Valor;
    }

    // configurando o get porque as variáveis são privadas
    public int getAno() {
        return ano;
    }

    // configurando o set porque as variáveis são privadas
    public int setAno(int Ano) {
        return ano = Ano;
    }

    // configurando o get porque as variáveis são privadas
    public String getMarca() {
        return marca;
    }

    // configurando o set porque as variáveis são privadas
    public String setMarca(String Marca) {
        return marca = Marca;
    }

}
