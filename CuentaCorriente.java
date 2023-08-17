public class CuentaCorriente extends Cuenta {
  CuentaCorriente(int agencia) {
    super(agencia);

  }

  // la anotacion @Override Se utiliza para sobrescribir el método de la clase
  // madre, lo que indica que se ha modificado el método original

  @Override
  public boolean depositar(double valor) {
    double valorARetirar = valor + 0.2;
    return super.retirar(valorARetirar);
  }

}
