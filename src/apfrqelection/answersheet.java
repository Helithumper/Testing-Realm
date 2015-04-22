private int numFirstVotes(String candidate, ArrayList<String> candidateList) {
		int numberofVotes = 0;
		for (Ballot ballot : ballotList) {
			if (ballot.firstChoiceFrom(candidateList) == candidate) {
				numberofVotes++;
			}
		}
		return numberofVotes;
	}

	
	public ArrayList<String> candidatesWithFewest(
			ArrayList<String> candidateList) {
		int[] voteCounts = new int[candidateList.size()];
		int lowest = numFirstVotes(candidateList.get(0), candidateList);
		for (int i = 0; i < candidateList.size(); i++) {
			voteCounts[i] = numFirstVotes(candidateList.get(i), candidateList);
			if (voteCounts[i] < lowest) {
				lowest = voteCounts[i];
			}
		}
		ArrayList<String> losers = new ArrayList<String>();
		for (int i = 0; i < candidateList.size(); i++) {
			if (voteCounts[i] == lowest)
				losers.add(candidateList.get(i));
		}
		return losers;
	}
