package banco;
import java.util.Scanner;
public class bancos {
    Scanner Dadoinformado = new Scanner(System.in);
    String nome;
    //int NumConta; mais para frente elaborar isso
    double ConSald;
    int deposito;
    int transferencia;
    int saque;

    void CadCliente(){
        System.out.println("Seu nome: ");
        String nomeCliente = Dadoinformado.nextLine();
        nome = nomeCliente;

        System.out.println();
          
        if (nome != null) {
            System.out.println("Cliente: " + nome + "\n");
        } 
        else {
            System.out.println("Cliente não cadastrado");
        }
    }
    
    void Depositar(){
        System.out.println("Digite o valor do depósito");
        int Deposito = Dadoinformado.nextInt();
        deposito = Deposito;
        System.out.println("Você depositou " + deposito + " reais \n");
    }

    void Transferir(){
        System.out.println("Digite o valor da transferência: ");
        int Transferencia = Dadoinformado.nextInt();
        transferencia = Transferencia;
        System.out.println("Valor trasferido foi: " + transferencia + " reais \n");
    }

     void Consultar(){
        System.out.println("Seu saldo é: ");
        System.out.println(deposito - transferencia + " reais \n");
    }

    void Sacar(){
        System.out.println("Quanto você quer sacar?");
        int sacar = Dadoinformado.nextInt();
        deposito -= sacar;
        System.out.println("O valor sacado foi " + sacar + " reais");
    }
}
