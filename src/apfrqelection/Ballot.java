package apfrqelection;

import java.util.ArrayList;

public class Ballot {

	private ArrayList<String> candidateList = new ArrayList<String>();

	public Ballot(ArrayList<String> cand) {
		candidateList = cand;
	}

	public String firstChoiceFrom(ArrayList<String> candidateList) {
		return candidateList.get(0);
	}
}
