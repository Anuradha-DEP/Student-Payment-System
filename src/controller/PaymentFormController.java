package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import model.Payment;
import service.PaymentService;
import service.StudentService;
import util.MaterialUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class PaymentFormController {
    private final PaymentService paymentService = new PaymentService();
    public AnchorPane root;
    public ImageView imgLogo;
    public Label lblTitle;
    public TextField txtNIC;
    public TextField txtCourseId;
    public TextField txtName;
    public TextField txtDescription;
    public TextField txtCourseFee;
    public JFXButton btnMakePayment;
    public TextField txtBatchNo;
    public TextField txtPaymentMethod;
    public TextField txtPaidAmount;
    public TextField txtRegistrationFee;
    public TextField txtBalance;
    public TextField txtReceiptId;
    public TextField txtDate;

    public void initialize(){
        MaterialUI.paintTextFields(txtNIC,txtName,txtBalance,txtBatchNo,txtCourseFee,
                txtCourseId,txtDescription,txtPaidAmount,txtPaidAmount
        ,txtPaymentMethod,txtRegistrationFee);

        int i = paymentService.passId();
        txtReceiptId.setText(String.valueOf(i+1));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txtDate.setText(sdf.format(new Date()));
    }


    public void btnMakePayment_OnAction(ActionEvent actionEvent) {
        Payment payment = new Payment(txtNIC.getText(),
                txtName.getText(),txtCourseId.getText(),txtBatchNo.getText(),
                txtDescription.getText(),txtPaymentMethod.getText(),
                txtCourseFee.getText(),txtPaidAmount.getText(),txtRegistrationFee.getText(),
                txtBalance.getText(),txtReceiptId.getText(), txtDate.getText());

        paymentService.savePayment(payment);
    }
}
