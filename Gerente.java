public class Gerente extends FuncionarioAutenticado {

  public double getPlusSalario() {
    return super.getPlusSalario() + this.getPlusSalario();
  }
}

// los modificadores de acceso son los siguientes -> private,protected y public

// Public
// Este es el modificador menos restrictivo de todos. De esta manera,
// cualquier componente puede acceder a los miembros de la clase,
// las clases y las interfaces.

// Protected
// Al usar este modificador de acceso, los miembros de la clase
// y las clases son accesibles para otros elementos siempre que estén dentro
// del mismo package o, si pertenecen a otros packages, siempre que tengan una
// relación extendida (herencia), es decir,
// las clases secundarias pueden acceder a los miembros de su clase principal (o
// clase de abuelos, etc.).

// Private
// Este es el modificador de acceso más restrictivo de todos. Solo se puede
// acceder a los
// miembros definidos como privados desde dentro de la clase y desde ningún otro
// lugar,
// independientemente del paquete o la herencia.