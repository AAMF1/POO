package projeto;
import javax.swing.JOptionPane;
/**
 *Interface onde pessoa pode fazer o login caso esteja inscrito no convivio ou, caso nao esteja, pode-se registar no mesmo
 */
public class Pessoas extends javax.swing.JFrame {
    
    ComunidadeDEI dei;
    /** Construtor para a criação de um interface onde e possivel fazer o login ou, caso nao esteja registado no convivio, fazer o registo no mesmo
     * @param dei objeto da comunidade
     */
    public Pessoas(ComunidadeDEI dei){       
        initComponents();  
        this.dei=dei;
    }
    
    String getUsername(){
        return username.getText();
    }
    String getPassword(){
        return password.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        userl = new javax.swing.JLabel();
        passl = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        loginbot = new javax.swing.JButton();
        registarbot = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        mensagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userl.setText("Username:");

        passl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passl.setText("Password:");

        loginbot.setText("Login");
        loginbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbotActionPerformed(evt);
            }
        });

        registarbot.setText("Registar");
        registarbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarbotActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/premio-universidade-de-coimbra.jpg"))); // NOI18N

        jButton1.setText("Retroceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginbot, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registarbot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(loginbot)
                        .addGap(18, 18, 18)
                        .addComponent(registarbot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbotActionPerformed
        for(Pessoa c: dei.getConvivio()){
            if(username.getText().equals(c.getUsername())&&password.getText().equals(c.getPassword())){
                this.setVisible(false);
                new Loginn(dei, c).setVisible(true);
                JOptionPane.showMessageDialog(null, "Bem vindo");
            }
            else
                mensagem.setText("Username ou password incorretos. Tente novamente");               
        }
    }//GEN-LAST:event_loginbotActionPerformed

    private void registarbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarbotActionPerformed
        this.setVisible(false);
        new Registarr(dei).setVisible(true);
        
    }//GEN-LAST:event_registarbotActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MenuPrincipal(dei).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginbot;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel passl;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registarbot;
    private javax.swing.JLabel userl;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
