package commandPattern;

public class CharacterJob {
	String job = "";

	public CharacterJob(String job) {
		this.job = job;
	}

	public void attack() {
		System.out.println(job + " is Attack.");
	}

	public void defend() {
		System.out.println(job + " is Defend.");
	}
}
