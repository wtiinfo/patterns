package patterns.wtiinfo.designs.adapter;

public class MicroSDObjectAdapter {

	private USB usb;

	public MicroSDObjectAdapter(USB usb) {
		this.usb = usb;
	}
	
	public byte[] getBytes() {
		byte[] newBytes = new byte[usb.getBytes().length];
		for (int i = 0; i < usb.getBytes().length; i++) {
			newBytes[i] = 0b101;
		}
		return newBytes;
	}

	public void setBytes(byte b) {
		usb.setBytes((byte) (b + 0b100));
	}
	
}
