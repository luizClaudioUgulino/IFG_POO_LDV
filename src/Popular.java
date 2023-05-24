public class Popular extends Carro{
    public Popular(String marca, String modelo, String placa, String ano, int valorDeLocacao,boolean arCondicionado,boolean CarroDisponível) {
        super(marca, modelo, placa, ano, valorDeLocacao,1,CarroDisponível);
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
