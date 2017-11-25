package commandPattern;

public class SkillCommand implements Command{
	SpecialCharacter job;
	
	public SkillCommand(SpecialCharacter job){
		this.job = job;
	}
	
	public void execute(){
		job.engage();
		job.aim();
		job.operate();
	}
}
