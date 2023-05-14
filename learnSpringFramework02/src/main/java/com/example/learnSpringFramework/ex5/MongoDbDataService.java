package com.example.learnSpringFramework.ex5;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MongoDbDataService implements DataService {
	
	public int[] retrieveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}
}
