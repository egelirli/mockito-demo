package com.egelirli.spring.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author egelirli
 *
 */
class SomeBusinessTest {

	@Test
	void testFindTheGreatestFromAllData() {
		SomeBusinessImpl busImpl = new SomeBusinessImpl(new DataSericeStub());
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(24, res);
	}
	
}


class DataSericeStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return  new int[] {24, 5, 16};
	}
	
}