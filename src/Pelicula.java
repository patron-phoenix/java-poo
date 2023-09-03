
public class Pelicula extends Datos implements Prestable {
  private boolean tieneDescuento;
  private int descuento=10;
  private float subDescuento;
  private float total;
  public Pelicula(String titulo, boolean tieneDescuento) {
    super(titulo, 3); // Tarifa base de películas es $3
    this.tieneDescuento = tieneDescuento;
  }

  @Override
  public void prestar() {
    System.out.println("Prestar la película: " + getTitulo());
  }

  @Override
  public void devolver() {
    System.out.println("Devolver la película: " + getTitulo());
  }

  @Override
  public float calcularTarifaPrestamo() {

    if (tieneDescuento) {
        total=(float) (super.calcularTarifaPrestamo() * 0.9);
        System.out.println("La Pelicula tiene un descuento de 10%");
        return total;

    } else {
      return super.calcularTarifaPrestamo();
    }
  }

}
