package com.findutil.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindUtil {

	
	public static void mostNumbersFrequent(int[] crr_array)
	{
		// The solution itself 
		  HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();
		  
		  ArrayList<Integer> maxRepeatedTimes= new ArrayList<Integer>();
		  ArrayList<Integer> maxNumberRepeated= new ArrayList<Integer>();

		  for (int i = 0; i < crr_array.length; ++i) {
		      int item = crr_array[i];

		      if (repetitions.containsKey(item))
		          repetitions.put(item, repetitions.get(item) + 1);
		      else
		          repetitions.put(item, 1);
		  }

		  // Now let's print the repetitions out
		  StringBuilder sb = new StringBuilder();

		  int overAllCount = 0;

		  for (Map.Entry<Integer, Integer> e : repetitions.entrySet()) {
		      if (e.getValue() > 1) {
		          overAllCount += 1;
		          maxNumberRepeated.add(e.getKey());
		          maxRepeatedTimes.add(e.getValue());
		     
		      }
		  }
		  
		  System.out.println("***********************");

		  System.out.println("Number are repeated  ");

		  if (overAllCount > 0) {
			  
			  Integer maxValue=Collections.max(maxRepeatedTimes);
			  for(int i=0;i<maxRepeatedTimes.size();i++)
			  {
				  if(maxValue.intValue()==maxRepeatedTimes.get(i))
				  {
					  System.out.println(maxNumberRepeated.get(i));
				  }
			  }
		  }
		  
		  System.out.println("***********************");


	}
}
