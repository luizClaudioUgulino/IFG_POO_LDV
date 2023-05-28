public class Emprestimo {

  Clientes clientes;
  Carro carro;
  private boolean statusEmprestimo;
  int idDoEmprestimo;

  public Emprestimo(int idDoEmprestimo, Clientes clientes, Carro Carro, boolean statusEmprestimo) {
    this.idDoEmprestimo = idDoEmprestimo;
    this.clientes = clientes;
    this.carro = carro;
    this.statusEmprestimo = statusEmprestimo;
  }

}
