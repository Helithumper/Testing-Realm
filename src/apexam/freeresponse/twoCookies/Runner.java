package apexam.freeresponse.twoCookies;

public class Runner {

	public static void main(String[] args) {
		MasterOrder mo = new MasterOrder();
		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("PIE", 15));

		mo.addOrder(new CookieOrder("Chocolate", 30));

		mo.addOrder(new CookieOrder("Chocolate", 30));

		mo.addOrder(new CookieOrder("Chocolate", 30));

		mo.addOrder(new CookieOrder("Chocolate", 30));

		mo.addOrder(new CookieOrder("abc", 2));

		// System.out.println(mo.getTotalBoxes());
		System.out.println(mo.getTotalBoxes());
		System.out.println(mo.removeVariety("PIE"));
		System.out.println(mo.getTotalBoxes());

	}

}
