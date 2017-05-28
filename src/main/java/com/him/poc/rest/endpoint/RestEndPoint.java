package com.him.poc.rest.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.him.poc.jpa.entity.StudentEntity;
import com.him.poc.jpa.reposiory.StudentRepository;

@RestController
public class RestEndPoint {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(path = "hi",method = RequestMethod.GET)
	public String hi(){
		return "hi, how are you";
	}
	
	@RequestMapping(path = "/student/{id}",method = RequestMethod.GET)
	public StudentEntity getStudent(@PathVariable String id){
		return studentRepository.findOne(Integer.parseInt(id));
	}

}
