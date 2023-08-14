public abstract class Funcionario {
  // cuando una clae es abstracta no podemos instanciarla
  // porque es abstracta y no fisica.
  //
  private String nombre;
  private String documento;
  private double salario;
  private int tipo;

  // es un metodo constructor es un método del mismo tipo de retorno de la clase y
  // que puede aceptar parámetros o no para asignarlos a las variables aquí.
  public Funcionario() {

  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public abstract double getPlusSalario();
  // todo método abstracto, de reglas abstractas, tiene que ser implementado por
  // la clase que está extendiendo esa clase abstracta.

  public int getTipo() {
    return this.tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

}