package commandPattern;

public class SpecialCharacter {
	String job = "";

	public SpecialCharacter(String job) {
		this.job = job;
	}

	public void	engage() {
		System.out.println(job + " engage Power....");
	}
	
	public void aim(){
		System.out.println(job + " take Aim....");
	}

	public void operate(){
		System.out.println(job + " operate Skill.");
	}
	
	public void stop(){
		System.out.println(job + " stop Skill.");
	}
}
