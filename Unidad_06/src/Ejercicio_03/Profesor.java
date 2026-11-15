package Ejercicio_03;

import java.util.ArrayList;

/**
 * @author Christian Leiva
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String _id, String _nombre, String _especialidad){
        setId(_id);
        setNombre(_nombre);
        setEspecialidad(_especialidad);
        this.cursos = new ArrayList<>();
    }
    
    private boolean validarString(String cadena){
        return cadena != null && cadena.length() > 0;
    }

    public String getId() { return id; }

    public void setId(String _id){
        if(validarString(_id)){
            this.id = _id;
        } else {
            System.out.println("Error: Ingresar un ID valido.");
        }
    }

    public String getNombre(){ return nombre; }

    public void setNombre(String _nombre){
        if(validarString(_nombre)){
            this.nombre = _nombre;
        } else {
            System.out.println("Error: Ingresar un nombre valido.");
        }
    }

    public String getEspecialidad(){ return especialidad; }

    public void setEspecialidad(String _especialidad){
        if(validarString(_especialidad)){
            this.especialidad = _especialidad;
        } else {
            System.out.println("Error: Ingresar una especialidad valida.");
        }
    }

    public ArrayList<Curso> getCursos(){
        return cursos;
    }   
    
    public void agregarCurso(Curso c){
        if(c != null && !cursos.contains(c)){
            cursos.add(c);
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c){
        if(c != null && cursos.contains(c)){
            cursos.remove(c);
            c.setProfesor(null);
        }        
    }
    
    public void listarCursos(){
        System.out.println("Cursos a cargo del profesor: " + nombre + ":");
        if(cursos.isEmpty()){
            System.out.println(" Ninguno");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("Cod. Curso: " + c.getCodigo() + " - Nombre: " + c.getNombre() + ".");            
        }        
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad + " | Cantidad de cursos: " + cursos.size());
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}