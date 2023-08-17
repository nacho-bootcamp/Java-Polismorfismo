public class SistemaInterno {

  private String clave = "12345";

  public boolean autenticat(Autenticado admin) {
    boolean puedeIniciarSesion = (boolean) admin.iniciarSesion(clave);

    if (puedeIniciarSesion) {
      System.out.println("Si puede Iniciar Sesion");
      return true;
    } else {
      System.out.println("No pudo IniciarSesion");
      return false;
    }

  }
}
