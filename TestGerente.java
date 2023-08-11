public class TestGerente {
  public static void main(String[] args) {

    Gerente nacho = new Gerente();
    nacho.setSalario(123423);
    nacho.setClave("AluraCursos");

    System.out.println(nacho.getPlusSalario());
  }
}
