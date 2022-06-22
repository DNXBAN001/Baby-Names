package login.View;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import interfaces.Utilities;

public class LoginViewController implements Utilities 
{

    @FXML private PasswordField passwordField;
    @FXML private TextField txtFieldUserName;
    @FXML private Button loginButton;
   
    /**
     * This method will process the credentials of the user (Admin or ordinary user) in order
     * to grant him/her access to the appropriate interface. Remember that the users' details
     * will be coming from a file.
     * @param event
     */
    @FXML void processLogin(ActionEvent event) throws IOException 
    {
        if((passwordField.getText().equals(USERPSWD)) && (txtFieldUserName.getText().equals(USERNAME)))
        {
            loadUserView();
        }

        if(passwordField.getText().equals(ADMINPSWD) && txtFieldUserName.getText().equals(ADMINNAME))
        {
            loadAdminView();
        }
    }

    /**
     * This method will close the LoginView or Login interface
     */
    private void closeLoginView()
    {
        Stage stage = (Stage)loginButton.getScene().getWindow();
        stage.close();
    }

    /**
     * This method will close the Login interface in order to make way for the User interface
     * which will allow any end-user to interact with it. Note that the Admin could login as
     * a user and have to this platform.
     * @throws IOException
     */
    private void loadUserView() throws IOException 
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/user/View/UserView.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        closeLoginView();
    }

    /**
     * This method will close the Login interface in order to make way for the Admin interface
     * which will allow only the Admin to interact with it.
     * @throws IOException
     */
    private void loadAdminView() throws IOException 
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/admin/View/AdminView.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        closeLoginView();
    }

}

