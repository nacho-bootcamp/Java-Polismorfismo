public class Cliente implements Autenticado {

  private String nombre;
  private String documento;
  private String tel;
  private String clave;

  public String getNombre() {
    return nombre;
  }

  @Override
  public void setClave(String clave) {
    this.clave = clave;
  }

  @Override
  public boolean iniciarSesion(String clave) {
    if (this.clave == clave) {
      return true;
    }
    return false;
  }

  public void getTel(String tel) {
    this.tel = tel;
  }

  public String setTel() {
    return tel;
  }

  public void getDocumento(String documento) {
    this.documento = documento;
  }

  public String setDocumento() {
    return documento;
  }
}
