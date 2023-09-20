package presta;

public class Backend {
    private Alumno alumno;
    private Google google;    

    public Backend() {
        alumno = new Alumno();
        google = new Google(alumno);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Google getGoogle() {
        return google;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setGoogle(Google google) {
        this.google = google;
    }
       
}
