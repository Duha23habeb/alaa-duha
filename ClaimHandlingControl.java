package shieldcare;

import java.io.File;
import java.util.List;

public class ClaimImportApp {

    public static void main(String[] args) {

        try {

            System.out.println("Working Directory:");
            System.out.println(System.getProperty("user.dir"));

            File xmlFile = new File(System.getProperty("user.dir")
                    + File.separator
                    + "xml"
                    + File.separator
                    + "insurer-policy-sync.xml");

            System.out.println("XML Path:");
            System.out.println(xmlFile.getAbsolutePath());

            System.out.println("File Exists: " + xmlFile.exists());

            if (!xmlFile.exists()) {
                System.out.println("ERROR: XML file was not found.");
                return;
            }

            XMLImportControl importer = new XMLImportControl();
            List<InsurerXmlRecord> records = importer.importInsurerXml(xmlFile);

            PolicySyncControl sync = new PolicySyncControl();
            sync.syncPolicyData(records);

            Policy policy = new Policy(
                    "POL-1001",
                    "active",
                    1500,
                    8
            );

            Claim claim = new Claim(
                    "CLM-5001",
                    "POL-1001",
                    "VehicleDamage",
                    35000
            );

            ClaimHandlingControl control = new ClaimHandlingControl();
            control.verifyAndAssign(claim, policy, true);

            System.out.println("--------------------------------");
            System.out.println("Claim ID: " + claim.getClaimId());
            System.out.println("Claim Status: " + claim.getStatus());
            System.out.println("--------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
