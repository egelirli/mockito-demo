package com.egelirli.spring.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author egelirli
 *
 */

public class SomeBusinessTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl busImpl = new SomeBusinessImpl(new DataSericeStub());
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(24, res);
	}
	
}


class DataSericeStub implements DataService {

	public int[] retrieveAllData() {
		return  new int[] {24, 5, 16};
	}

//	@Override
//	public int[] retrieveAllData() {
//		// TODO Auto-generated method stub
//		return  new int[] {24, 5, 16};
//	}
	
}