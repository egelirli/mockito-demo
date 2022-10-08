package com.egelirli.spring.mockito.mockitodemo;

import org.springframework.stereotype.Component;

@Component
public interface DataService {

	int[] retrieveAllData();

}
