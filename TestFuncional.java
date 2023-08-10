public class TestFuncional {
  public static void main(String[] args) {
    Funcionario diego = new Funcionario();
    diego.setNombre("Diego");
    diego.setDocumento("3245235235");
    diego.setSalario(234423);

    System.out.println(diego.getSalario());
  }
}