public class FuncionarioAutenticado extends Funcionario {
  private String clave;

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean iniciarSesion(String clave) {
    return clave == "AluraCurso";
  }

  public double getSalario() {
    return 0;
  }

  public double getPlusSalario() {
    return 0;
  }

}
