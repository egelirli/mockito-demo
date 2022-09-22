package com.egelirli.spring.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {
	
	 @Test
	 public void  testGetItemCount(){
		 
		  List listMock =  mock(List.class);
		  when(listMock.getItemCount()).thenReturn(10);
		  
		  assertEquals(10, listMock.getItemCount());
		 
	 }

	 @Test
	 public void  testGetItemCount_MultipleReturns(){
		 
		  List listMock =  mock(List.class);
		  when(listMock.getItemCount()).thenReturn(10).thenReturn(20);
		  
		  assertEquals(10, listMock.getItemCount());
		  assertEquals(20, listMock.getItemCount());
		 
	 }
	 
	 @Test
	 public void  testGet_Specific(){
		 
		  List listMock =  mock(List.class);
		  when(listMock.getItem(0)).thenReturn("Some String");
		  
		  assertEquals("Some String", listMock.getItem(0));
		  assertEquals(null, listMock.getItem(1));
		 
	 }

	 @Test
	 public void  testGet_GenericParameters(){
		 
		  List listMock =  mock(List.class);
		  when(listMock.getItem(Mockito.anyInt())).thenReturn("Some String");
		  
		  assertEquals("Some String", listMock.getItem(0));
		  assertEquals("Some String", listMock.getItem(1));
		 
	 }

	 
}
