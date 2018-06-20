package IntSetTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;

import IntSet.IntSetList;

class IntSetListTest {
	IntSetList a = new IntSetList();
	private static int MAX_VAL = 1000000;
	private static int MAX_ELE = MAX_VAL/100;
	private static Random num = new Random();
	
	//public LinkedList<Integer> tmp = new LinkedList<Integer>(); 

	
	@Test
	void testIntSetImp() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		assertEquals(MAX_VAL,a.maxvalue);
		assertEquals(MAX_ELE, a.List.size());
		//fail("Not yet implemented");
	}
	
	
	@Test
	void testInsert() {
		int[] tmp = {1,2,3,4,5,6,7,8,9,10};
		int[] tmp2 =new int[a.List.size()];
		
		for(int i=0;i<MAX_ELE;i++)
		{
			tmp2[i]=a.List.get(i);
		}
		
		a.intSetImp(MAX_ELE, MAX_VAL);
		int x=0;
		do {
			a.insert(x++);
		}while(a.size()<MAX_ELE);
		
		for(int i=0;i<MAX_ELE;i++) {
			assertEquals(tmp[i],tmp2[]);
		}
		//fail("INSERT error");	
	}
	
	@Test
	void testReport() {
		int[] tmp = {1,2,3,4,5,6,7,8,9,10};
		int[] tmp2 =new int[a.List.size()];
		
		for(int i=0;i<MAX_ELE;i++)
		{
			tmp2[i]=a.List.get(i);
		}
		
		a.intSetImp(MAX_ELE, MAX_VAL);
		do {
			a.insert(num.nextInt(MAX_ELE));
		}while(a.size()<MAX_ELE);
		a.report();
		for(int i=0;i<MAX_ELE;i++) {
			assertEquals(tmp[i],tmp2[i]);
		}
		//fail("REPORT error");
	}

/*
	@Test
	void testSize() {
		a.intSetImp(MAX_ELE, MAX_VAL);
		do {
			a.insert(num.nextInt(MAX_VAL));
		}while(a.size()<MAX_ELE);
		
		//fail("SIZE error");
	}
*/
}
