package commandPattern;

public class CancelSkillCommand implements Command{
	SpecialCharacter job;
	
	public CancelSkillCommand(SpecialCharacter job){
		this.job = job;
	}
	
	public void execute(){
		job.stop();
	}
}
