package com.sls.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface DomainRepository extends MongoRepository<Tree, Long>{

	Tree findFirstByDomain(String domain);
	
	@Query("{Tree:'?0'}")
	Tree findCustomByDomain(String domain);
	
}
