package faction;

import safe_Action.MD5Coder;
import sqlController.query;

public class login {
	public boolean login(String name,String password) throws Exception {
		String password1 = null;
		query query = new query();
		password1 = MD5Coder.encodeMD5Hex(password);
		if(query.query(name)!=null&&query.query(name).equals(password1)){
			return true;
		}
		return false;
	}
}
