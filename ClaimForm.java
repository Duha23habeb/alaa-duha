package shieldcare;
public class ClaimForm {
    private String formId;
    private String status;
    public ClaimForm(String formId, String status){this.formId=formId; this.status=status;}
    public boolean isApproved(){return "approved".equalsIgnoreCase(status);}
}
