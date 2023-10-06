public class Capitan {
    private String nomdre;
    private String apellido;
    private String matriclaDeNavegacion;


    public Capitan(String nomdre, String apellido, String matriclaDeNavegacion) {
        this.nomdre = nomdre;
        this.apellido = apellido;
        this.matriclaDeNavegacion = matriclaDeNavegacion;
    }

    public String getNomdre() {
        return nomdre;
    }

    public void setNomdre(String nomdre) {
        this.nomdre = nomdre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatriclaDeNavegacion() {
        return matriclaDeNavegacion;
    }

    public void setMatriclaDeNavegacion(String matriclaDeNavegacion) {
        this.matriclaDeNavegacion = matriclaDeNavegacion;
    }
}
