public class Administrador extends Funcionario implements Autenticado {

  public double getPlusSalario() {
    return 0;
  }

  @Override
  public void setClave(String clave) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setClave'");
  }

  @Override
  public boolean iniciarSesion(String clave) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iniciarSesion'");
  }

}
