package com.codeclan.example.hw_spring_relationships.repository;

import com.codeclan.example.hw_spring_relationships.models.File;
import com.codeclan.example.hw_spring_relationships.projection.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
