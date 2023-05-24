public class PessoaFisica extends Clientes{

    public PessoaFisica(String nome, String endereço, String telefone,String cpf) {
        super(nome, endereço, telefone,1);
        //TODO Auto-generated constructor stub
        this.cpf = cpf;
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




} 