public class Main {

  public static void main(String[] args) {
    // Crear objetos de diferentes elementos
    Libro libro1 = new Libro("El Hobbit");
    Revista revista1 = new Revista("National Geographic");
    Pelicula pelicula1 = new Pelicula("Avatar", false); // Con/sin descuento
    // Realizar préstamos y devoluciones
    libro1.prestar();
    revista1.prestar();
    pelicula1.prestar();

    libro1.devolver();
    revista1.devolver();
    pelicula1.devolver();

    // Calcular tarifas de préstamo
    float tarifaLibro = libro1.calcularTarifaPrestamo();
    float tarifaRevista = revista1.calcularTarifaPrestamo();
    float tarifaPelicula = pelicula1.calcularTarifaPrestamo();

    System.out.println("Tarifa de préstamo de libro: $" + tarifaLibro);
    System.out.println("Tarifa de préstamo de revista: $" + tarifaRevista);
    System.out.println("Tarifa de préstamo de película: $" + tarifaPelicula);
  }
}

