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

    ArrayList<PessoaFisica> lclientesP = new ArrayList<PessoaFisica>();
    ArrayList<PessoaJuridica> lclientesJ = new ArrayList<PessoaJuridica>();
    ArrayList<Popular> lCarrosP = new ArrayList<Popular>();
    ArrayList<Luxo> lCarrosLuxo = new ArrayList<Luxo>();
    ArrayList<Suv> lCarrosSuv = new ArrayList<Suv>();
    
    public void adicionarClienteFisico(PessoaFisica valor){
        lclientesP.add(valor);
    }

    public void adicionarCarroP(Popular valor){
        lCarrosP.add(valor);
    }
    public void adicionarCarroLuxo(Luxo valor){
        lCarrosLuxo.add(valor);
    }
    public void adicionarCarroSuv(Suv valor){
        lCarrosSuv.add(valor);
    }




}
