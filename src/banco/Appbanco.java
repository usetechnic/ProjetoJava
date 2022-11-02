package banco;

public class Appbanco {

   public static void main(String[] args) {
    System.out.println("Seu banco \n");

    bancos Cliente = new bancos();

    Cliente.CadCliente();
    Cliente.Depositar();
    Cliente.Transferir();
    Cliente.Consultar();
    Cliente.Sacar();
    }
}
