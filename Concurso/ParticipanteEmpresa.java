package Concurso;
public class ParticipanteEmpresa extends Participante {
    private String tipoEmpresa;  // pública o privada
    private String nombreEmpresa;

    public ParticipanteEmpresa(String nombre, int edad, String genero, String condicionSalud, String tipoEmpresa, String nombreEmpresa) {
        super(nombre, edad, genero, condicionSalud, "Empresa");
        this.tipoEmpresa = tipoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
     public String getInfo() {
        return "Participante Empresa: " + getNombre() + ", Edad: " + getEdad() + ", Género: " + getGenero()
                + ", Salud: " + getCondicionSalud() + ", Tipo Empresa: " + tipoEmpresa + ", Nombre Empresa: " + nombreEmpresa;
    }
}

