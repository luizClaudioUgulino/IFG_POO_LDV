public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private String idDoCarro;

    private int valorDeLocacao;
    private int cotaRenovacao;
    private boolean CarroDisponível;
    private int ValorMulta;

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", idDoCarro="
                + idDoCarro + ", valorDeLocacao=" + valorDeLocacao + ", cotaRenovacao=" + cotaRenovacao
                + ", CarroDisponível=" + CarroDisponível + ", ValorMulta=" + ValorMulta + "]";
    }

    private int numeroVezesEmprestimo = 0;

    public Carro(String idDoCarro, String marca, String modelo, String placa, String ano, int valorDeLocacao,
            int cotaRenovacao,
            boolean CarroDisponível, int valorMulta) {
        this.idDoCarro = idDoCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorDeLocacao = valorDeLocacao;
        this.cotaRenovacao = cotaRenovacao;
        this.CarroDisponível = CarroDisponível;
        this.ValorMulta = valorMulta;
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

    public int valorTotalLocacao() {
        int valortotal = this.valorDeLocacao * this.cotaRenovacao;
        return valortotal;
    }

    public String getIdDoCarro() {
        return idDoCarro;
    }

    public void setIdDoCarro(String idDoCarro) {
        this.idDoCarro = idDoCarro;
    }

    public int getValorMulta() {
        return ValorMulta;
    }

    public void setValorMulta(int valorMulta) {
        ValorMulta = valorMulta;
    }

    public void setCotaRenovacao(int cotaRenovacao) {
        this.cotaRenovacao = cotaRenovacao;
    }

    public int getNumeroVezesEmprestimo() {
        return numeroVezesEmprestimo;
    }

    public void setNumeroVezesEmprestimo(int numeroVezesEmpresitmo) {
        if (this.numeroVezesEmprestimo < this.cotaRenovacao) {
            this.numeroVezesEmprestimo = numeroVezesEmpresitmo + 1;
        }
    }

    public int valorDevolucao(int valor) {
        int valortotal;
        valortotal = valorDeLocacao + (numeroVezesEmprestimo * ValorMulta);
        return valortotal;
    }

}
