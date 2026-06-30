package shieldcare;
public class Policy {
    private String policyNumber;
    private String status;
    private double premiumAmount;
    private double commissionRate;
    public Policy(String policyNumber, String status, double premiumAmount, double commissionRate){
        this.policyNumber=policyNumber; this.status=status; this.premiumAmount=premiumAmount; this.commissionRate=commissionRate;
    }
    public String getPolicyNumber(){return policyNumber;}
    public boolean isActive(){return "active".equalsIgnoreCase(status);}
    public void updateFromXml(double premiumAmount, double commissionRate){this.premiumAmount=premiumAmount; this.commissionRate=commissionRate;}
}
