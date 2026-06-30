package shieldcare;
public class ReimbursementPayment {
    private String paymentId;
    private double amount;
    private String status = "Pending";
    public ReimbursementPayment(String paymentId, double amount){this.paymentId=paymentId; this.amount=amount;}
    public void markProcessed(){status="Processed";}
    public String getStatus(){return status;}
}
