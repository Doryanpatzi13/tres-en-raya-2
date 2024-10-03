package modelo; // Declara el paquete que contiene la clase Tablero, agrupando todas las clases relacionadas con la lógica del juego.

import java.awt.Color; // Importa la clase Color para manejar colores en el tablero.
import java.awt.Cursor; // Importa la clase Cursor para cambiar el cursor del mouse cuando se pasa sobre un cuadro.
import java.awt.event.MouseEvent; // Importa la clase MouseEvent para manejar eventos de mouse.
import java.awt.event.MouseListener; // Importa la interfaz MouseListener para gestionar eventos de mouse en los cuadros.
import java.util.ArrayList; // Importa la clase ArrayList para manejar dinámicamente listas de cuadros.
import java.util.Timer; // Importa la clase Timer para programar tareas que se ejecutan después de un retraso.
import java.util.TimerTask; // Importa la clase TimerTask para definir tareas que se ejecutan en un momento futuro.
import javax.swing.JPanel; // Importa la clase JPanel para crear un área en la interfaz gráfica donde se dibujará el tablero.
import vista.FormResultado; // Importa la clase FormResultado, que se utiliza para mostrar el resultado del juego.
import vista.FormTikTacToe; // Importa la clase FormTikTacToe, que representa la interfaz principal del juego.

// Clase que representa el tablero del juego de tres en raya (Tic-Tac-Toe).
public class Tablero extends JPanel {
    private int anchoCI; // Ancho de cada cuadro individual en el tablero.
    private int alturaCI; // Altura de cada cuadro individual en el tablero.
    private int margen; // Margen entre los cuadros del tablero.
    private Color colorTablero; // Color de fondo del tablero.
    private Color colorCI; // Color de los cuadros individuales.
    private TipoImagen jugadorActual; // Representa el jugador actual (EQUIS o CIRCULO).
    private TipoImagen turnoPartida; // Representa el tipo de imagen que tiene el turno en la partida (EQUIS o CIRCULO).
    
    private Jugador jugador1; // Instancia del jugador 1.
    private Jugador jugador2; // Instancia del jugador 2.
    
    private ArrayList<Cuadro> cuadros; // Lista que contiene todos los cuadros en el tablero.
    private Cuadro cuadroFrontal; // Cuadro que se dibuja en la parte superior para mostrar el resultado final.

    // Constructor de la clase Tablero.
    public Tablero() {
        init(); // Llama al método init para inicializar los atributos del tablero.
    }

    // Método privado para inicializar los atributos del tablero.
    private void init() {
        anchoCI = 80; // Establece el ancho de cada cuadro individual (80 píxeles).
        alturaCI = 80; // Establece la altura de cada cuadro individual (80 píxeles).
        colorCI = Color.BLUE; // Establece el color de los cuadros individuales a azul.
        colorTablero = Color.RED; // Establece el color de fondo del tablero a rojo.
        margen = 6; // Establece el margen entre los cuadros a 6 píxeles.
        jugador1 = new Jugador(); // Crea una nueva instancia para el jugador 1.
        jugador2 = new Jugador(); // Crea una nueva instancia para el jugador 2.
        cuadros = new ArrayList<>(); // Inicializa la lista de cuadros vacía.
        jugadorActual = TipoImagen.EQUIS; // Inicializa el jugador actual como 'X'.
        turnoPartida = TipoImagen.EQUIS; // Establece que el primer turno es de 'X'.
    }

    // Método para crear el tablero, configurando su tamaño y color.
    public void crearTablero() {
        setLayout(null); // Desactiva el layout manager, permitiendo un posicionamiento manual de los componentes.
        setSize(anchoCI * 3 + margen * 4, alturaCI * 3 + margen * 4); // Establece el tamaño total del tablero.
        setBackground(colorTablero); // Establece el color de fondo del tablero.

        // Crea un cuadro frontal que sirve para mostrar el resultado final.
        cuadroFrontal = new Cuadro(this.getWidth(), this.getHeight(), Color.RED);
        cuadroFrontal.setLocation(0, 0); // Posiciona el cuadro frontal en la esquina superior izquierda.
        cuadroFrontal.setOpaque(false); // Hace que el cuadro frontal sea transparente.
        cuadroFrontal.setEnabled(false); // Desactiva la interactividad del cuadro frontal.
        add(cuadroFrontal); // Agrega el cuadro frontal al tablero.

        crearCuadrosInternos(); // Llama al método para crear los cuadros internos del tablero.
    }

