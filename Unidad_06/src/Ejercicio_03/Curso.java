package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String _codigo, String _nombre) {
        setCodigo(_codigo);
        setNombre(_nombre);
        this.profesor = null;
    }
    
    private boolean validarString(String cadena){
        if(cadena != null && cadena.length() > 0){
            return true;
        }
        return false;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String _codigo){
        if(validarString(_codigo)){
            this.codigo = _codigo;
        }else{
            System.out.println("Error: Ingresar un codigo valido.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(validarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: Ingresar un nombre valido.");
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor _newProfesor) {

        if(this.profesor == _newProfesor){
            return;
        }

        Profesor profesorAnterior = this.profesor;
        this.profesor = _newProfesor;

        //Si tiene un profesor anterior, se lo quita de la lista
        if(profesorAnterior != null){
            profesorAnterior.getCursos().remove(this);
        }

        //Si hay un nuevo curso, se lo agrega a la lista
        if(_newProfesor != null && !_newProfesor.getCursos().contains(this)){
           _newProfesor.getCursos().add(this);
        }       
    }
    
    //
    public void mostrarInfo(){
        System.out.println("codigo: " + codigo + " | nombre: " + nombre + " | profesor: " + profesor);
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
    
    
    
    
}
