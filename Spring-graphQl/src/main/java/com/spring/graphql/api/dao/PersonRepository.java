package com.spring.graphql.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.graphql.api.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

	Person findByEmail(String email);

	

}
