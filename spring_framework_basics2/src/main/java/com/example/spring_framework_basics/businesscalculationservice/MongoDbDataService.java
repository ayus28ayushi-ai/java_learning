package com.example.spring_framework_basics.businesscalculationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//STEREOTYPE ANNOTATIONS. specialization of @Component which does the same job, just improves the readability
@Primary
public class MongoDbDataService implements DataService {
	@Override
	public int[] retrieveData() {
		 return new int[] {11,22,33,44,55};
}

}

