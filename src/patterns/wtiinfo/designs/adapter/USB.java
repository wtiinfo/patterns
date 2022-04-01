package patterns.wtiinfo.designs.adapter;

public class USB {

	private byte[] bytes = new byte[10];
	
	public byte[] getBytes() {
		return bytes;
	}
	
	public void setBytes(byte b) {
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = b;
		}
	}
	
}
