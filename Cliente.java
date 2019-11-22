package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import MetodosBaDa.ConexionBaDa;
import MetodosBaDa.MetodosBaDa;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Zanahoria Pc
 */
public class Cliente extends javax.swing.JFrame {
     public static String user = "";
    String pass = "";
    public Cliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        Registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel5.setText("PROYECTO FINAL");

        jLabel1.setText("CLIENTE");

        jLabel2.setText("USUARIO");

        jLabel3.setText("CONTRASENA");

        Ingresar.setText("INGRESAR");
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarMouseClicked(evt);
            }
        });
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        Registro.setText("REGISTRO");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingresar)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar)
                    .addComponent(Registro))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseClicked
       /*  String lider = "Rommel";
	String contrasenaLider = "rommel";
	String desarrollador1 ="david";
	String contrasenaDEsarrollador1="david123.";
    String desarrollador2 ="josuemtz";
    String contrasenaDEsarrollador2="JBM97.";

	String pass = new String(Password.getPassword());
        if (txtUsuario.getText().equals(lider) && pass.equals(contrasenaLider)) {
			LiderdeProyecto ldp = new LiderdeProyecto(txtUsuario.getText(),"Lider");
			ldp.setVisible(true);
			dispose();
        }else{
            if(txtUsuario.getText().equals(desarrollador1)&& pass.equals(contrasenaDEsarrollador1)){
                Desarrollador des = new Desarrollador(txtUsuario.getText(),"desarrollador");
			des.setVisible(true);
			dispose();
            }else{
               if(txtUsuario.getText().equals(desarrollador2)&& pass.equals(contrasenaDEsarrollador2)){
                    Desarrollador des = new Desarrollador(txtUsuario.getText(),"desarrollador");
                    des.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Tus credenciales de inicio de sesion no coinciden con una cuenta en nuestros sistemas");
                }
            }
        }*/
    }//GEN-LAST:event_IngresarMouseClicked

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        RegistroUsuario ventan = new RegistroUsuario();
        ventan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        pass = Password.getText().trim();
       
       if(!user.equals("") || !pass.equals("")){
           
           try{
               Connection cn = ConexionBaDa.conectar();
               PreparedStatement pst = cn.prepareStatement("seleciona el nivel del Desarrollador: '" + user + "' y la contrasena: '" + pass + ".");
               
               ResultSet rs = pst.executeQuery();
               if(rs.next()){
                   
                   String tipo_nivel = rs.getString("nivel");
                   
                   if(tipo_nivel.equalsIgnoreCase("Lider")){
                       
                       dispose();
                       new LiderDeProyecto().setVisible(true);
                       
                   } else if(tipo_nivel.equalsIgnoreCase("Desarrollador")){
                       dispose();
                       new Desarrollador().setVisible(true);
                   } 
                   
               } else{
                   JOptionPane.showMessageDialog(null, "Tus credenciales de inicio de sesion no coinciden con una cuenta en nuestros sistemas");
                   txtUsuario.setText("");
                   Password.setText("");
               }
               
           }catch(SQLException e){
               System.err.println("inicio correctamente" + e);
               JOptionPane.showMessageDialog(null, "Tus credenciales de inicio de sesion no coinciden con una cuenta en nuestros sistemas");
           }
           
       } else {
           JOptionPane.showMessageDialog(null, "Tus credenciales de inicio de sesion no coinciden con una cuenta en nuestros sistemas");
           
       }
    }//GEN-LAST:event_IngresarActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
