
package Ejercicio_01;

/**
 * 
 * @author Christian Leiva
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    
    private boolean cargarString(String _texto){
       return (_texto != null && _texto.length() != 0) ? true : false;
    }
    
    private void modificarCalificacion(double _nota) {
        this.calificacion = Math.max(0.0, Math.min(10.0, this.calificacion + _nota));
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion del estudiante");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Curso: "+this.curso);
        System.out.println("Calificacion: "+this.calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(cargarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error al ingresar el nombre"); 
        }               
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String _apellido) {
        if(cargarString(_apellido)){
           this.apellido = _apellido;
        }else{
            System.out.println("Error al ingresar el apellido"); 
        }       
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String _curso) {
        if(cargarString(_curso)){
            this.curso = _curso;
        }else{
            System.out.println("Error al ingresar el curso");   
        }             
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double _calificacion){
        this.calificacion = Math.max(0.0, Math.min(10.0, _calificacion));
    }
    
    public void subirCalificacion(double _nota) {
        modificarCalificacion(_nota);
    }

    public void bajarCalificacion(double _nota) {
        modificarCalificacion(-_nota);
    }

}
