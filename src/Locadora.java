import java.util.ArrayList;

public class Locadora {

    private String nome;
    private String endereço;
    private String telefone;

    public Locadora(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    ArrayList<Carro> crr = new ArrayList<Carro>();
    ArrayList<Clientes> cl = new ArrayList<Clientes>();
    ArrayList<PessoaFisica> clp = new ArrayList<PessoaFisica>();
    ArrayList<PessoaJuridica> clj = new ArrayList<PessoaJuridica>();
    ArrayList<Popular> v = new ArrayList<Popular>();
    ArrayList<Luxo> vj = new ArrayList<Luxo>();
    ArrayList<Suv> vj2 = new ArrayList<Suv>();

    ArrayList<Emprestimo> emprestimo = new ArrayList<Emprestimo>();
}
