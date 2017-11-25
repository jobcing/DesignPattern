package remoteProxy;

import java.rmi.*;
import java.rmi.server.*;

public class HomeNet extends UnicastRemoteObject implements HomeNetRemote{
	String location;
	String state;
	
	public HomeNet(String location, String state) throws RemoteException{
		this.location = location;
		this.state = state;
	}

	public String getState(){
		return state;
	}
	
	public String getLocation(){
		return location;
	}
}
