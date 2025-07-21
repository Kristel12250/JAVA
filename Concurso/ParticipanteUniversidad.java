package Concurso;
public class ParticipanteUniversidad extends Participante {
    private String nombreUniversidad;

    public ParticipanteUniversidad(String nombre, int edad, String genero, String condicionSalud, String nombreUniversidad) {
        super(nombre, edad, genero, condicionSalud, "Universidad");
        this.nombreUniversidad = nombreUniversidad;
    }

    @Override
    public String getInfo() {
        return "Participante Universidad: " + getNombre() + ", Edad: " + getEdad() + ", Género: " + getGenero()
                + ", Salud: " + getCondicionSalud() + ", Universidad: " + nombreUniversidad;
    }
}
