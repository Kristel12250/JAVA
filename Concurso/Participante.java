package Concurso;
public abstract class Participante {
    private final String nombre;
    private final int edad;
    private final String genero;
    private final String condicionSalud;
    private final String tipoEntidad;

      public Participante(String nombre, int edad, String genero, String condicionSalud, String tipoEntidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.condicionSalud = condicionSalud;
        this.tipoEntidad = tipoEntidad;
      }

       public boolean puedeParticipar() {
        return edad >= 18 && edad <= 25 && condicionSalud.equalsIgnoreCase("buena");
       }

        public abstract String getInfo();

      public String getNombre() { return nombre; }
      public int getEdad() { return edad; }
      public String getGenero() { return genero; }
      public String getCondicionSalud() { return condicionSalud; }
      public String getTipoEntidad() { return tipoEntidad; }
}
