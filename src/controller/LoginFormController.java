package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import util.AppBarIcon;
import util.MaterialUI;

import java.io.IOException;

public class LoginFormController {
    public Label lblTitle;
    public TextField txtUserName;
    public TextField txtPassword;
    public JFXButton btnLogin;


    public void initialize(){
        MaterialUI.paintTextFields(txtUserName,txtPassword);
    }

    private void navigate(String title, String url) {
        MainFormController ctrl = (MainFormController) btnLogin.getScene().getUserData();
        ctrl.navigate(title, url, AppBarIcon.NAV_ICON_BACK, () ->
                ctrl.navigate("Student Management System", "/view/LoginForm.fxml", AppBarIcon.NAV_ICON_HOME));
    }

    public void btnLogin_OnAction(ActionEvent actionEvent) {

        navigate("Add New Student", "/view/HomeForm.fxml");
    }

}
