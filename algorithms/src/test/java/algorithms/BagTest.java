package algorithms;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pks.algorithms.bgs.Bag;

public class BagTest {
	
	String[] inputArray;
	
	@Before
	public void setUp(){
		System.out.println("doing setup");
		inputArray = new String[]{"one", "two", "three", "four", "five"};
	}
	
	@After
	public void tearDown(){
		System.out.println("doing tear down");
	}

	@Test
	public void test() {
		Bag<String> bag = new Bag<String>();
		
		assertEquals(true, bag.isEmpty());
		
		for( String str : inputArray ){
			bag.add(str);
		}
		
				
		int i = 0;
		for( Iterator<String> strIter = bag.iterator(); strIter.hasNext();){
			assertEquals(inputArray[i++], strIter.next());
		}
		
		assertEquals(inputArray.length, bag.size());
	   
		
	}

}
