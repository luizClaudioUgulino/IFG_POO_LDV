public class Luxo extends Carro{
    
    public Luxo(String marca, String modelo, String placa, String ano, String valorDeLocacao,int quantidadeDeAirbags,int tamanhoPortaMalas,boolean gps) {
        super(marca, modelo, placa, ano, valorDeLocacao);
        //TODO Auto-generated constructor stub
        this.gps =gps;
        this.tamanhoPortaMalas =tamanhoPortaMalas;
        this.quantidadeDeAirbags =quantidadeDeAirbags;
    }
    private int quantidadeDeAirbags;
    private int tamanhoPortaMalas;
    private boolean gps;
    
    public int getQuantidadeDeAirbags() {
        return quantidadeDeAirbags;
    }
    public void setQuantidadeDeAirbags(int quantidadeDeAirbags) {
        this.quantidadeDeAirbags = quantidadeDeAirbags;
    }
    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }
    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
    public boolean isGps() {
        return gps;
    }
    public void setGps(boolean gps) {
        this.gps = gps;
    }

    

}