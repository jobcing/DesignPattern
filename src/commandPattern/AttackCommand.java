package commandPattern;

// ConcreteCommand 객체
public class AttackCommand implements Command{
	CharacterJob job;
	
	public AttackCommand(CharacterJob job){
		this.job = job;
	}
	
	public void execute(){
		job.attack();
	}
}
