public class SistemaInterno {

  private String clave = "12345";

  public boolean autenticat(FuncionarioAutenticado admin) {
    boolean puedeIniciarSesion = admin.iniciarSesion(clave);

    if (puedeIniciarSesion) {
      System.out.println("Si puede Iniciar Sesion");
      return true;
    } else {
      System.out.println("No pudo IniciarSesion");
      return false;
    }

  }
}
