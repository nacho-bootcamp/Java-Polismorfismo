public class TestCuenta {
  public static void main(String[] args) {
    CuentaAhorro ca = new CuentaAhorro(1);
    CuentaCorriente cc = new CuentaCorriente(2);

    cc.depositar(10000);
    cc.transferir(5000, ca);

    System.out.println(cc.getSaldo());
    System.out.println(ca.getSaldo());
  }
}
