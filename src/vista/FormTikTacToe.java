
package vista;

import java.awt.Color;// Importa la clase Color para manipulación de colores
import javax.swing.JLabel;// Importa la clase JLabel para mostrar texto
import modelo.Imagen;// Importa la clase Imagen para mostrar imágenes
import modelo.Jugador;// Importa la clase Jugador que representa a los jugadores
import modelo.Tablero;// Importa la clase Tablero que maneja la lógica del juego
import modelo.TipoImagen; // Importa la clase TipoImagen para identificar tipos de imágenes


public class FormTikTacToe extends javax.swing.JFrame {
    // Componentes de la interfaz
    public static Imagen imgJugadorEquis;// Imagen del jugador que usa Equis
    public static Imagen imgJugadorCirculo; // Imagen del jugador que usa Círculo
    public static JLabel nombreJugadorEquis;// Label para el nombre del jugador Equis
    public static JLabel nombreJugadorCirculo;// Label para el nombre del jugador Círculo
    public static JLabel puntajeEquis;  // Label para el puntaje del jugador Equis
    public static JLabel puntajeCirculo; // Label para el puntaje del jugador Círculo
    // Atributos para almacenar los jugadores y el tablero
    private Jugador jugador1;// Jugador 1
    private Jugador jugador2;// Jugador 2
    private Tablero tablero;// Tablero del juego
    // Constructor de la clase FormTikTacToe
    public FormTikTacToe(Jugador jugador1,Jugador jugador2) {
        this.jugador1 = jugador1;// Asigna el primer jugador
        this.jugador2 = jugador2;// Asigna el segundo jugador
        init(); // Inicializa la interfaz gráfica
        imgJugadorEquis = jugadorEquis; // Establece la imagen del jugador Equis
        imgJugadorCirculo = jugadorCirculo; // Establece la imagen del jugador Círculo
        nombreJugadorEquis = lblNombreJ1; // Establece el label del nombre del jugador Equis
        nombreJugadorCirculo = lblNombreJ2; // Establece el label del nombre del jugador Círculo
        puntajeEquis = lblPuntajeJ1; // Establece el label del puntaje del jugador Equis
        puntajeCirculo = lblPuntajeJ2; // Establece el label del puntaje del jugador Círculo
        tablero.cambiarEstilos(TipoImagen.EQUIS);// Cambia el estilo del tablero
    }
     // Método para inicializar la ventana
    public void init(){
        setUndecorated(true); // Elimina la decoración de la ventana (sin barra de título)
        initComponents(); // Llama al método que crea y organiza los componentes de la interfaz
        setResizable(false); // La ventana no puede ser redimensionada
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        panelFondo.setOpaque(false); // Hace que el panel de fondo sea transparente
        setBackground(new Color(0,0,0,0)); // Establece el fondo como completamente transparente
        // Configura los nombres de los jugadores en las etiquetas
        lblNombreJ1.setText(jugador1.getNombre());
        lblNombreJ2.setText(jugador2.getNombre());
        // Inicializa el tablero
        
        tablero = new Tablero(); // Crea una nueva instancia del tablero
        tablero.setJugador1(jugador1); // Asigna el jugador 1 al tablero
        tablero.setJugador2(jugador2); // Asigna el jugador 2 al tablero

        tablero.setAlturaCI(100); // Establece la altura de los componentes internos del tablero
        tablero.setAnchoCI(100); // Establece el ancho de los componentes internos del tablero
        tablero.setMargen(5); // Establece el margen entre los componentes
        tablero.setColorCI(new Color(14,19,43)); // Establece el color de los componentes internos
        tablero.setColorTablero(new Color(239,180,255)); // Establece el color del tablero
        tablero.setLocation(40,150); // Establece la ubicación del tablero
        tablero.crearTablero();  // Crea el tablero visualmente
        tablero.setVisible(true); // Hace visible el tablero
        
     // Agrega el tablero al panel de fondo
        panelFondo.add(tablero);
    }
// Método que inicializa todos los componentes de la interfaz gráfica
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jugadorCirculo = new modelo.Imagen();
        jugadorEquis = new modelo.Imagen();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
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
        lblCierre.setBounds(360, 10, 30, 30);

        jugadorCirculo.setText("imagen1");
        jugadorCirculo.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(jugadorCirculo);
        jugadorCirculo.setBounds(275, 50, 50, 50);

        jugadorEquis.setText("imagen1");
        jugadorEquis.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50);

        lblNombreJ2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        panelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(255, 100, 90, 30);

        lblNombreJ1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        panelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(55, 100, 90, 30);

        lblPuntajeJ2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        panelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        panelFondo.add(jLabel8);
        jLabel8.setBounds(190, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        panelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);// Cierra la aplicación al hacer clic en la etiqueta "X"
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED); // Cambia el color del texto a rojo al pasar el mouse
    }//GEN-LAST:event_lblCierreMouseEntered
// Método que se llama al salir con el mouse de la etiqueta de cierre
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));// Restaura el color original del texto
    }//GEN-LAST:event_lblCierreMouseExited
 // Métodos getters y setters para los jugadores
    public Jugador getJugador1() {
        return jugador1; // Devuelve el jugador 1
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1; // Asigna un nuevo jugador 1
    }

    public Jugador getJugador2() {
        return jugador2; // Devuelve el jugador 2
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2; // Asigna un nuevo jugador 2
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private modelo.Imagen jugadorCirculo;
    private modelo.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
