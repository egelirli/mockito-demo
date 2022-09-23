
package com.egelirli.spring.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author egelirli
 *
 */
/**
 * @author egelirli
 *
 */
@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl busImpl;
	
	@Test
	void testFindTheGreatestFromAllData() {
		//DataService  dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 5, 16});
		
		//SomeBusinessImpl busImpl = new SomeBusinessImpl(dataServiceMock);
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(24, res);
	}

	@Test
	void testFindTheGreatestFromAllData_ForOneValu() {
		//DataService  dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		//SomeBusinessImpl busImpl = new SomeBusinessImpl(dataServiceMock);
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(15, res);
	}	
	

	@Test
	void testFindTheGreatestFromAllData_NoValuues() {
		//DataService  dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		
		//SomeBusinessImpl busImpl = new SomeBusinessImpl(dataServiceMock);
		int res = busImpl.findTheGreatestFromAllData();
		assertEquals(Integer.MIN_VALUE,res);
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