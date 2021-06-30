package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class AddNewCourse {
    public AnchorPane root;
    public ImageView imgLogo;
    public Label lblTitle;
    public TextField txtCourseId;
    public TextField txtCourseName;
    public TextField txtDuration;
    public TextField txtCourseFee;
    public JFXButton btnAddCourse;
    public TextField txtRegistrationFee;

    public void btnAddCourse_OnAction(ActionEvent actionEvent) {
    }
}
