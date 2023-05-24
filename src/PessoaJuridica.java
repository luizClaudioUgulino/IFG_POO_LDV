public class PessoaJuridica extends Clientes {
    
public PessoaJuridica(String nome, String endereço, String telefone,String cnpj,String nomeDoRepresentante) {
        super(nome, endereço, telefone, -1);
        this.cnpj=cnpj;
        this.nomeDoRepresentante = nomeDoRepresentante;
    }
private String cnpj;
private String nomeDoRepresentante;

public String getCnpj() {
    return cnpj;
}
public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
}
public String getNomeDoRepresentante() {
    return nomeDoRepresentante;
}
public void setNomeDoRepresentante(String nomeDoRepresentante) {
    this.nomeDoRepresentante = nomeDoRepresentante;
}


}
