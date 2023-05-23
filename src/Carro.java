public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private String valorDeLocacao;
    
    public Carro(String marca, String modelo, String placa, String ano, String valorDeLocacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorDeLocacao = valorDeLocacao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getValorDeLocacao() {
        return valorDeLocacao;
    }
    public void setValorDeLocacao(String valorDeLocacao) {
        this.valorDeLocacao = valorDeLocacao;
    }

}
