package Concurso;
public class ParticipanteColegio extends Participante {

    private String nombreColegio;
     public ParticipanteColegio(String nombre, int edad, String genero, String condicionSalud, String nombreColegio) {
        super(nombre, edad, genero, condicionSalud, "Colegio");
        this.nombreColegio = nombreColegio;
     }

     @Override
      public String getInfo() {
         return "Participante Colegio: " + getNombre() + ", Edad: " + getEdad() + ", Género: " + getGenero()
                + ", Salud: " + getCondicionSalud() + ", Colegio: " + nombreColegio;
    }
}
