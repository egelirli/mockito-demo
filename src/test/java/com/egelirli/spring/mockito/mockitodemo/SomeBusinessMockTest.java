
package com.egelirli.spring.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

/**
 * @author egelirli
 *
 */
class SomeBusinessMockTest {
	
	@Test
	void testFindTheGreatestFromAllData() {
		DataService  dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 5, 16});
		
		SomeBusinessImpl busImpl = new SomeBusinessImpl(dataServiceMock);
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(24, res);
	}

	@Test
	void testFindTheGreatestFromAllData_ForOneValu() {
		DataService  dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		SomeBusinessImpl busImpl = new SomeBusinessImpl(dataServiceMock);
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(15, res);
	}	
}

//class DataServiceStub implements DataService {
//
//	@Override
//	public int[] retrieveAllData() {
//		// TODO Auto-generated method stub
//		return  new int[] {24, 5, 16};
//	}
//	
//}