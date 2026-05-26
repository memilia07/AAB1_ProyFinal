package controlador;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.util.ArrayList;
import modelo.Estudiante;

public class ArchivoLectura {

    public ArrayList<Estudiante> cargarTodo() {
        File archivoCheck = new File("estudiantes.dat");
        
        if (!archivoCheck.exists()) {
            return new ArrayList<>();
        }

        try {
            FileInputStream archivo = new FileInputStream("estudiantes.dat");
            ObjectInputStream lectorObjeto = new ObjectInputStream(archivo);

            ArrayList<Estudiante> lista = (ArrayList<Estudiante>) lectorObjeto.readObject();
  //Lee el archivo y convierte datos otra vez en objetos se llama deserializacion.
            lectorObjeto.close();
            archivo.close();
            return lista;
            
        } catch (Exception e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
