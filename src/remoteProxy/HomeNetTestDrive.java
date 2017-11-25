package remoteProxy;

import java.rmi.Naming;

public class HomeNetTestDrive {
	public static void main(String[] ar){
		HomeNetRemote[] homeNet = new HomeNet[3];
		
		try{ // 생성자에서 예외를 던질 수 있으므로 try ~ catch 문 사용
			homeNet[0] = new HomeNet("거실", "전등 ON");
			homeNet[1] = new HomeNet("방1", "전등 OFF");
			homeNet[2] = new HomeNet("방2", "전등 ON");
			
			Naming.rebind("거실", homeNet[0]);
			Naming.rebind("방1", homeNet[1]);
			Naming.rebind("방2", homeNet[2]);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
