package com.hlj.version;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.junit.Test;



/** 
 * @author : HealerJean
 * @date   �� 2017��12��29�� ����2:45:28 
 * @Description:
 */
public class TomcatMain {

@Test
public void testName() throws Exception {
	Map< String, String> map = new HashMap<>();
	map.put(null, "12");
	map.put(null, null);

	map.get(null);
	System.out.println(map);
 }

}
