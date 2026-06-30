package shieldcare;
import java.io.*; import java.util.*;
public class ClaimImportApp {
    public static void main(String[] args) throws Exception {
        File xmlFile = new File(args.length > 0 ? args[0] : "xml/insurer-policy-sync.xml");
        XMLImportControl importer = new XMLImportControl();
        List<InsurerXmlRecord> records = importer.importInsurerXml(xmlFile);
        new PolicySyncControl().syncPolicyData(records);
        Policy policy = new Policy("POL-1001", "active", 1500, 8);
        Claim claim = new Claim("CLM-5001", "POL-1001", "VehicleDamage", 35000);
        new ClaimHandlingControl().verifyAndAssign(claim, policy, true);
        System.out.println("Claim " + claim.getClaimId() + " status: " + claim.getStatus());
    }
}
