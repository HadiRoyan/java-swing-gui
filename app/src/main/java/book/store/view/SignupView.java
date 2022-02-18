/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book.store.view;

import book.store.entity.Response;
import book.store.entity.User;
import book.store.repository.UserRepository;
import book.store.repository.impl.UserRepositoryImpl;
import book.store.services.UserService;

import java.awt.Color;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignupView extends javax.swing.JFrame {

    private final Logger log = LoggerFactory.getLogger(SignupView.class);
    private final UserRepository repository = new UserRepositoryImpl();
    private final UserService service = new UserService(repository);
    
    public SignupView() {
        log.debug("setup UI");
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        log.debug("setup UI done");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        titlleLabel = new javax.swing.JLabel();
        userNameLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        infoLabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(750, 400));

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("EMAIL");

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("NAME");

        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("PASSWORD");

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        emailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        titlleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlleLabel.setText("SIGN UP");

        userNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel1.setText("USERNAME");

        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        infoLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailField)
                    .addComponent(passwordField)
                    .addComponent(usernameField))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titlleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(loginButton))
                .addGap(26, 26, 26)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        String name = nameField.getText();
        String username = usernameField.getText();
        String email = emailField.getText();
        char[] password = passwordField.getPassword();
        
        if (username.isBlank() || name.isBlank()){
            infoLabel.setText("NAME AND USERNAME IS EMPTY!!!");
            infoLabel.setForeground(Color.RED);
            log.info("username is empty");
        } else if (email.isBlank() || !emailValidation(email)) {
            infoLabel.setText("EMAIL not valid!!!");
            infoLabel.setForeground(Color.RED);
            log.info("email is not valid");
        } else if (password.length < 8) {
            infoLabel.setText("PASSWORD must grater than 8 character!!!");
            infoLabel.setForeground(Color.RED);
            log.info("password less than 8 charachter");
        } else {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setName(name);
            user.setEmail(email);
            user.setUsername(username);
            user.setPassword(password);
            
            log.info("Request to Server : Sign Up [{}]", username);
            var response = service.signup(user);
            switch (response) {
                case SUCCESS -> { // Ok
                    infoLabel.setText("SUCCESS SIGN UP, PLEASE LOGIN");
                    infoLabel.setForeground(Color.GREEN);
                    log.info("Response from server : "+ Response.SUCCESS.getDescription() +" - Success submit new user");
                }
                case ERROR -> { // service error
                    infoLabel.setText("SOMETHING FAILED, Please try again");
                    infoLabel.setForeground(Color.RED);
                    log.error("Response : "+ Response.ERROR.getDescription() +" An error occurred!!!");
                }
                default -> {
                    infoLabel.setText("SOMETHING WRONG, Please try again");
                    infoLabel.setForeground(Color.RED);
                    log.error("SOMETHING WORNG!!!");
                }
            }
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private boolean emailValidation(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        log.info("EMAIL VALIDATION: " + matcher.matches());
        return matcher.matches();
    }
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        log.info("OnCLick, login");
        dispose();
        new LoginView();
    }//GEN-LAST:event_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private java.awt.Label infoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titlleLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
