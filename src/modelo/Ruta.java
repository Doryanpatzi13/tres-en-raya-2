
package modelo; // Declaración del paquete que contiene la clase Ruta. Este paquete agrupa las clases relacionadas con la lógica del juego.

// Clase Ruta que se encarga de gestionar las rutas de las imágenes utilizadas en el juego.
public class Ruta {
    
    // Rutas de imágenes constantes para representar diferentes elementos del juego.
    // Estas constantes son declaradas como 'final', lo que significa que no se pueden modificar
    // después de su inicialización. Esto asegura que las rutas sean consistentes a lo largo de
    // la ejecución del programa.
    public static final String EQUIS = "/resources/Equis.png"; // Ruta para la imagen que representa la figura 'X'.
    public static final String CIRCULO = "/resources/Circulo.png"; // Ruta para la imagen que representa la figura 'O'.
    public static final String JUGADOREQUIS = "/resources/JugadorEquis.png"; // Ruta para la imagen que representa al jugador que usa 'X'.
    public static final String JUGADORCIRCULO = "/resources/JugadorCirculo.png"; // Ruta para la imagen que representa al jugador que usa 'O'.
    public static final String JUGADORAUXILLAR = "/resources/JugadorAuxillar.png"; // Ruta para la imagen de un jugador auxiliar, posiblemente utilizado en el juego para mostrar ayudas o indicadores.

    // Rutas de imágenes para las diferentes líneas de victoria. Estas son declaradas como
    // variables estáticas, lo que permite que su valor sea modificado durante la ejecución
    // del programa, en función del tipo de imagen seleccionada.
    public static String LINEA1 = "/resources/CirculoLinea1.png"; // Ruta para la imagen de la línea de victoria 1 (horizontal).
    public static String LINEA2 = "/resources/CirculoLinea2.png"; // Ruta para la imagen de la línea de victoria 2 (horizontal).
    public static String LINEA3 = "/resources/CirculoLinea3.png"; // Ruta para la imagen de la línea de victoria 3 (horizontal).
    public static String LINEA4 = "/resources/CirculoLinea4.png"; // Ruta para la imagen de la línea de victoria 4 (vertical).
    public static String LINEA5 = "/resources/CirculoLinea5.png"; // Ruta para la imagen de la línea de victoria 5 (vertical).
    public static String LINEA6 = "/resources/CirculoLinea6.png"; // Ruta para la imagen de la línea de victoria 6 (vertical).
    public static String LINEA7 = "/resources/CirculoLinea7.png"; // Ruta para la imagen de la línea de victoria 7 (diagonal).
    public static String LINEA8 = "/resources/CirculoLinea8.png"; // Ruta para la imagen de la línea de victoria 8 (diagonal).

    /**
     * Método estático que cambia las rutas de las imágenes de las líneas de victoria
     * según el tipo de imagen que se esté utilizando (CIRCULO o EQUIS).
     * Esto permite que las imágenes de las líneas de victoria se adapten a las
     * elecciones del jugador en el juego.
     * 
     * @param tipoImagen Un valor del tipo TipoImagen que indica el tipo de figura
     *                   utilizada por los jugadores en el juego. 
     *                   Puede ser CIRCULO o EQUIS.
     */
    public static void cambiarRutas(TipoImagen tipoImagen) {
        // Verifica si el tipo de imagen es CIRCULO. Esta verificación permite
        // adaptar las rutas de las imágenes para que coincidan con el estilo
        // visual que el jugador ha seleccionado.
        if (tipoImagen == TipoImagen.CIRCULO) {
            // Asigna rutas de línea específicas para la figura 'O'. Estas imágenes
            // representan las líneas de victoria cuando el jugador está usando 'O'.
            LINEA1 = "/resources/CirculoLinea1.png";
            LINEA2 = "/resources/CirculoLinea2.png";
            LINEA3 = "/resources/CirculoLinea3.png";
            LINEA4 = "/resources/CirculoLinea4.png";
            LINEA5 = "/resources/CirculoLinea5.png";
            LINEA6 = "/resources/CirculoLinea6.png";
            LINEA7 = "/resources/CirculoLinea7.png";
            LINEA8 = "/resources/CirculoLinea8.png";
        } 
        // Verifica si el tipo de imagen es EQUIS. Esto permite que las imágenes
        // de las líneas de victoria se cambien si el jugador ha elegido 'X'.
        else if (tipoImagen == TipoImagen.EQUIS) {
            // Asigna rutas de línea específicas para la figura 'X'. Estas imágenes
            // representan las líneas de victoria cuando el jugador está usando 'X'.
            LINEA1 = "/resources/EquisLinea1.png";
            LINEA2 = "/resources/EquisLinea2.png";
            LINEA3 = "/resources/EquisLinea3.png";
            LINEA4 = "/resources/EquisLinea4.png";
            LINEA5 = "/resources/EquisLinea5.png";
            LINEA6 = "/resources/EquisLinea6.png";
            LINEA7 = "/resources/EquisLinea7.png";
            LINEA8 = "/resources/EquisLinea8.png";
        }
        // Actualmente, no se lanza ninguna excepción explícita. Sin embargo,
        // se podría considerar la implementación de una lógica para manejar
        // tipos de imágenes no válidos, lo que mejoraría la robustez del código.
    }
}
