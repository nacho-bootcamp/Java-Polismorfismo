public class Cliente implements Autenticado {

  private String nombre;
  private String documento;
  private String tel;

  public String getNombre() {
    return nombre;
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
