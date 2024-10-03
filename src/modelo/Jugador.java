
package modelo; // Declaración del paquete que organiza las clases

/**
 *  Es la clase que representa a un jugador en un juego de 3 en raya (tic-tac-toe).
 * La clase almacena el nombre del jugador, el tipo de imagen asociado a su marca
 * y el estado del tablero en el que se juega.
 */
public class Jugador {
    private String nombre; // Nombre del jugador (ejemplo. "Juan")
    private TipoImagen tipoImagen; // Tipo de imagen que representa al jugador (ejemplo. X o O)
    private int tablero[][]; // Matriz 2D que representa el estado del tablero (3x3)

    /**
     * Constructor por defecto que inicializa el tablero en un estado vacío.
     * Se establece un tablero de 3x3 con todas las celdas en 0 (vacías).
     */
    public Jugador() {
        tablero = new int[3][3]; // Crea un nuevo tablero de 3x3
        limpiar(); // Llama al método para limpiar el tablero
    }

    /**
     * Constructor que inicializa el jugador con un tipo de imagen específico.
     * @param tipoImagen El tipo de imagen del jugador (ej. X o O).
     */
    public Jugador(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen; // Establece el tipo de imagen para el jugador
        tablero = new int[3][3]; // Crea un nuevo tablero de 3x3
        limpiar(); // Limpia el tablero estableciendo todas las celdas en 0
    }

    /**
     * Constructor que inicializa el jugador con un nombre y un tipo de imagen.
     * @param nombre El nombre del jugador (ej. "Juan").
     * @param tipoImagen El tipo de imagen del jugador (ej. X o O).
     */
    public Jugador(String nombre, TipoImagen tipoImagen) {
        this.nombre = nombre; // Establece el nombre del jugador
        this.tipoImagen = tipoImagen; // Establece el tipo de imagen para el jugador
        tablero = new int[3][3]; // Crea un nuevo tablero de 3x3
        limpiar(); // Limpia el tablero estableciendo todas las celdas en 0
    }

    /**
     * Método para limpiar el tablero. Establece todas las celdas del tablero a 0.
     * Este método se utiliza para reiniciar el estado del juego entre partidas.
     */
    public void limpiar() {
        for (int i = 0; i < 3; i++) { // Itera sobre las filas del tablero
            for (int j = 0; j < 3; j++) { // Itera sobre las columnas del tablero
                tablero[i][j] = 0; // Establece cada celda en 0 (vacía)
            }
        }
    }

    /**
     * Método para verificar si hay un ganador o si el juego ha terminado en empate.
     * @param jugadorRival El jugador rival cuya marca se comparará con la del jugador actual.
     * @return Devuelve un valor de TipoImagen que representa el resultado del juego:
     *         - TipoImagen.LINEA1 a TipoImagen.LINEA8 si hay un ganador.
     *         - TipoImagen.EMPATE si el juego termina en empate.
     *         - null si el juego sigue en curso.
     */
    public TipoImagen tresEnRaya(Jugador jugadorRival) {
        // Comprobaciones de líneas ganadoras en filas
        if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) return TipoImagen.LINEA1;
        if (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) return TipoImagen.LINEA2;
        if (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) return TipoImagen.LINEA3;
        // Comprobaciones de líneas ganadoras en columnas
        if (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) return TipoImagen.LINEA4;
        if (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) return TipoImagen.LINEA5;
        if (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1) return TipoImagen.LINEA6;
        // Comprobaciones de líneas ganadoras en diagonales
        if (tablero[2][0] == 1 && tablero[1][1] == 1 && tablero[0][2] == 1) return TipoImagen.LINEA7;
        if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) return TipoImagen.LINEA8;

        // Contador para verificar empate
        int contador = 0; // Inicializa el contador de celdas ocupadas
        for (int i = 0; i < 3; i++) { // Recorre filas
            for (int j = 0; j < 3; j++) { // Recorre columnas
                if (tablero[i][j] == 1) contador++; // Cuenta marcas del jugador actual
                if (jugadorRival.getTablero()[i][j] == 1) contador++; // Cuenta marcas del jugador rival
            }
        }

        // Si todas las celdas están ocupadas, es un empate
        if (contador == 9) return TipoImagen.EMPATE;

        return null; // Si no hay ganador ni empate, devuelve null
    }

    // Getter para obtener el tablero
    public int[][] getTablero() {
        return tablero; // Devuelve el estado actual del tablero
    }

    // Setter para establecer un nuevo estado del tablero
    public void setTablero(int[][] tablero) {
        this.tablero = tablero; // Establece el tablero con el nuevo valor
    }

    // Getter para obtener el nombre del jugador
    public String getNombre() {
        return nombre; // Devuelve el nombre del jugador
    }

    // Setter para establecer un nuevo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nuevo nombre del jugador
    }

    // Getter para obtener el tipo de imagen del jugador
    public TipoImagen getTipoImagen() {
        return tipoImagen; // Devuelve el tipo de imagen del jugador
    }

    // Setter para establecer un nuevo tipo de imagen
    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen; // Establece el nuevo tipo de imagen del jugador
    }
}
