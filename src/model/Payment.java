package model;


public class Payment {
    private String nic;
    private String fullName;
    private String courseId;
     private String batchNo;
    private String description;
    private String paymentMethod;
    private String courseFee;
    private String paidAmount;
    private String registrationFee;
    private String Balance;
    private String receiptId;
    private String date;

    public Payment() {
    }


    public Payment(String nic, String fullName, String courseId, String batchNo, String description,
                   String paymentMethod, String courseFee, String paidAmount, String registrationFee,
                   String balance, String receiptId, String date) {
        this.nic = nic;
        this.fullName = fullName;
        this.courseId = courseId;
        this.batchNo = batchNo;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.courseFee = courseFee;
        this.paidAmount = paidAmount;
        this.registrationFee = registrationFee;
        this.Balance = balance;
        this.receiptId = receiptId;
        this.date = date;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(String registrationFee) {
        this.registrationFee = registrationFee;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "nic='" + nic + '\'' +
                ", fullName='" + fullName + '\'' +
                ", courseId='" + courseId + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", description='" + description + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", courseFee='" + courseFee + '\'' +
                ", paidAmount='" + paidAmount + '\'' +
                ", registrationFee='" + registrationFee + '\'' +
                ", Balance='" + Balance + '\'' +
                ", receiptId='" + receiptId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
