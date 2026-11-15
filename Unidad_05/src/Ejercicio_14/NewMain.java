package Ejercicio_14;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Proyecto miProyecto = new Proyecto("Video_Final_TP5", 15);
        EditorVideo editor = new EditorVideo();
        Render videoExportado = editor.exportar("MP4", miProyecto);
        System.out.println(videoExportado.toString());       
    }

}
