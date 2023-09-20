package presta;

class Alumno {
    
     private String correo;
     private String contrasena;

    public Alumno() {
        correo = new String();
        contrasena = new String();
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
  
}
