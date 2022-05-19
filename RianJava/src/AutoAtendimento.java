public class AutoAtendimento {
    static Banco banco = new Banco();

    public static void main(String[] args) throws Exception {
    }


    //CONSTRUCTORS
    public static void loginCliente(int numConta, int senha){

    }

    public static boolean loginGerente(int numAgencia, int senha){
        if((banco.getAgencia() == numAgencia) &&(banco.getSenhaGerente() == senha)){
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado!!! Por favor digite seus dados novamente");
        }
        return true;
    }

    public static void cadastrarCliente(Cliente novo){
        novo.setNome() = "rian";

    }

    public void excluirCliente(long CPF){

    }

    public void clienteSacar(float valor, int senha){

    }

    public void clienteDepositar(float valor){

    }

    public void clienteVerificarSaldo(int senha){

    }
    


}
