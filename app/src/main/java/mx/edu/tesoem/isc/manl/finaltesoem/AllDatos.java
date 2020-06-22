package mx.edu.tesoem.isc.manl.finaltesoem;

public class AllDatos {
    String nombre, correo, matricula, promediof, Json;

    public String getNombre() {
        return nombre;
    }

    public String getJson() {
        return Json;
    }

    public void setJson(String json) {
        Json = json;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPromediof() {
        return promediof;
    }

    public void setPromediof(String promediof) {
        this.promediof = promediof;
    }
}
