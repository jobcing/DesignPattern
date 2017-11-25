package remoteProxy;

import java.rmi.*;

public interface HomeNetRemote extends Remote{
	public String getLocation() throws RemoteException;
	public String getState() throws RemoteException;
}
