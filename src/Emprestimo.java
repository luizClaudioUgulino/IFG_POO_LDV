public class Emprestimo {

  Clientes clientes;
  Carro carro;
  private boolean statusEmprestimo;
  private int idDoEmprestimo;

  public Clientes getClientes() {
    return clientes;
  }

  public void setClientes(Clientes clientes) {
    this.clientes = clientes;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public boolean isStatusEmprestimo() {
    return statusEmprestimo;
  }

  public void setStatusEmprestimo(boolean statusEmprestimo) {
    this.statusEmprestimo = statusEmprestimo;
  }

  public int getIdDoEmprestimo() {
    return idDoEmprestimo;
  }

  public void setIdDoEmprestimo(int idDoEmprestimo) {
    this.idDoEmprestimo = idDoEmprestimo;
  }

  @Override
  public String toString() {
    return "Emprestimo [clientes=" + clientes + ", carro=" + carro + ", statusEmprestimo=" + statusEmprestimo
        + ", idDoEmprestimo=" + idDoEmprestimo + "]";
  }

  public Emprestimo(int idDoEmprestimo, Clientes clientes, Carro carro, boolean statusEmprestimo) {
    this.idDoEmprestimo = idDoEmprestimo;
    this.clientes = clientes;
    this.carro = carro;
    this.statusEmprestimo = statusEmprestimo;
  }

}
