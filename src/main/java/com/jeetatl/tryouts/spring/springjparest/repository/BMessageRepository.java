package com.jeetatl.tryouts.spring.springjparest.repository;

import com.jeetatl.tryouts.spring.springjparest.domain.BMessage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "messages", itemResourceRel = "aMessages")
public interface BMessageRepository extends PagingAndSortingRepository<BMessage, Long> {
}
