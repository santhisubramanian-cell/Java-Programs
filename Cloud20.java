package ifelse;
import java.util.Scanner;
public class Cloud20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int storageGB = scan.nextInt();
        int userCount = scan.nextInt();
        scan.nextLine(); // consume newline
        String backupFrequency = scan.nextLine();
        String supportTier = scan.nextLine();
        double baseStorageCost = 0.0;

        if (storageGB <= 100) {
            baseStorageCost = storageGB * 0.05;
        } else if (storageGB <= 500) {
            baseStorageCost = (100 * 0.05) +
                    (storageGB - 100) * 0.04;
        } else if (storageGB <= 2000) {
            baseStorageCost = (100 * 0.05) +
                    (400 * 0.04) +
                    (storageGB - 500) * 0.03;
        } else {
            baseStorageCost = (100 * 0.05) +
                    (400 * 0.04) +
                    (1500 * 0.03) +
                    (storageGB - 2000) * 0.02;
        }
        double perUserFee;
        if (userCount <= 10) {
            perUserFee = userCount * 5.0;
        } else if (userCount <= 50) {
            perUserFee = userCount * 4.0;
        } else {
            perUserFee = userCount * 3.0;
        }

        
        double backupPremium;
        if (backupFrequency.equals("Daily")) {
            backupPremium = 0.0;
        } else if (backupFrequency.equals("Hourly")) {
            backupPremium = 15.0 + (0.5 * userCount);
        } else { 
            backupPremium = 50.0 + (1.0 * userCount);
        }
        double supportFee;
        if (supportTier.equals("Community")) {
            supportFee = 0.0;
        } else if (supportTier.equals("Standard")) {
            supportFee = 20.0;
        } else if (supportTier.equals("Priority")) {
            supportFee = 75.0;
        } else { 
            supportFee = 200.0;
        }
        double monthlySubscription = baseStorageCost + perUserFee + backupPremium + supportFee;
        double annualSubscription = monthlySubscription * 12 * 0.9; // 10% discoun
        monthlySubscription = Math.round(monthlySubscription * 100.0) / 100.0;
        annualSubscription = Math.round(annualSubscription * 100.0) / 100.0;
        String recommendedPlan;
        String includedFeatures;

        if (userCount == 1) {
            recommendedPlan = "Personal";
            includedFeatures = "Basic storage, file sync";
        } else if (userCount <= 20) {
            recommendedPlan = "Team";
            includedFeatures = "Version history, file sharing, basic analytics";
        } else if (userCount <= 100) {
            recommendedPlan = "Business";
            includedFeatures = "Advanced sharing, team analytics, priority support";
        } else {
            recommendedPlan = "Enterprise";
            includedFeatures = "Advanced security, compliance tools, dedicated support, API access";
        }
        System.out.println("Storage Capacity: " + storageGB + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);
        System.out.println("Base Storage Cost: $" + baseStorageCost);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthlySubscription);
        System.out.println("Annual Subscription: $" + annualSubscription + " (save 10%)");
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Included Features: " + includedFeatures);

	}

}
