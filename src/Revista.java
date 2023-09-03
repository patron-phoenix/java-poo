
public class Revista extends Datos implements Prestable {
  public Revista(String titulo) {
    super(titulo, 1); // Tarifa base de revistas es $1
  }

  @Override
  public void prestar() {
    System.out.println("Prestar la revista: " + getTitulo());
  }

  @Override
  public void devolver() {
    System.out.println("Devolver la revista: " + getTitulo());
  }

}
