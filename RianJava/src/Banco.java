import java.util.ArrayList;

public class Banco {
    private String nome = "Banco UFMA";
    private int agencia = 26034;
    private ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
    private int senhaGerente = 123;
    
    //GGETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        Clientes = clientes;
    }
    public int getSenhaGerente() {
        return senhaGerente;
    }
    public void setSenhaGerente(int senhaGerente) {
        this.senhaGerente = senhaGerente;
    }

    //CONSTRUCTORS
    public void cadastrarCliente(Cliente novo){

    }

    public void excluirCliente(long CPF){

    }



}
