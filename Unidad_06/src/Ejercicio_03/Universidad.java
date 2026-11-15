package Ejercicio_03;
import java.util.ArrayList;

/**
 *
 * @author Christian Leiva
 */
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    public Universidad(String _nombre){
        setNombre(_nombre);
        this.profesores =  new ArrayList<>();
        this.cursos =  new ArrayList<>();        
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre != null && nombre.length() > 0){
            this.nombre = nombre;
        }else{
            System.out.println("Error: Ingresar un nombre vaiido.");
        }              
    }
    
    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }
    
    public void agregarCurso(Curso c){
        cursos.add(c);
    }
    
    public void listarCursos(){
        if(cursos.isEmpty()){
            System.out.println("Lista de cursos vacia.");
        }
        
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    public Curso buscarCursoPorCodigo(String codCurso){
        for (Curso c: cursos){
            if(c.getCodigo().equalsIgnoreCase(codCurso)){
                return c;
            }            
        }
        return null;
    }
    
    public Profesor buscarProfesorPorId(String id){
        for (Profesor p : profesores){
            if(p.getId().equalsIgnoreCase(id)){
                return p;
            }
        }
        return null;
    }
    
    public void asignarProfesorACurso(String c, String p){
        Curso cursoEncontrado = buscarCursoPorCodigo(c);
        Profesor profesorEncontrado = buscarProfesorPorId(p);
        
        if(cursoEncontrado != null && profesorEncontrado != null){
            cursoEncontrado.setProfesor(profesorEncontrado);
        }else{
            System.out.println("Error: Curso o Profesor no encontrado.");
        }        
    }
    
    public void eliminarCurso(String cod){
        Curso cursoEncontrado = buscarCursoPorCodigo(cod);
        if(cursoEncontrado != null){
            cursoEncontrado.setProfesor(null);
            cursos.remove(cursoEncontrado);            
        }       
    }
    
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {            
            ArrayList<Curso> cursosCopia = new ArrayList<>(p.getCursos());
            for (Curso c : cursosCopia) {
                p.eliminarCurso(c);
            }
            profesores.remove(p);
        }
    }
    
    
    
    
    
    
}
