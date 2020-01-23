package com.findutil.number.test;

import com.findutil.number.FindUtil;

import junit.framework.TestCase;

public class FindUtilTest extends TestCase{
 int arr[]= {1,2,2,3,4,3,4,7,8};
	
	public void testMostNumbersFrequent()
	{
		FindUtil.mostNumbersFrequent(arr);
	}
}
