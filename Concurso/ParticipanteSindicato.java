package Concurso;
public class ParticipanteSindicato extends Participante {
    private String tipoSindicato;

    public ParticipanteSindicato(String nombre, int edad, String genero, String condicionSalud, String tipoSindicato) {
        super(nombre, edad, genero, condicionSalud, "Sindicato");
        this.tipoSindicato = tipoSindicato;
    }

    @Override
    public String getInfo() {
        return "Participante Sindicato: " + getNombre() + ", Edad: " + getEdad() + ", Género: " + getGenero()
                + ", Salud: " + getCondicionSalud() + ", Tipo Sindicato: " + tipoSindicato;
    }
}
