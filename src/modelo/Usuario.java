
package modelo;

/**
 * Clase Usuario que representa a un usuario en el sistema.
 * Contiene la información básica de un usuario, como el nombre y la contraseña.
 */
public class Usuario {
    // Atributo que almacena el nombre del usuario.
    private String nombre;

    // Atributo que almacena la contraseña del usuario.
    private String contraseña;

    // Constructor por defecto que crea un Usuario sin nombre ni contraseña.
    public Usuario() {
    }

    /**
     * Constructor que inicializa un Usuario con el nombre y la contraseña especificados.
     * 
     * @param nombre     El nombre del usuario, representado como una cadena de caracteres.
     * @param contraseña La contraseña del usuario, representada como una cadena de caracteres.
     */
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    /**
     * Método que obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario como una cadena de caracteres.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del usuario.
     * 
     * @param nombre El nuevo nombre del usuario, representado como una cadena de caracteres.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario como una cadena de caracteres.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Método que establece la contraseña del usuario.
     * 
     * @param contraseña La nueva contraseña del usuario, representada como una cadena de caracteres.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
