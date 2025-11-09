package com.brainbeast.cruddemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection="student")
public class Student {

	@Id
	private String id;
	private String name;
	private String email;
	
}
