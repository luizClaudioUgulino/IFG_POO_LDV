public abstract class Clientes {
    private String nome;
    private String endereço;
    private String telefone;
    private int limiteEmprestimo;
    
    public Clientes(String nome, String endereço, String telefone, int limiteEmprestimo) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.limiteEmprestimo = limiteEmprestimo;
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


}
