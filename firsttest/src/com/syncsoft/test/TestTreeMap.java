/**
 * 
 */
package com.syncsoft.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author suyongsheng
 * @date   2019年3月31日 下午10:34:29
 */
public class TestTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> sortMap = new TreeMap<String,String>(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		sortMap.put("name", "小黑");
	    sortMap.put("address", "福建省");
	    sortMap.put("sex", "男");
	    sortMap.put("age", "12");
	    System.out.println(sortMap);
	    List<String> list = new ArrayList<String>(){
	    	/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			{
	    		add("abc");add("cdw");add("aba");
	    	}
	    };
	    Collections.sort(list);
	    System.out.println(list);
	}

}
