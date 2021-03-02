package connection;

import java.util.Map;

public class sql_tables {
	private int ID;
	private String name;
	private String password;
	private String publickey;
	private String privatekey;
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public String getPublickey() {
		return publickey;
	}
	public void setPublickey(String publicKey) {
		this.publickey = publicKey;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
