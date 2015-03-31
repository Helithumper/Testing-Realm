package BusQuestions;

import java.util.ArrayList;

public class BusQuestions {
	
	public boolean isPrime(long n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public void laps(int laps) {
		for (int i = 1; i < laps; i++) {
			if (isPrime(i)) {
				System.out.println("Butterfly");
			}
			if (i % 2 == 0) {
				System.out.println("Backstroke");
			}
			if (i % 5 == 0) {
				System.out.println("Breaststroke");
			} else {
				System.out.println("Freestyle");
			}
		}
	}

	public void bottles() {
		String response = " Bottles of Beer on the Wall\n\tTake one down\n\tpass it around";
		String[] ones = "no one two three four five six seven eight nine"
				.split(" ");
		String[] tens = "ten twenty thirty fourty fifty sixty seventy eighty ninety"
				.split(" ");
		String[] elevens = "eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen"
				.split(" ");
		for (int i = 99; i >= 0; i--) {
			if (i < 10) {
				System.out.println(ones[i] + response);
			} else if (i % 10 == 0) {
				System.out.println(tens[i / 10 - 1] + response);
			} else if (i < 20) {
				System.out.println((elevens[i - 11]) + response);
			} else {
				System.out.println(tens[i / 10 - 1] + " " + ones[i % 10]
						+ response);
			}
		}
	}

	public String dnaReplication(String dna) {
		String result = "";
		for (char a : dna.toLowerCase().toCharArray()) {
			switch (a) {
			case 'a':
				result += "T";
				break;
			case 'c':
				result += "G";
				break;
			case 't':
				result += "A";
				break;
			case 'g':
				result += "C";
				break;
			}
		}
		return result;
	}

	public ArrayList<String> markCodons(String sequence) {

		ArrayList<String> result = new ArrayList<String>();
		try {
			for (int i = 0; i < sequence.length(); i += 3) {
				result.add("(" + sequence.substring(i, i + 3) + ")");
			}
		} catch (Exception e) {
			System.out
					.println("Not all pairs are shown as they are not all complete");
		}
		return result;
	}
	

	public int mystery(int i) {
		if (i == 1) {
			return 0;
		}
		return i + mystery(i - 1);
	}
}
