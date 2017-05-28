package com.him.poc.jpa.reposiory;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<com.him.poc.jpa.entity.StudentEntity, Integer> {

}
