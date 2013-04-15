
public class Byte8Bits {
	private String bits;
	public Byte8Bits(String bits){
		this.bits = bits.substring(0, 7);
	}
	public String getBits() {
		return bits;
	}
	public void setBits(String bits) {
		this.bits = bits.substring(0, 7);
	}
	
	public String toString(){
		return bits;
	}
}
