public class PessoaFisica extends Clientes {

    public PessoaFisica(String nome, String endereço, String telefone, String cpf, int valorContaDinheiro) {
        super(nome, endereço, telefone, valorContaDinheiro);
        // TODO Auto-generated constructor stub
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