package faction;




import org.apache.commons.codec.binary.Base64;

import safe_Action.RSACoder;

public class message {
	
	private static byte[] publicKey;

	private static byte[] privateKey;

	
public String massage(String message,String publickey) throws Exception{
	publicKey = RSACoder.getPublicKey(publickey);
	System.out.println(message);
	String inputStr2 = message;
	String encodeDate3 = null;
	
	byte[] data2 = inputStr2.getBytes("UTF8");
	byte[] encodedData2 = RSACoder.encryptByPublicKey(data2, publicKey);
	encodeDate3 = Base64.encodeBase64String(encodedData2);
	return encodeDate3;
}
public String d_massage(String message,String privatekey) throws Exception{
	privateKey = RSACoder.getPrivateKey(privatekey);
	byte[] data2 = Base64.decodeBase64(message);
	byte[] encodedData2 = RSACoder.decryptByPrivateKey(data2, privateKey);
	String outputStr2 = new String(encodedData2,"UTF8");
	return outputStr2;
}

}
