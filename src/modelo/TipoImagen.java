package modelo;

/**
 * Este enumerado representa los diferentes tipos de imágenes que se pueden utilizar
 * en el contexto del juego de tres en raya (Tic-Tac-Toe).
 * Cada valor del enumerado corresponde a una representación visual del juego,
 * facilitando la gestión del estado del mismo.
 */
public enum TipoImagen {
    
    /**
     * Representa el símbolo de 'X', utilizado por uno de los jugadores en el juego.
     */
    EQUIS,
    
    /**
     * Representa el símbolo de 'O', utilizado por el otro jugador en el juego.
     */
    CIRCULO,
    
    /**
     * Representa una línea ganadora 1, que podría ser parte de las combinaciones de victoria.
     */
    LINEA1,
    
    /**
     * Representa una línea ganadora 2.
     */
    LINEA2,
    
    /**
     * Representa una línea ganadora 3.
     */
    LINEA3,
    
    /**
     * Representa una línea ganadora 4.
     */
    LINEA4,
    
    /**
     * Representa una línea ganadora 5.
     */
    LINEA5,
    
    /**
     * Representa una línea ganadora 6.
     */
    LINEA6,
    
    /**
     * Representa una línea ganadora 7.
     */
    LINEA7,
    
    /**
     * Representa una línea ganadora 8.
     */
    LINEA8,
    
    /**
     * Representa el estado de empate en el juego.
     * Se utiliza para indicar que no hay más movimientos posibles y nadie ha ganado.
     */
    EMPATE
}
