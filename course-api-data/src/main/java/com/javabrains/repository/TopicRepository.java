package com.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import com.javabrains.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{
	
	

}
