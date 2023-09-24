package presta;

public class Backend {
    private Persona persona = new Persona();
    private UABC uabc = new UABC();
    
 public void iniciarSesion(String correo, String contrasena){
     persona.setCorreo(correo);
     persona.setContrasena(contrasena);
     
     if (uabc.verificar(correo)==true) persona.setRol("Alumno");
     else persona.setRol("Maestro");
 }
       
}
