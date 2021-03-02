package faction;

import java.util.Map;

import safe_Action.MD5Coder;
import sqlController.add;

public class index {
	public void index(String name , String password,String publickey,String privatekey) throws Exception{
		String password1 = null;
		String privatekey1 = null;
		privatekey1 =MD5Coder.encodeMD5Hex(privatekey);
		password1 = MD5Coder.encodeMD5Hex(password);
		
		add add = new add();
		add.add(name, password1,publickey,privatekey1);
	}
}
