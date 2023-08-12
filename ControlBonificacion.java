public class ControlBonificacion {
  private double suma;

  public double registrarSalario(Funcionario funcionario) {
    this.suma += funcionario.getPlusSalario();
    System.out.println(suma);
    return suma;
  }

  public double registrarSalario(Gerente gerente) {
    this.suma += gerente.getPlusSalario();
    System.out.println(suma);
    return suma;
  }
}
