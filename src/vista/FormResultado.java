 
package vista;

import java.awt.Color; // Importa la clase Color para manipulación de colores

import javax.swing.BorderFactory; // Importa para crear bordes
import javax.swing.border.Border; // Importa la interfaz Border
import modelo.Jugador; // Importa la clase Jugador del modelo
import modelo.Ruta; // Importa la clase Ruta que contiene rutas de imágenes
import modelo.Tablero; // Importa la clase Tablero del modelo
import modelo.TipoImagen; // Importa los tipos de imágenes (EQUIS, CIRCULO, EMPATE)



public class FormResultado extends javax.swing.JFrame {
// Atributos de la clase
    private Tablero tablero;// Representa el estado actual del tablero de juego

    private TipoImagen jugadorGanador;// Representa el jugador ganador (EQUIS, CIRCULO o EMPATE)
    
    public FormResultado(TipoImagen jugadorGanador,Tablero tablero) {
        init();
        this.tablero = tablero;
        this.jugadorGanador = jugadorGanador;
        // Configura la interfaz gráfica según el jugador que ganó
        if(jugadorGanador==TipoImagen.EQUIS){
        // Establece la imagen del jugador Equis   
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            imgDerecha.setRuta(Ruta.EQUIS);// Establece la imagen de la marca Equis
            lblNombre.setText(FormTikTacToe.nombreJugadorEquis.getText()); // Muestra el nombre del jugador Equis
        }
        else if(jugadorGanador==TipoImagen.CIRCULO){
            imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);// Establece la imagen del jugador Círculo
            imgDerecha.setRuta(Ruta.CIRCULO);// Establece la imagen de la marca Círculo
            lblNombre.setText(FormTikTacToe.nombreJugadorCirculo.getText());// Muestra el nombre del jugador Círculo
        }
        else if(jugadorGanador==TipoImagen.EMPATE){
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS); // Muestra la imagen de Equis en caso de empate
            imgDerecha.setRuta(Ruta.JUGADORCIRCULO);// Muestra la imagen de Círculo en caso de empate
            lblNombre.setText("EMPATE"); // Muestra "EMPATE" como texto
        }
    }
     // Método para inicializar la ventana
    public void init(){
        setUndecorated(true);// Elimina la decoración de la ventana (sin barra de título)
        initComponents(); // Llama al método que crea y organiza los componentes de la interfaz
        setResizable(false);// La ventana no puede ser redimensionada
        setLocationRelativeTo(null);// Centra la ventana en la pantalla
        setBackground(new Color(0,0,0,0));// Establece el fondo como completamente transparente
        panelFondo.requestFocus();// Solicita el foco para el panel, lo que permite la interacción  
        panelFondo.setOpaque(false); // Hace que el panel sea transparente
        
    }
   // Método para inicializar todos los componentes de la interfaz gráfica   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgIzquierda = new modelo.Imagen();
        imgDerecha = new modelo.Imagen();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(380, 10, 30, 30);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VICTORIA");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 30, 420, 45);

        imgIzquierda.setText("imagen1");
        imgIzquierda.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imgIzquierda);
        imgIzquierda.setBounds(70, 100, 40, 40);

        imgDerecha.setText("imagen1");
        imgDerecha.setRuta("/resources/Equis.png");
        panelFondo.add(imgDerecha);
        imgDerecha.setBounds(310, 100, 40, 40);

        lblNombre.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(241, 227, 252));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lblNombre);
        lblNombre.setBounds(0, 90, 420, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // Método que se llama al hacer clic en la etiqueta de cierre
    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        dispose(); // Cierra la ventana actual
        tablero.reiniciarTablero(jugadorGanador);// Reinicia el tablero según el jugador ganador
    }//GEN-LAST:event_lblCierreMouseClicked
 // Método que se llama al entrar con el mouse en la etiqueta de cierre
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);// Cambia el color del texto a rojo al pasar el mouse
    }//GEN-LAST:event_lblCierreMouseEntered
 // Método que se llama al salir con el mouse de la etiqueta de cierre
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));// Restaura el color original del texto
    }//GEN-LAST:event_lblCierreMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imgDerecha;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
