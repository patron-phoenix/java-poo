

public class Libro extends Datos implements Prestable {
  public Libro(String titulo) {
    super(titulo, 2); // Tarifa base de libros es $2
  }

  @Override
  public void prestar() {
    System.out.println("Prestar el libro: " + getTitulo());
  }

  @Override
  public void devolver() {
    System.out.println("Devolver el libro: " + getTitulo());
  }

}
