package com.Rushi.classes;

public class Players {
	public static int batterTotalRuns(Player[] arr) {
		int runs = 0;
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			runs = runs + cref.getRuns();
		}
		return runs;
	}

	public static int bowlerTotalWickets(Player[] arr) {
		int wickets = 0;
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			wickets = wickets + cref.getwickets();
		}
		return wickets;
	}

	public static int countBowlers(Player[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			if (cref.getwickets() > 0) {
				counter++;
			}
		}
		return counter;
	}

	public static int countBatters(Player[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			if (cref.getRuns() > 0) {
				counter++;
			}
		}
		return counter;
	}

	public static Player maxRunBatter(Player[] arr) {
		int maxRuns = 0;
		Player pref = null;
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			if (cref.getRuns() > maxRuns) {
				maxRuns = cref.getRuns();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			if (cref.getRuns() == maxRuns) {
				pref = arr[i];
			}
		}
		return pref;
	}

	public static Player maxWicketBowler(Player[] arr) {
		int maxWickets = 0;
		Player pref = null;
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			if (cref.getRuns() > maxWickets) {
				maxWickets = cref.getRuns();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			Cricketer cref = (Cricketer) arr[i];
			if (cref.getRuns() == maxWickets) {
				pref = arr[i];
			}
		}
		return pref;
	}

	public Players() {

	}

}
