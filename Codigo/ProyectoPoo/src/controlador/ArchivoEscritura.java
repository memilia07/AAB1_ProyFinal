package controlador;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import modelo.Estudiante;

public class ArchivoEscritura {

    public void guardarTodo(ArrayList<Estudiante> lista) {
        try {

            FileOutputStream archivo = new FileOutputStream("estudiantes.dat");
            ObjectOutputStream escritorObjeto = new ObjectOutputStream(archivo);//convierte el archivo normal en uno para guardar objectos en java

            escritorObjeto.writeObject(lista);//Convierte toda la lista en datos binarios  y la guarda
            //se llama serializacion convierte un objecto a archivo

            escritorObjeto.close();
            archivo.close();
        } catch (Exception e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}
