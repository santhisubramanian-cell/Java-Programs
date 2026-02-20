package ifelse;
import java.util.Scanner;
public class Credit17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cardtier = scan.nextLine();
		String purchasecategoery = scan.nextLine();
		double transactionamt=scan.nextDouble();
		String promotionalstatus = scan.nextLine();
		
		double baserate =0;
		double categorybonus =0;
		double tiermul =0;
		double promotionalmul=0;
		
		if(cardtier.equals("Basic")) {
			baserate=1.0;
		}
		else if(cardtier.equals("Gold")) {
			baserate=1.0;
		}
		else if(cardtier.equals("Platinum")) {
			baserate=1.0;
		}
		else if(cardtier.equals("Black")) {
			baserate=1.0;
		}
		if(purchasecategoery.equals("Groceries")) {
			categorybonus=2.0;
		}
		else if(purchasecategoery.equals("Dining")) {
			categorybonus=2.5;
		}
		else if(purchasecategoery.equals("Travel")) {
			categorybonus=3.0;
		}
		else if(purchasecategoery.equals("Gas")) {
			categorybonus=2.0;
		}
		else {
			categorybonus=1.0;
		}
		if(cardtier.equals("Basic")) {
			tiermul=1.0;
		}
		else if(cardtier.equals("Gold")) {
			tiermul=1.25;
		}
		else if(cardtier.equals("Platinum")) {
			tiermul=1.5;
		}
		else if(cardtier.equals("Black")) {
			tiermul=2.0;
		}
		if(promotionalstatus.equals("None")) {
			promotionalmul=1.0;
		}
		else if(promotionalstatus.equals("Double-Points")) {
			promotionalmul=2.0;
		}
		else if(promotionalstatus.equals("Triple-Points")) {
			promotionalmul=3.0;
		}
		double poitedearned = transactionamt*baserate*categorybonus*tiermul*promotionalmul;
		double cashvalue=poitedearned*0.01;
		String rewardsTier;

		if (cardtier.equals("Basic")) {
		    tiermul = 1.0;
		    rewardsTier = "Standard";
		} else if (cardtier.equals("Gold")) {
		    tiermul= 1.25;
		    rewardsTier = "Enhanced";
		} else if (cardtier.equals("Platinum")) {
		    tiermul = 1.5;
		    rewardsTier = "Premium";
		} else { 
		    tiermul = 2.0;
		    rewardsTier = "Elite";
		}
		System.out.println("Card Tier: " + cardtier);
        System.out.println("Purchase Category: " + purchasecategoery);
        System.out.println("Transaction Amount: $" + transactionamt);
        System.out.println("Promotional Status: " + promotionalstatus);
        System.out.println("Base Points Rate: " + baserate + " points per dollar");
        System.out.println("Category Bonus: " + categorybonus + "x");
        System.out.println("Tier Multiplier: " + tiermul + "x");
        System.out.println("Promotional Multiplier: " + promotionalmul + "x");
        System.out.println("Points Earned: " + poitedearned);
        System.out.println("Equivalent Cash Value: $" + 
                           Math.round(cashvalue * 100.0) / 100.0);
        System.out.println("Rewards Tier: " + rewardsTier);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
