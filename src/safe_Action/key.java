package safe_Action;

import java.util.Map;

public class key {
	public  void getKeyMap(String PUBLIC_KEY, String PRIVATE_KEY ) throws Exception{
		
		RSACoder.initKey(PUBLIC_KEY, PRIVATE_KEY);
		
		System.out.println("生成了keymap");
	}
}
