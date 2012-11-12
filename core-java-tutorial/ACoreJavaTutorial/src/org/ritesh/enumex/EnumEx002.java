package org.ritesh.enumex;

public class EnumEx002 {

	/**
	 * @param args
	 */
	enum Season {SUMMER(20),WINTER(11),RAINY(13),OTHERS(15);
	private int value;
	private Season(int value)
	{
	this.value=value;	
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(Season s:Season.values())
{
System.out.println(s+"  " + s.value);	
}
	}

}
