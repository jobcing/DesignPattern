package commandPattern;

public class HankyongGame {
	Command[] onCommands;
	Command[] offCommands;
	
	public HankyongGame(){
		onCommands = new Command[5];
		offCommands = new Command[5];
		
		Command noCommand = new NoCommand();
		
		for(int i = 0; i < 5; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPress(int slot){
		onCommands[slot].execute();
	}
	
	public void offButtonPress(int slot){
		offCommands[slot].execute();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Game Button ------\n");
		
		for(int i = 0; i < onCommands.length; i++){
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "		"
					+ offCommands[i].getClass().getName() + "\n");
		}
		
		return stringBuff.toString();
	}
}
