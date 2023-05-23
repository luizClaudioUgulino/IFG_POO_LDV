public class Popular extends Carro{
    public Popular(String marca, String modelo, String placa, String ano, String valorDeLocacao,boolean arCondicionado) {
        super(marca, modelo, placa, ano, valorDeLocacao);
        //TODO Auto-generated constructor stub
        this.arCondicionado = arCondicionado;
    }

    private boolean arCondicionado;

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

   
}
