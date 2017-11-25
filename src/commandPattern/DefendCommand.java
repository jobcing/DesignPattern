package commandPattern;

public class DefendCommand implements Command{
	CharacterJob job;
	
	public DefendCommand(CharacterJob job){
		this.job = job;
	}
	
	public void execute(){
		job.defend();
	}
}
