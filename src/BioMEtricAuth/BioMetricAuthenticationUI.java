/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BioMEtricAuth;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Wimukthi
 */
public class BioMetricAuthenticationUI extends javax.swing.JFrame {
    ArrayList<Integer[]> PressedTimeStore;
    ArrayList<Integer[]> DifferenceTimeStore;
    BioMetricAuthenticationListener listenerSignUp;
    BioMetricAuthenticationListener listenerLoggin;
    BioMetricAuthenticationAnaly checker;
    ArrayList<String> password;
    HashMap<String, Integer> allUsers;
    
    //constructor
    public BioMetricAuthenticationUI() {
        initComponents();
        setLocationRelativeTo(null);
        listenerSignUp = new BioMetricAuthenticationListener();
        listenerLoggin = new BioMetricAuthenticationListener();
        PressedTimeStore = new ArrayList();
        DifferenceTimeStore = new ArrayList();
        password = new ArrayList();
        allUsers = new HashMap();
        passwordSignupText.addKeyListener(listenerSignUp);
        passwordLoginText.addKeyListener(listenerLoggin);
        checker = new BioMetricAuthenticationAnaly();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        userNameSignup = new javax.swing.JLabel();
        usernameSignupText = new javax.swing.JTextField();
        PasswordSignup = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        signupPopup = new javax.swing.JLabel();
        passwordSignupText = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        usernameLogin = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        usernameLoginText = new javax.swing.JTextField();
        logOut = new javax.swing.JLabel();
        passwordLoginText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(118, 107, 107));

        jPanel1.setBackground(new java.awt.Color(94, 90, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Luminari", 3, 24), new java.awt.Color(204, 195, 195))); // NOI18N

        userNameSignup.setText("UserName");

        PasswordSignup.setText("Password");

        signupBtn.setText("Sign-Up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        signupPopup.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 9)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addComponent(PasswordSignup)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(userNameSignup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameSignupText, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(passwordSignupText))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(signupBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(signupPopup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signupPopup, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameSignupText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameSignup))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(signupBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PasswordSignup)
                        .addComponent(passwordSignupText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        usernameSignupText.getAccessibleContext().setAccessibleName("regName");

        jTabbedPane1.addTab("Sign-Up", jPanel1);

        jPanel2.setBackground(new java.awt.Color(176, 176, 176));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Luminari", 3, 24), new java.awt.Color(204, 195, 195))); // NOI18N

        usernameLogin.setText("UserName");

        passwordLogin.setText("Password");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 10)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(loginBtn)
                .addContainerGap(188, Short.MAX_VALUE))
            .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLogin)
                    .addComponent(passwordLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(passwordLoginText))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLogin))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLogin)
                    .addComponent(passwordLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(loginBtn)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("SignUp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //action to sign-up button
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        if (!usernameSignupText.getText().isEmpty() && !passwordSignupText.getText().isEmpty() && !listenerSignUp.getPressedKeys().contains("Backspace")  && !passwordSignupText.getText().contains("⏎")) {
            if (passwordSignupText.getText().length()>5) {
                allUsers.put(usernameSignupText.getText(), allUsers.size());
                password.add(passwordSignupText.getText());
                PressedTimeStore.add(listenerSignUp.getPressingTime());
                DifferenceTimeStore.add(listenerSignUp.getTimeDifferences());
                listenerSignUp.informationShowing();
                listenerSignUp.clear();

                signupPopup.setText(usernameSignupText.getText()+ " added successfully.");
                usernameSignupText.setText("");
                passwordSignupText.setText("");
            }
            else{
                signupPopup.setText("Error with entered data. \nPlease enter password with morethan 5 letters.");
            }
        } else {
            listenerSignUp.clear();
            passwordSignupText.setText("");
            signupPopup.setText("Error with entered data. \nPlease enter user details again.");
        }
    }//GEN-LAST:event_signupBtnActionPerformed

    //action to login button
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if (allUsers.containsKey(usernameLoginText.getText())) {
            int valueTime = allUsers.get(usernameLoginText.getText());
            if(password.contains(passwordLoginText.getText())) {
                if(valueTime == checker.biometricAnalyze(listenerLoggin.getPressingTime(), listenerLoggin.getTimeDifferences(), PressedTimeStore, DifferenceTimeStore) - 1) {
                    listenerLoggin.clear();
                    
                    logOut.setText("User is " + usernameLoginText.getText() + ".\nSuccessfully authenticated.");
                    usernameLoginText.setText("");
                    passwordLoginText.setText("");
                } else {
                    logOut.setText("Authentication failed.\nTry again later.");
                    listenerLoggin.clear();
                }
            } else {
                listenerLoggin.clear();
                logOut.setText("Authentication failed.\nEnter password correctly.");
            }
        } else {
            logOut.setText("Authentication failed.\nEnter username correctly.");
            listenerLoggin.clear();
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BioMetricAuthenticationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PasswordSignup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logOut;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passwordLogin;
    private javax.swing.JPasswordField passwordLoginText;
    private javax.swing.JPasswordField passwordSignupText;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel signupPopup;
    private javax.swing.JLabel userNameSignup;
    private javax.swing.JLabel usernameLogin;
    private javax.swing.JTextField usernameLoginText;
    private javax.swing.JTextField usernameSignupText;
    // End of variables declaration//GEN-END:variables
}