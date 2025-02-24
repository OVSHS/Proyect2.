/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import code.user;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Omar Romero
 */
public class usersearch2 extends javax.swing.JPanel {

    private String tweetText;

    public usersearch2(user usuario) {
        initComponents();
        perfil.setText(usuario.username);
        if (usuario.gender == 'F') {
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/female.png"));
            pfp.setIcon(icon);
        } else if (usuario.gender == 'M') {
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/user.png"));
            pfp.setIcon(icon);
        }
    }

    public void setTweetText(String tweet) {
        this.text.setText(tweet);
      
    }

    public void setFecha(String fecha) {
        fechaLabel.setText(fecha);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfp = new javax.swing.JLabel();
        perfil = new javax.swing.JButton();
        PANEL = new javax.swing.JPanel();
        fechaLabel = new javax.swing.JLabel();
        text = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otro.png"))); // NOI18N

        perfil.setBackground(new java.awt.Color(0, 0, 0));
        perfil.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        perfil.setForeground(new java.awt.Color(255, 255, 255));
        perfil.setText("Nombre Perfil");
        perfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        perfil.setContentAreaFilled(false);
        perfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        PANEL.setBackground(new java.awt.Color(0, 0, 0));

        fechaLabel.setBackground(new java.awt.Color(0, 0, 0));
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fechaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fechaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pfp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
   
    }//GEN-LAST:event_perfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANEL;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JButton perfil;
    private javax.swing.JLabel pfp;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
