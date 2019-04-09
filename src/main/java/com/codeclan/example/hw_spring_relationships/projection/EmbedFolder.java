package com.codeclan.example.hw_spring_relationships.projection;


import com.codeclan.example.hw_spring_relationships.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedfolder", types = Folder.class)
public interface EmbedFolder {
    String getName();
}
