public class TestCrearExceptionSalda {
  public static void main(String[] args) {
    Cuenta cuenta = new CuentaAhorro(123);
    cuenta.depositar(200);
    cuenta.retirar(210);
  }
}
