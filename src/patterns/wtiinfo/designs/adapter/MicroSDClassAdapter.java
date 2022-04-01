package patterns.wtiinfo.designs.adapter;

public class MicroSDClassAdapter extends USB {

	@Override
	public byte[] getBytes() {
		byte[] newBytes = new byte[super.getBytes().length];
		for (int i = 0; i < super.getBytes().length; i++) {
			newBytes[i] = 0b101;
		}
		return newBytes;
	}

	@Override
	public void setBytes(byte b) {
		super.setBytes((byte) (b + 0b100));
	}

	public byte[] getValueInByte() {
		return super.getBytes();
	}
	
}