    // Método para crear los cuadros internos del tablero.
    private void crearCuadrosInternos() {
        int x = margen; // Inicializa la posición x con el margen.
        int y = margen; // Inicializa la posición y con el margen.
        
        // Bucle para crear los 9 cuadros internos del tablero (3 filas y 3 columnas).
        for (int i = 0; i < 3; i++) { // Itera sobre cada fila.
            x = margen; // Reinicia la posición x al margen al comienzo de una nueva fila.
            for (int j = 0; j < 3; j++) { // Itera sobre cada columna.
                // Crea un nuevo cuadro individual.
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, colorCI); 
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia el cursor a una mano al pasar sobre el cuadro.
                cuadro.setLocation(x, y); // Establece la ubicación del cuadro en el tablero.
                cuadro.setI(i); // Asocia la fila (i) al cuadro.
                cuadro.setJ(j); // Asocia la columna (j) al cuadro.
                add(cuadro); // Agrega el cuadro al tablero.
                cuadros.add(cuadro); // Agrega el cuadro a la lista de cuadros.
                crearEventosCuadro(cuadro); // Llama al método para crear eventos de mouse para el cuadro.
                
                x += (anchoCI + margen); // Incrementa la posición x para el siguiente cuadro en la misma fila.
            }
            y += (alturaCI + margen); // Incrementa la posición y para la siguiente fila.
        }
    }

    // Método para crear eventos de mouse para un cuadro dado.
    public void crearEventosCuadro(Cuadro cuadro) {
        // Crea un MouseListener para manejar los eventos de mouse.
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Este método se puede implementar para agregar lógica adicional al hacer clic.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Verifica si el cuadro ya ha sido dibujado para evitar interacciones repetidas.
                if (cuadro.isDibujado()) return; // Si ya fue dibujado, no hace nada.

                TipoImagen tipoImagenResultado = null; // Variable para almacenar el tipo de imagen resultante del turno.
                
                // Lógica para manejar el turno de cada jugador.
                if (jugadorActual == TipoImagen.EQUIS) {
                    // Si el jugador actual es 'X', establece el tipo de imagen del cuadro a 'X'.
                    cuadro.setTipoImagen(TipoImagen.EQUIS); 
                    jugador1.getTablero()[cuadro.getI()][cuadro.getJ()] = 1; // Actualiza el tablero del jugador 1.
                    tipoImagenResultado = jugador1.tresEnRaya(jugador2); // Verifica si el jugador 1 ha ganado.
                    resultado(tipoImagenResultado, TipoImagen.EQUIS); // Llama al método para manejar el resultado.
                    jugadorActual = TipoImagen.CIRCULO; // Cambia el turno al jugador 2.
                    cambiarEstilos(TipoImagen.CIRCULO); // Cambia los estilos de la interfaz para reflejar el cambio de jugador.
                    
                } else if (jugadorActual == TipoImagen.CIRCULO) {
                    // Si el jugador actual es 'O', establece el tipo de imagen del cuadro a 'O'.
                    cuadro.setTipoImagen(TipoImagen.CIRCULO); 
                    jugador2.getTablero()[cuadro.getI()][cuadro.getJ()] = 1; // Actualiza el tablero del jugador 2.
                    tipoImagenResultado = jugador2.tresEnRaya(jugador1); // Verifica si el jugador 2 ha ganado.
                    resultado(tipoImagenResultado, TipoImagen.CIRCULO); // Llama al método para manejar el resultado.
                    jugadorActual = TipoImagen.EQUIS; // Cambia el turno al jugador 1.
                    cambiarEstilos(TipoImagen.EQUIS); // Cambia los estilos de la interfaz para reflejar el cambio de jugador.
                }

                cuadro.setDibujado(true); // Marca el cuadro como dibujado para evitar interacciones futuras.
                repaint(); // Redibuja el tablero para reflejar los cambios.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Este método se puede implementar para agregar lógica adicional al soltar el botón del mouse.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Este método se puede implementar para agregar lógica adicional al entrar el mouse en el cuadro.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Este método se puede implementar para agregar lógica adicional al salir el mouse del cuadro.
            }
        };

        cuadro.addMouseListener(evento); // Agrega el MouseListener al cuadro.
    }

    // Método para cambiar estilos en función del jugador actual.
    public void cambiarEstilos(TipoImagen jugadorAct) {
        // Cambia la apariencia de los jugadores en función de quién está jugando actualmente.
        if (jugadorAct == TipoImagen.CIRCULO) {
            // Cambia la imagen y el color del nombre para el jugador 1 (EQUIS).
            FormTikTacToe.imgJugadorEquis.setRuta(Ruta.JUGADORCIRCULO); // Cambia la imagen del jugador 1 a normal.
            FormTikTacToe.imgJugadorEquis.repaint(); // Redibuja la imagen.
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(255, 200, 255)); // Cambia el color del nombre.

            // Cambia la imagen y el color del nombre para el jugador 2 (CIRCULO).
            FormTikTacToe.imgJugadorCirculo.setRuta(Ruta.JUGADORAUXILLAR); // Cambia la imagen del jugador 2 a auxiliar.
            FormTikTacToe.imgJugadorCirculo.repaint(); // Redibuja la imagen.
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(240, 240, 240, 100)); // Cambia el color del nombre.

        } else if (jugadorAct == TipoImagen.EQUIS) {
            // Cambia la imagen y el color del nombre para el jugador 2 (CIRCULO).
            FormTikTacToe.imgJugadorCirculo.setRuta(Ruta.JUGADORCIRCULO); // Cambia la imagen del jugador 2 a normal.
            FormTikTacToe.imgJugadorCirculo.repaint(); // Redibuja la imagen.
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(255, 200, 255)); // Cambia el color del nombre.

            // Cambia la imagen y el color del nombre para el jugador 1 (EQUIS).
            FormTikTacToe.imgJugadorEquis.setRuta(Ruta.JUGADOREQUIS); // Cambia la imagen del jugador 1 a normal.
            FormTikTacToe.imgJugadorEquis.repaint(); // Redibuja la imagen.
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(180, 232, 255)); // Cambia el color del nombre.
        }
    }

    // Método para manejar el resultado del juego, ya sea un empate o un ganador.
    public void resultado(TipoImagen tipoImagenResultado, TipoImagen jugadorGanador) {
        // Verifica si el resultado es un empate.
        if (tipoImagenResultado == TipoImagen.EMPATE) {
            Tablero tablero = this; // Crea una referencia al tablero actual.
            Timer timer = new Timer(); // Crea un nuevo timer para programar acciones futuras.
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    // Muestra el formulario de resultado para el empate después de 800 ms.
                    FormResultado formResultado = new FormResultado(TipoImagen.EMPATE, tablero);
                    formResultado.setVisible(true); // Muestra el formulario en la interfaz.
                }
            };
            timer.schedule(tarea, 800); // Programa la tarea para que se ejecute después de 800 ms.

        } else if (tipoImagenResultado != null) {
            // Cambia las rutas de las imágenes según el jugador ganador.
            Ruta.cambiarRutas(jugadorGanador); // Cambia las imágenes de acuerdo al ganador.
            cuadroFrontal.setTipoImagen(tipoImagenResultado); // Establece la imagen del cuadro frontal al resultado del juego.
            desactivarCuadros(true); // Desactiva los cuadros para evitar más interacciones.

            Tablero tablero = this; // Crea una referencia al tablero actual.
            Timer timer = new Timer(); // Crea un nuevo timer para programar acciones futuras.
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    // Muestra el formulario de resultado con el jugador ganador después de 800 ms.
                    FormResultado formResultado = new FormResultado(jugadorGanador, tablero);
                    formResultado.setVisible(true); // Muestra el formulario en la interfaz.
                }
            };
            timer.schedule(tarea, 800); // Programa la tarea para que se ejecute después de 800 ms.
        }
    }

    // Método para reiniciar el tablero después de una partida.
    public void reiniciarTablero(TipoImagen ganador) {
        desactivarCuadros(false); // Reactiva los cuadros para nuevas interacciones.
        borrarImagenes(); // Limpia las imágenes de todos los cuadros.
        cuadroFrontal.setTipoImagen(null); // Limpia la imagen del cuadro frontal.

        // Actualiza el puntaje del jugador ganador.
        if (ganador == TipoImagen.EQUIS) {
            int puntajeNuevo = Integer.parseInt(FormTikTacToe.puntajeEquis.getText()) + 1; // Incrementa el puntaje del jugador 1.
            FormTikTacToe.puntajeEquis.setText(String.valueOf(puntajeNuevo)); // Actualiza el puntaje en la interfaz.
        } else if (ganador == TipoImagen.CIRCULO) {
            int puntajeNuevo = Integer.parseInt(FormTikTacToe.puntajeCirculo.getText()) + 1; // Incrementa el puntaje del jugador 2.
            FormTikTacToe.puntajeCirculo.setText(String.valueOf(puntajeNuevo)); // Actualiza el puntaje en la interfaz.
        }

        // Cambia el turno y el jugador actual.
        if (turnoPartida == TipoImagen.EQUIS) {
            jugadorActual = TipoImagen.CIRCULO; // Cambia al jugador 2.
            turnoPartida = TipoImagen.CIRCULO; // Cambia el turno a jugador 2.
        } else if (turnoPartida == TipoImagen.CIRCULO) {
            jugadorActual = TipoImagen.EQUIS; // Cambia al jugador 1.
            turnoPartida = TipoImagen.EQUIS; // Cambia el turno a jugador 1.
        }
        cambiarEstilos(jugadorActual); // Actualiza los estilos visuales según el jugador actual.
        jugador1.limpiar(); // Limpia el tablero del jugador 1.
        jugador2.limpiar(); // Limpia el tablero del jugador 2.
        repaint(); // Redibuja el tablero para reflejar los cambios.
    }

    // Método para activar o desactivar la interactividad de los cuadros.
    public void desactivarCuadros(boolean valor) {
        for (Cuadro cuadro : cuadros) {
            cuadro.setDibujado(valor); // Establece el estado de dibujado para cada cuadro.
        }
    }

    // Método para borrar las imágenes de todos los cuadros en el tablero.
    public void borrarImagenes() {
        for (Cuadro cuadro : cuadros) {
            cuadro.setTipoImagen(null); // Establece la imagen del cuadro a null, limpiándolo.
        }
    }

    // Métodos getter y setter para manejar el estado del tablero y sus jugadores.
    public TipoImagen getJugadorActual() {
        return jugadorActual; // Retorna el jugador actual.
    }

    public void setJugadorActual(TipoImagen jugadorActual) {
        this.jugadorActual = jugadorActual; // Establece el jugador actual.
    }

    public ArrayList<Cuadro> getCuadros() {
        return cuadros; // Retorna la lista de cuadros.
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros; // Establece la lista de cuadros.
    }

    public int getAnchoCI() {
        return anchoCI; // Retorna el ancho de los cuadros.
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI; // Establece el ancho de los cuadros.
    }

    public int getAlturaCI() {
        return alturaCI; // Retorna la altura de los cuadros.
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI; // Establece la altura de los cuadros.
    }

    public int getMargen() {
        return margen; // Retorna el margen entre los cuadros.
    }

    public void setMargen(int margen) {
        this.margen = margen; // Establece el margen entre los cuadros.
    }

    public Color getColorTablero() {
        return colorTablero; // Retorna el color del tablero.
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero; // Establece el color del tablero.
    }

    public Color getColorCI() {
        return colorCI; // Retorna el color de los cuadros.
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI; // Establece el color de los cuadros.
    }

    public Jugador getJugador1() {
        return jugador1; // Retorna el jugador 1.
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1; // Establece el jugador 1.
    }

    public Jugador getJugador2() {
        return jugador2; // Retorna el jugador 2.
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2; // Establece el jugador 2.
    }
}
