public class TestControlBonificacion {
  public static void main(String[] args) {
    Funcionario diego = new Funcionario();
    diego.setSalario(2000);

    Gerente nacho = new Gerente();
    nacho.setSalario(50000);

    ControlBonificacion control = new ControlBonificacion();
    control.registrarSalario(nacho);
    control.registrarSalario(diego);
  }
}
