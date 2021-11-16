package schneckenrennen;

import java.util.ArrayList;

public class Rennen {
	private String raceName;
	private int numberOfRacers = 0;
	private ArrayList<Rennschnecke> race;
	private double raceDistance;

	public Rennen() {
		raceName = "Gartenlandschaft";
		race = new ArrayList<Rennschnecke>();
		raceDistance = 10.0;
	}

	public void addRennschnecke(Rennschnecke neueSchnecke) {
		race.add(neueSchnecke);
		numberOfRacers++;
	}

	public void removeRennschnecke(String name) {
		for (int i = 0; i < race.size(); i++) {
			if (race.get(i).getName().equals(name)) {
				race.remove(i);
				numberOfRacers--;
			}
		}
	}

	public Rennschnecke ermittleGewinner() {
		Rennschnecke rs = null;
		for (int i = 0; i < race.size(); i++) {
			if (rs != null) {
				if (race.get(i).getWeg() >= raceDistance && race.get(i).getWeg() > rs.getWeg()) {
					rs = race.get(i);
				}
			} else {
				if (race.get(i).getWeg() >= raceDistance) {
					rs = race.get(i);
				}

			}

		}
		return rs;
	}

	public void lasseSchneckenKriechen() {
		for (int i = 0; i < race.size(); i++) {
			race.get(i).krieche();
			;
		}
	}

	public void durchfuehren() {
		Rennschnecke rs = null;
		do {
			lasseSchneckenKriechen();
			rs = ermittleGewinner();
			// test of race during racing
			//System.out.println(race);
		} while (rs == null);
		System.out.println("=====================================");
		System.out.println(race);
		System.out.println("Gewinner: " + rs.getName());
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public int getNumberOfRacers() {
		return numberOfRacers;
	}

	public void setNumberOfRacers(int numberOfRacers) {
		this.numberOfRacers = numberOfRacers;
	}

	public ArrayList<Rennschnecke> getRace() {
		return race;
	}

	public void setRace(ArrayList<Rennschnecke> race) {
		this.race = race;
	}

	public double getRaceDistance() {
		return raceDistance;
	}

	public void setRaceDistance(double raceDistance) {
		this.raceDistance = raceDistance;
	}

	@Override
	public String toString() {
		return "Rennen [raceName=" + raceName + ", numberOfRacers=" + numberOfRacers + ", race=" + race
				+ ", raceDistance=" + raceDistance + ", getRaceName()=" + getRaceName() + ", getNumberOfRacers()="
				+ getNumberOfRacers() + ", getRace()=" + getRace() + ", getRaceDistance()=" + getRaceDistance() + "]";
	}

}
