public class CuentaAhorro extends Cuenta {

  public CuentaAhorro(int agencia) {
    // la palabra super nos permite traer los contructores de la clase padre
    super(agencia);

  }

  @Override
  public void depositar(double valor) {
    this.saldo1 += valor;
  }

}
