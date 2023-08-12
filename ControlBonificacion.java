public class ControlBonificacion {
  private double suma;

  // Esto se llama sobrecarga de metodo
  // Cuando tú tienes un mismo método con un mismo método pero diferentes
  // argumentos se llama sobrecarga.

  public double registrarSalario(Funcionario funcionario) {
    this.suma += funcionario.getPlusSalario();
    System.out.println(suma);
    return suma;
  }

}
