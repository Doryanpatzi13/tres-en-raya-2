
package modelo; // Declaración del paquete que contiene la clase

import java.awt.Color; // Importación de la clase Color para definir colores
import java.awt.Graphics; // Importación de la clase Graphics para realizar operaciones de dibujo
import java.awt.Graphics2D; // Importación de la clase Graphics2D para gráficos avanzados
import java.awt.RenderingHints; // Importación para configuraciones de renderizado que mejoran la calidad visual
import java.awt.geom.RoundRectangle2D; // Importación para crear formas de rectángulos redondeados
import javax.swing.JPanel; // Importación de JPanel para crear un componente gráfico

// Definición de la clase PanelRedondeado que extiende JPanel, permitiendo personalizar su aspecto
public class PanelRedondeado extends JPanel {
    
    // Atributo que define el ancho de las esquinas redondeadas
    private double arcoAncho = 50; 
    
    // Atributo que define la altura de las esquinas redondeadas
    private double arcoAltura = 50; 
    
    // Atributo que define el color del borde del panel, utilizando valores RGB para crear un color personalizado
    private Color colorBorde = new Color(165, 40, 174); 

    // Método sobrescrito que se encarga de pintar el componente
    @Override
    protected void paintComponent(Graphics g) {
        // Llama al método de la clase padre para asegurar que el componente se dibuje correctamente antes de añadir elementos personalizados
        super.paintComponent(g); 
        
        // Crea un objeto Graphics2D a partir del contexto de dibujo Graphics, permitiendo utilizar características avanzadas de gráficos
        Graphics2D g2 = (Graphics2D) g.create(); 
        
        // Configura el contexto de gráficos para habilitar el antialiasing, mejorando la suavidad de los bordes al dibujar
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
        
        // Crea un objeto RoundRectangle2D que define una forma rectangular con esquinas redondeadas, especificando las dimensiones y el radio de redondeo
        RoundRectangle2D.Double formaRedondeada = new RoundRectangle2D.Double(
                0, 0, this.getWidth() - 1, this.getHeight() - 1, arcoAncho, arcoAltura 
        );

        // Establece el color de relleno utilizando el color de fondo del panel
        g2.setColor(this.getBackground());
        
        // Rellena la forma redondeada con el color de fondo, cubriendo el área del panel
        g2.fill(formaRedondeada);
        
        // Cambia el color del gráfico al color del borde definido previamente
        g2.setColor(colorBorde);
        
        // Dibuja el contorno de la forma redondeada utilizando el color de borde especificado
        g2.draw(formaRedondeada);
        
        // Libera los recursos del objeto Graphics2D, asegurando que no haya pérdidas de memoria
        g2.dispose(); 
    }
}
