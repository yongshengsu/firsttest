/**
 * 
 */
package com.syncsoft.test.load;

/**
 * @author suyongsheng
 * @date   2019年5月19日 上午11:33:37
 */
public class Father {

	private String name;

	static{
		System.out.println("father static");
	}
	{
		System.out.println("father nostatic");
	}
	/**
	 * 
	 */
	public Father() {
		System.out.println("father construct");
	}
	public Father(String name){
		this.name= name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
