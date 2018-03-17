package com.jeetatl.tryouts.spring.springjparest.repository;

import com.jeetatl.tryouts.spring.springjparest.domain.AMessage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "messages", path = "aMessages")
public interface AMessageRepository extends PagingAndSortingRepository<AMessage, Long>{
}
