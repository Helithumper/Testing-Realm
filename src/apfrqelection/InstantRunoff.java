package apfrqelection;

import java.util.ArrayList;

public class InstantRunoff {

	public static void main(String[] args) {
		VoterBallots ballots = new VoterBallots();
		ArrayList<String> candidates = new ArrayList<String>();
		candidates.add("Bill");
		candidates.add("Tom");
		candidates.add("Phil");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Bill");
		list1.add("Tom");
		list1.add("Phil");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Tom");
		list2.add("Bill");
		list2.add("Phil");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Phil");
		list3.add("Bill");
		list3.add("Tom");
		ballots.addBallot(new Ballot(list1));

		ballots.addBallot(new Ballot(list2));

		ballots.addBallot(new Ballot(list1));

		System.out.println(ballots.candidatesWithFewest(candidates));

	}

}
