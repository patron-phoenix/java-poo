public class Datos {
  private String titulo;
  private float tarifaBase;

  public Datos(String titulo, int tarifaBase) {
    this.titulo = titulo;
    this.tarifaBase = tarifaBase;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setTarifaBase(int tarifaBase) {
    this.tarifaBase = tarifaBase;
  }

  public String getTitulo() {
    return titulo;
  }

  public float getTarifaBase() {
    return tarifaBase;
  }

  public float calcularTarifaPrestamo() {
    return tarifaBase;
  }

}
