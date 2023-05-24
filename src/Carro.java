public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;


    private int valorDeLocacao;
    private int cotaRenovacao;
    private boolean CarroDisponível;
    
    public Carro(String marca, String modelo, String placa, String ano, int valorDeLocacao, int cotaRenovacao,boolean CarroDisponível) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorDeLocacao = valorDeLocacao;
        this.cotaRenovacao = cotaRenovacao;
        this.CarroDisponível = CarroDisponível;
    }
    public boolean isCarroDisponível() {
        return CarroDisponível;
    }
    public void setCarroDisponível(boolean carroDisponível) {
        CarroDisponível = carroDisponível;
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
    public int getValorDeLocacao() {
        return valorDeLocacao;
    }
    public void setValorDeLocacao(int valorDeLocacao) {
        this.valorDeLocacao = valorDeLocacao;
    }
    public int getCotaRenovacao() {
        return cotaRenovacao;
    }
    
    public int valorTotalLocacao(){
        int valortotal = this.valorDeLocacao * this.cotaRenovacao;  
     return valortotal;
    }


}
