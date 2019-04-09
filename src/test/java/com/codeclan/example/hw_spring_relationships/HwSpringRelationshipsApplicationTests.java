package com.codeclan.example.hw_spring_relationships;

import com.codeclan.example.hw_spring_relationships.models.User;
import com.codeclan.example.hw_spring_relationships.repository.FileRepository;
import com.codeclan.example.hw_spring_relationships.repository.FolderRepository;
import com.codeclan.example.hw_spring_relationships.repository.UserRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwSpringRelationshipsApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRespository userRespository;



	@Test
	public void contextLoads() {
	}

}
