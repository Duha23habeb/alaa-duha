package shieldcare;
public class InsurerXmlRecord {
    public String policyNumber;
    public double premiumAmount;
    public double commissionRate;
    public String claimReference;
    public InsurerXmlRecord(String policyNumber, double premiumAmount, double commissionRate, String claimReference){
        this.policyNumber=policyNumber; this.premiumAmount=premiumAmount; this.commissionRate=commissionRate; this.claimReference=claimReference;
    }
}
