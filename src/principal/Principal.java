
package principal;

import vista.FormInicio;
import vista.Login;
import vista.Registro;

/**
 * La clase Principal es el punto de entrada de la aplicación.
 * En el método main, se inicializa la interfaz de usuario
 * mostrando el formulario de inicio de sesión.
 */
public class Principal {

    /**
     * El método main es el punto de partida de la aplicación.
     * 
     * @param args argumentos de línea de comandos (no utilizados en este caso).
     * 
     * <p>Descripción del flujo:</p>
     * <ul>
     *   <li>Se crea una instancia de la clase Login.</li>
     *   <li>Se hace visible la ventana de inicio de sesión.</li>
     * </ul>
     * 
     * <p>Este método no retorna ningún valor y no lanza excepciones específicas, 
     * aunque las excepciones pueden surgir dependiendo de la implementación
     * de la clase Login y otros componentes de la interfaz de usuario.</p>
     */
    public static void main(String[] args) {
        // Se crea una instancia de Login que representa la ventana de inicio de sesión.
        Login login = new Login();
        
        // Se establece la visibilidad de la ventana de inicio de sesión.
        // Esto mostrará la interfaz gráfica al usuario.
        login.setVisible(true);
    }
    
}

