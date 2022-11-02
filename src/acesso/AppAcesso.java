package acesso;

public class AppAcesso {
    public static void main(String[] args) throws Exception{
        
        System.out.println("Encapsulamento");
        
        Acesso Pessoa = new Acesso();

        Pessoa.setCPF("05949393930");
        Pessoa.setNome("Marcelo");
        System.out.println("CPF: " + Pessoa.getCPF() + "\nNome: " + Pessoa.getNome());
    }
}
