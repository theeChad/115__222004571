
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emaily = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setForeground(new java.awt.Color(0, 102, 102));
        JPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        JPanel.setLayout(null);

        Left.setBackground(new java.awt.Color(51, 153, 0));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("DIGITAL DEPOT");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/uuu.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © company name All rights reserved.");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        JPanel.add(Left);
        Left.setBounds(0, 0, 390, 500);

        Right.setBackground(new java.awt.Color(51, 153, 0));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");

        emaily.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emaily.setForeground(new java.awt.Color(102, 102, 102));
        emaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(0, 102, 153));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Don't have an account!?");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(emaily)
                        .addComponent(jLabel3)
                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(emaily, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        JPanel.add(Right);
        Right.setBounds(390, 0, 399, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPanel.getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        
         String email, Password, query;
          String SUrl, SUser, SPass, passDb = null;
          SUrl = "jdbc:MYSQL://localhost:3306/java_user_db";
          SUser = "root";
          SPass = "";
          int notFound = 0;
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
              Statement st = con.createStatement();
              if("".equals(emaily.getText())){
                  JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error",
                          JOptionPane.ERROR_MESSAGE);
              }else if("".equals(password.getText())){
                  JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                          JOptionPane.ERROR_MESSAGE);
              }else{
                  email = emaily.getText();
                  Password = password.getText();
                  
                  query = "SELECT * FROM users WHERE email='"+email+"'";
                  ResultSet rs = st.executeQuery(query);
                  String fname = null;
                  while(rs.next()){
                      passDb = rs.getString("password");
                      fname = rs.getString("full_name");
                      notFound = 1;
                  }
                  if(notFound == 1 && Password.equals(passDb)){
                    Home HomeFrame = new Home();
                    HomeFrame.setUser(fname);
                    HomeFrame.setVisible(true);
                    HomeFrame.pack();
                    HomeFrame.setLocationRelativeTo(null);
                    this.dispose();
                    
                  }else{
                      JOptionPane.showMessageDialog(new JFrame(), "Incorrect Email or Password", "Error",
                          JOptionPane.ERROR_MESSAGE);
                  }
//                  st.execute(query);
//                  emaily.setText("");
                  password.setText("");
//                  showMessageDialog(null, "Account has been Created successfully");
              }
          }catch(Exception e){
              System.out.println("Error" + e.getMessage());
          }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void emailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField emaily;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
