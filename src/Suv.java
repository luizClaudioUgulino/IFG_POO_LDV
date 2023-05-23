public class Suv extends Carro {
    

    public Suv(String marca, String modelo, String placa, String ano, String valorDeLocacao,String tipoAtracao,String tipoDeCombustivel,int portasMalas) {
        super(marca, modelo, placa, ano, valorDeLocacao);
        //TODO Auto-generated constructor stub
        this.tipoAtracao = tipoAtracao;
        this.portasMalas = portasMalas;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    private String tipoAtracao;
    private String tipoDeCombustivel;
    private int portasMalas;
    
    public String getTipoAtracao() {
        return tipoAtracao;
    }
    public void setTipoAtracao(String tipoAtracao) {
        this.tipoAtracao = tipoAtracao;
    }
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }
    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    public int getPortasMalas() {
        return portasMalas;
    }
    public void setPortasMalas(int portasMalas) {
        this.portasMalas = portasMalas;
    }
    
}