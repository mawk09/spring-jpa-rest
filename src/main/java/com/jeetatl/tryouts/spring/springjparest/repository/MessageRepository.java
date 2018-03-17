package com.jeetatl.tryouts.spring.springjparest.repository;

import com.jeetatl.tryouts.spring.springjparest.domain.Message;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
}
