
package vista;// Paquete donde se encuentra la clase Registro
import java.awt.Color; // Importar la clase Color para manejar colores en la interfaz
import java.io.IOException;// Importar IOException para manejo de excepciones de entrada/salida
import javax.swing.JOptionPane;// Importar JOptionPane para mostrar diálogos de mensajes
import modelo.Usuario; // Importar la clase Usuario desde el paquete modelo
import modelo.UsuarioService; // Importar la clase UsuarioService para manejar la lógica de usuario

// Clase Registro que extiende JFrame para crear una ventana de registro
public class Registro extends javax.swing.JFrame {

  // Constructor de la clase Registro
    public Registro() {
        
        init(); // Llama al método init para inicializar la ventana
        
    }
    // Método para inicializar configuraciones de la ventana
    public void init(){
        setUndecorated(true); // Quitar los bordes de la ventana
        initComponents(); // Inicializar los componentes gráficos
        setResizable(false); // Hacer que la ventana no sea redimensionable
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        
        
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        nuevoUsuario = new javax.swing.JTextField();
        contraseñaNueva = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRegistro.setBackground(new java.awt.Color(14, 19, 49));
        panelRegistro.setPreferredSize(new java.awt.Dimension(416, 315));
        panelRegistro.setLayout(null);

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
        panelRegistro.add(lblCierre);
        lblCierre.setBounds(380, 10, 30, 30);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 105, 220));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REgistro de Usuario");
        panelRegistro.add(jLabel2);
        jLabel2.setBounds(10, 60, 410, 36);

        txtUsuario.setBackground(new java.awt.Color(214, 252, 249));
        txtUsuario.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(101, 175, 245));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseExited(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panelRegistro.add(txtUsuario);
        txtUsuario.setBounds(160, 200, 150, 20);

        nuevoUsuario.setBackground(new java.awt.Color(214, 252, 249));
        nuevoUsuario.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        nuevoUsuario.setForeground(new java.awt.Color(101, 175, 245));
        nuevoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nuevoUsuario.setBorder(null);
        nuevoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nuevoUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nuevoUsuarioFocusLost(evt);
            }
        });
        nuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoUsuarioMouseExited(evt);
            }
        });
        nuevoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoUsuarioKeyTyped(evt);
            }
        });
        panelRegistro.add(nuevoUsuario);
        nuevoUsuario.setBounds(160, 120, 150, 20);

        contraseñaNueva.setBackground(new java.awt.Color(214, 252, 249));
        contraseñaNueva.setFont(new java.awt.Font("Montserrat", 1, 22)); // NOI18N
        contraseñaNueva.setForeground(new java.awt.Color(101, 175, 245));
        contraseñaNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseñaNueva.setBorder(null);
        contraseñaNueva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contraseñaNuevaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaNuevaFocusLost(evt);
            }
        });
        contraseñaNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contraseñaNuevaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contraseñaNuevaMouseExited(evt);
            }
        });
        contraseñaNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaNuevaKeyTyped(evt);
            }
        });
        panelRegistro.add(contraseñaNueva);
        contraseñaNueva.setBounds(160, 160, 150, 20);

        lblUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");
        panelRegistro.add(lblUsuario);
        lblUsuario.setBounds(60, 120, 90, 20);

        lblUsuario1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("CONTRASEÑA");
        panelRegistro.add(lblUsuario1);
        lblUsuario1.setBounds(50, 210, 110, 15);

        lblUsuario3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario3.setText("CONTRASEÑA");
        panelRegistro.add(lblUsuario3);
        lblUsuario3.setBounds(50, 160, 110, 18);

        lblUsuario2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario2.setText("CONFIRMAR");
        panelRegistro.add(lblUsuario2);
        lblUsuario2.setBounds(60, 190, 100, 20);

        jButton1.setText("GUARDAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRegistro.add(jButton1);
        jButton1.setBounds(270, 250, 90, 23);

        jButton2.setText("CANCELAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        panelRegistro.add(jButton2);
        jButton2.setBounds(50, 250, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);// Cerrar la aplicación
    }//GEN-LAST:event_lblCierreMouseClicked
 // Método que se ejecuta al pasar el mouse sobre el label de cierre
    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED); // Cambiar color a rojo al pasar el mouse
    }//GEN-LAST:event_lblCierreMouseEntered
 // Método que se ejecuta al salir el mouse del label de cierre
    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));// Restaurar color original
    }//GEN-LAST:event_lblCierreMouseExited
// Método que se ejecuta al ganar foco el campo de texto del nuevo usuario
    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
  // Puedes agregar un comportamiento específico al ganar foco, como resaltar el campo       
    }//GEN-LAST:event_txtUsuarioFocusGained
 // Método que se ejecuta al perder foco el campo de texto del nuevo usuario
    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
 // Puedes agregar un comportamiento específico al perder foco, como validar el campo       
    }//GEN-LAST:event_txtUsuarioFocusLost
// Métodos para manejar efectos de mouse en los campos de texto
    private void txtUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseEntered
       
    }//GEN-LAST:event_txtUsuarioMouseEntered

    private void txtUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseExited
        
    }//GEN-LAST:event_txtUsuarioMouseExited

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
      
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void nuevoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nuevoUsuarioFocusGained
       
    }//GEN-LAST:event_nuevoUsuarioFocusGained

    private void nuevoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nuevoUsuarioFocusLost
       
    }//GEN-LAST:event_nuevoUsuarioFocusLost

    private void nuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioMouseEntered
       
    }//GEN-LAST:event_nuevoUsuarioMouseEntered

    private void nuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioMouseExited
       
    }//GEN-LAST:event_nuevoUsuarioMouseExited

    private void nuevoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoUsuarioKeyTyped
    
    }//GEN-LAST:event_nuevoUsuarioKeyTyped

    private void contraseñaNuevaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaNuevaFocusGained
       
    }//GEN-LAST:event_contraseñaNuevaFocusGained

    private void contraseñaNuevaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaNuevaFocusLost
        
    }//GEN-LAST:event_contraseñaNuevaFocusLost

    private void contraseñaNuevaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaNuevaMouseEntered
     
    }//GEN-LAST:event_contraseñaNuevaMouseEntered

    private void contraseñaNuevaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaNuevaMouseExited
       
    }//GEN-LAST:event_contraseñaNuevaMouseExited

    private void contraseñaNuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaNuevaKeyTyped
     
    }//GEN-LAST:event_contraseñaNuevaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed
// Método que se ejecuta al hacer clic en el botón "Cancelar"
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      Login login=new Login();
        login.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     Usuario usuario1 = new Usuario();
    usuario1.setNombre(nuevoUsuario.getText());      // Campo de texto para el nombre de usuario
    usuario1.setContraseña(contraseñaNueva.getText()); // Campo de texto para la contraseña

    // Crear instancia de UsuarioService para manejar la persistencia
    UsuarioService usuarioService = new UsuarioService();

    try {
        // Llamar al método para registrar el usuario
        usuarioService.registrarUsuario(usuario1);
        System.out.println("Usuario registrado: " + usuario1.getNombre() + " con contraseña: " + usuario1.getContraseña());
    } catch (IOException e) {
        // Manejo de errores en caso de que falle el proceso de escritura
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al registrar usuario.");
    }

    // Una vez registrado, mostrar el login y cerrar esta ventana
    Login login = new Login(); // Asumo que tienes otra ventana para el login
    login.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraseñaNueva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JTextField nuevoUsuario;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
