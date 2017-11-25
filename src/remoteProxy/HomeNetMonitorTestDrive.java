package remoteProxy;

import java.rmi.Naming;

public class HomeNetMonitorTestDrive {
	public static void main(String[] ar){
		String[] location = {"rmi://localhost/거실", "rmi://localhost/방1", "rmi://localhost/방2"};
		
		HomeNetMonitor[] monitor = new HomeNetMonitor[location.length];
		
		for(int i = 0; i < location.length; i++){
			try{
				HomeNetRemote homeNet = (HomeNetRemote) Naming.lookup(location[i]);
				monitor[i] = new HomeNetMonitor(homeNet);
				System.out.println(monitor[i]);
			} catch(Exception e){
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < monitor.length; i++){
			monitor[i].report();
		}
	}
}
