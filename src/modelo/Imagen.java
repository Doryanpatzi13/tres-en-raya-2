
package modelo; // Declaración del paquete

import java.awt.Graphics; // Importación para el dibujo en el componente
import java.awt.Graphics2D; // Importación para gráficos avanzados
import java.net.URL; // Importación para manejar rutas de archivos
import javax.swing.ImageIcon; // Importación para manejar imágenes
import javax.swing.JLabel; // Importación para crear un componente de etiqueta

public class Imagen extends JLabel { // La clase Imagen extiende JLabel
    private String ruta = ""; // Atributo que almacena la ruta de la imagen

    // Método sobrescrito que se llama para dibujar el componente
    @Override
    protected void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D) gg; // Convertimos Graphics a Graphics2D
        URL rutaAbsoluta = getClass().getResource(ruta); // Obtenemos la URL de la imagen

        // Verificamos si la ruta es válida
        if (rutaAbsoluta != null) {
            ImageIcon imagen = new ImageIcon(rutaAbsoluta); // Cargamos la imagen
            // Dibujamos la imagen en el componente
            g.drawImage(imagen.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        }
        g.dispose(); // Liberamos los recursos gráficos
    }

    // Método getter para obtener la ruta
    public String getRuta() {
        return ruta; // Retorna la ruta de la imagen
    }

    // Método setter para establecer la ruta
    public void setRuta(String ruta) {
        this.ruta = ruta; // Establece la ruta de la imagen
    }
}
