package com.egelirli.spring.mockito.mockitodemo;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBusinessImpl {
	
	@Autowired
	private DataService dataService;
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findTheGreatestFromAllData() {
		int [] data =  dataService.retrieveAllData();
		
		int max = Integer.MIN_VALUE;
		for (int i : data) {
			if(i > max) {
				max = i;
			}
		}
		
		return max;
		
	}

}
