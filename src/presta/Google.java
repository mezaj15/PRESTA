package presta;

public class Google {

    private Alumno alumno;
    private boolean vertificar;

    public Google(Alumno alumno) {
        this.alumno = alumno;
    }
    
    public boolean verificar() {
    if ("mezaj15@uabc.edu.mx".equals(alumno.getCorreo())) {
        return true;
    } else {
        return false;
    }
}
    
}
