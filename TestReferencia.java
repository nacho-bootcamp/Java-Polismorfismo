public class TestReferencia {
  public static void main(String[] args) {

    // el elemento mas generico puede ser adaptado al
    // elemento mas especifico
    // si cambio new funcionario por new gerente igual compila y es por lo que se
    // escribio arriba.
    Funcionario funcionario = new Gerente();
    // ref. de funcionario no incluye el meto
    funcionario.setNombre("nacho");
    funcionario.setSalario(2334);

    // Aqui me sale error porque la referencia de
    // iniciarsesion funcionario no posee el metodo
    // funcionario.iniciarSesion("dsadas");

    Gerente gerente = new Gerente();
    gerente.setNombre("nacho1");
    gerente.setSalario(700000);

    gerente.iniciarSesion("dsadas");

  }
}
