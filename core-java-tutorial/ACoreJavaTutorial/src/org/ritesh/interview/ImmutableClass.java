package org.ritesh.interview;

final class PanInfo {
	final String panCardNo;

	PanInfo(String s) {
	panCardNo = s;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

}

public class ImmutableClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PanInfo info = new PanInfo("BIRPK0769");
		String str = info.getPanCardNo();*/
		String str="Ritesh Kumar";
		str.toLowerCase();
		System.out.println(str.toLowerCase());
		
		
	}

}
