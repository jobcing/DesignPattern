package remoteProxy;

import java.rmi.*;

public class HomeNetMonitor {
	HomeNetRemote homeNet;
	
	public HomeNetMonitor(HomeNetRemote homeNet){
		this.homeNet = homeNet;
	}
	
	public void report(){
		try{
			System.out.println("위치 : " + homeNet.getLocation());
			System.out.println("상태 : " + homeNet.getState());
		} catch(RemoteException e){
			e.printStackTrace();
		}
	}
}
