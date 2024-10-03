
package modelo; // Declaración del paquete donde se encuentra la clase

import java.awt.Color; // Importación de la clase Color para establecer colores
import java.awt.Graphics; // Importación de la clase Graphics para realizar operaciones de dibujo
import java.awt.Graphics2D; // Importación de la clase Graphics2D para operaciones de gráficos avanzados
import javax.swing.ImageIcon; // Importación de ImageIcon para manejar imágenes
import javax.swing.JPanel; // Importación de JPanel para crear componentes gráficos

/**
 * Clase Cuadro que representa un cuadrado en el juego, extendiendo JPanel.
 * Permite mostrar una imagen en un cuadro con un tamaño y color específico.
 */
public class Cuadro extends JPanel {
    
    private int ancho; // Ancho del cuadro
    private int altura; // Altura del cuadro
    private Color color; // Color de fondo del cuadro
    private TipoImagen tipoImagen; // Tipo de imagen que se mostrará en el cuadro
    private boolean dibujado; // Bandera que indica si el cuadro ha sido dibujado
    private int i; // Índice de fila en el tablero
    private int j; // Índice de columna en el tablero

    /**
     * Constructor de la clase Cuadro.
     * Inicializa un nuevo cuadro con un ancho, altura y color de fondo específicos.
     * 
     * @param ancho El ancho del cuadro.
     * @param altura La altura del cuadro.
     * @param color El color de fondo del cuadro.
     */
    public Cuadro(int ancho, int altura, Color color) {
        this.ancho = ancho; // Asigna el ancho del cuadro
        this.altura = altura; // Asigna la altura del cuadro
        this.color = color; // Asigna el color de fondo
        this.dibujado = false; // Inicializa la bandera como no dibujado
        init(); // Llama al método de inicialización
    }

    /**
     * Método de inicialización que establece el tamaño y el fondo del cuadro.
     * Este método se llama desde el constructor.
     */
    private void init() {
        setSize(ancho, altura); // Establece el tamaño del JPanel
        setBackground(color); // Establece el color de fondo del JPanel
    }

    /**
     * Método que se llama para dibujar el contenido del JPanel.
     * Se sobrescribe el método paintComponent de JPanel para personalizar el dibujo.
     * 
     * @param gg El objeto Graphics que se utiliza para dibujar.
     */
    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg); // Llama al método de la superclase para asegurar que se dibuje el fondo
        Graphics2D g = (Graphics2D) gg; // Convierte Graphics a Graphics2D para un control más fino

        // Inicializa la imagen a dibujar según el tipo de imagen asignado
        ImageIcon imagen = new ImageIcon(); // Crea un objeto ImageIcon vacío
        // Carga la imagen correspondiente al tipoImagen
        if (tipoImagen == TipoImagen.CIRCULO)
            imagen = new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if (tipoImagen == TipoImagen.EQUIS)
            imagen = new ImageIcon(getClass().getResource(Ruta.EQUIS));
        else if (tipoImagen == TipoImagen.LINEA1)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA1));
        else if (tipoImagen == TipoImagen.LINEA2)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA2));
        else if (tipoImagen == TipoImagen.LINEA3)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA3));
        else if (tipoImagen == TipoImagen.LINEA4)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA4));
        else if (tipoImagen == TipoImagen.LINEA5)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA5));
        else if (tipoImagen == TipoImagen.LINEA6)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA6));
        else if (tipoImagen == TipoImagen.LINEA7)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA7));
        else if (tipoImagen == TipoImagen.LINEA8)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA8));
        
        // Dibuja la imagen en el cuadro, ajustándola al tamaño del JPanel
        g.drawImage(imagen.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    // Métodos getter y setter para los atributos de la clase

    /**
     * Obtiene el índice de fila del cuadro.
     * 
     * @return El índice de fila.
     */
    public int getI() {
        return i; // Devuelve el índice de fila
    }

    /**
     * Establece el índice de fila del cuadro.
     * 
     * @param i El nuevo índice de fila.
     */
    public void setI(int i) {
        this.i = i; // Establece el índice de fila
    }

    /**
     * Obtiene el índice de columna del cuadro.
     * 
     * @return El índice de columna.
     */
    public int getJ() {
        return j; // Devuelve el índice de columna
    }

    /**
     * Establece el índice de columna del cuadro.
     * 
     * @param j El nuevo índice de columna.
     */
    public void setJ(int j) {
        this.j = j; // Establece el índice de columna
    }

    /**
     * Verifica si el cuadro ha sido dibujado.
     * 
     * @return true si el cuadro ha sido dibujado, false en caso contrario.
     */
    public boolean isDibujado() {
        return dibujado; // Devuelve el estado de la bandera dibujado
    }

    /**
     * Establece el estado de dibujo del cuadro.
     * 
     * @param dibujado true si se ha dibujado, false en caso contrario.
     */
    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado; // Establece el estado de la bandera dibujado
    }

    /**
     * Obtiene el ancho del cuadro.
     * 
     * @return El ancho del cuadro.
     */
    public int getAncho() {
        return ancho; // Devuelve el ancho del cuadro
    }

    /**
     * Establece el ancho del cuadro.
     * 
     * @param ancho El nuevo ancho del cuadro.
     */
    public void setAncho(int ancho) {
        this.ancho = ancho; // Establece un nuevo ancho para el cuadro
    }

    /**
     * Obtiene la altura del cuadro.
     * 
     * @return La altura del cuadro.
     */
    public int getAltura() {
        return altura; // Devuelve la altura del cuadro
    }

    /**
     * Establece la altura del cuadro.
     * 
     * @param altura La nueva altura del cuadro.
     */
    public void setAltura(int altura) {
        this.altura = altura; // Establece una nueva altura para el cuadro
    }

    /**
     * Obtiene el color de fondo del cuadro.
     * 
     * @return El color de fondo.
     */
    public Color getColor() {
        return color; // Devuelve el color de fondo del cuadro
    }

    /**
     * Establece el color de fondo del cuadro.
     * 
     * @param color El nuevo color de fondo.
     */
    public void setColor(Color color) {
        this.color = color; // Establece un nuevo color de fondo
    }

    /**
     * Obtiene el tipo de imagen que se mostrará en el cuadro.
     * 
     * @return El tipo de imagen.
     */
    public TipoImagen getTipoImagen() {
        return tipoImagen; // Devuelve el tipo de imagen que se está utilizando
    }

    /**
     * Establece el tipo de imagen que se mostrará en el cuadro.
     * 
     * @param tipoImagen El nuevo tipo de imagen para el cuadro.
     */
    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen; // Establece un nuevo tipo de imagen para el cuadro
    }
}
