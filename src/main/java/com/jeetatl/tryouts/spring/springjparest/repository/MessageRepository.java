package com.jeetatl.tryouts.spring.springjparest.repository;

import com.jeetatl.tryouts.spring.springjparest.domain.Message;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "messages", itemResourceRel = "message", path = "messages")
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
}
