
package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase UsuarioService que proporciona servicios relacionados con la gestión de usuarios.
 * Esta clase incluye funciones para registrar nuevos usuarios, iniciar sesión y 
 * obtener la lista de usuarios almacenados en un archivo de texto.
 */
public class UsuarioService {
    // Ruta del archivo donde se almacenarán los usuarios en formato de texto.
    private static final String FILE_PATH = "usuarios.txt";

    /**
     * Método para registrar un nuevo usuario en el archivo.
     *
     * Este método recibe un objeto Usuario, que contiene el nombre y la contraseña del usuario.
     * Abre el archivo en modo de adición para no sobrescribir los datos existentes y escribe
     * el nombre y la contraseña separados por un carácter de dos puntos ":".
     *
     * @param usuario Objeto Usuario que contiene el nombre y la contraseña a registrar.
     * @throws IOException Si hay un problema de entrada/salida al escribir en el archivo.
     */
    public void registrarUsuario(Usuario usuario) throws IOException {
        // Crea un FileWriter en modo de adición (true) para que los nuevos datos se agreguen al final del archivo
        FileWriter fw = new FileWriter(FILE_PATH, true);
        // Se utiliza BufferedWriter para mejorar la eficiencia de la escritura en el archivo
        BufferedWriter bw = new BufferedWriter(fw);
        // Se utiliza PrintWriter para facilitar la escritura de líneas de texto
        PrintWriter pw = new PrintWriter(bw);

        // Escribe el nombre y la contraseña del usuario en el archivo, en una nueva línea
        pw.println(usuario.getNombre() + ":" + usuario.getContraseña());
        // Se cierra el PrintWriter, lo que también cierra el BufferedWriter y el FileWriter
        pw.close(); // Esto asegura que los recursos se liberen adecuadamente
    }

    /**
     * Método para verificar el inicio de sesión de un usuario.
     *
     * Este método recibe un objeto Usuario y comprueba si el nombre y la contraseña
     * coinciden con un usuario registrado en el archivo. Lee el archivo línea por línea
     * y busca una coincidencia. Retorna true si se encuentra una coincidencia, y false en caso contrario.
     *
     * @param usuario Objeto Usuario que contiene el nombre y la contraseña para verificar.
     * @return true si el nombre y la contraseña coinciden con un usuario registrado, 
     *         false en caso contrario.
     * @throws IOException Si hay un problema de entrada/salida al leer el archivo.
     */
    public boolean iniciarSesion(Usuario usuario) throws IOException {
        // Crea un FileReader para poder leer el contenido del archivo de usuarios
        FileReader fr = new FileReader(FILE_PATH);
        // Se utiliza BufferedReader para leer el archivo línea por línea
        BufferedReader br = new BufferedReader(fr);
        String linea; // Variable para almacenar cada línea leída del archivo
        boolean exito = false; // Bandera que indica si el inicio de sesión fue exitoso

        // Lee cada línea del archivo hasta que no queden más líneas
        while ((linea = br.readLine()) != null) {
            // Divide la línea en dos partes: nombre y contraseña
            String[] datos = linea.split(":");
            String usuarioArchivo = datos[0]; // Nombre de usuario almacenado
            String contrasenaArchivo = datos[1]; // Contraseña almacenada

            // Compara el nombre y la contraseña del usuario con los datos del archivo
            if (usuarioArchivo.equals(usuario.getNombre()) && contrasenaArchivo.equals(usuario.getContraseña())) {
                exito = true; // Si hay coincidencia, se marca como éxito
                break; // Sale del bucle si se encuentra el usuario
            }
        }
        // Cierra el BufferedReader para liberar los recursos
        br.close();
        return exito; // Retorna el resultado de la verificación (true o false)
    }

    /**
     * Método para obtener la lista de todos los usuarios registrados.
     *
     * Este método lee el archivo de usuarios y crea una lista de objetos Usuario
     * a partir de los datos leídos. Cada línea del archivo representa un usuario,
     * que se divide en nombre y contraseña. Los usuarios se añaden a una lista que se retorna.
     *
     * @return Una lista de objetos Usuario que representan todos los usuarios registrados.
     * @throws IOException Si hay un problema de entrada/salida al leer el archivo.
     */
    public List<Usuario> obtenerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>(); // Lista para almacenar los usuarios
        // Crea un FileReader para leer el archivo de usuarios
        FileReader fr = new FileReader(FILE_PATH);
        // Se utiliza BufferedReader para leer el archivo línea por línea
        BufferedReader br = new BufferedReader(fr);
        String linea; // Variable para almacenar cada línea leída del archivo

        // Lee cada línea del archivo
        while ((linea = br.readLine()) != null) {
            // Divide la línea en nombre y contraseña
            String[] datos = linea.split(":");
            // Crea un nuevo objeto Usuario con los datos leídos y lo agrega a la lista
            usuarios.add(new Usuario(datos[0], datos[1]));
        }
        // Cierra el BufferedReader para liberar los recursos
        br.close();
        return usuarios; // Retorna la lista de usuarios leídos desde el archivo
    }
}
