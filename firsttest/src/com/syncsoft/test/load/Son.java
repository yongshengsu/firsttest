/**
 * 
 */
package com.syncsoft.test.load;

/**
 * @author suyongsheng
 * @date   2019年5月19日 上午11:37:57
 */
public class Son extends Father {
	public static String staicField ="staticField";
    public static void staMethod(){
    	System.out.println("son static method");
    }
	static{
		System.out.println("son static");
	}
	{
		System.out.println("son nostatic");
	}
	/**
	 * 
	 */
	public Son() {
		// TODO Auto-generated constructor stub
		System.out.println("son construct");
	}

	/**
	 * @param name
	 */
	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
    private void hello() {
		System.out.println("hello");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
