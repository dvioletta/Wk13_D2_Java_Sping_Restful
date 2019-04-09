package com.codeclan.example.hw_spring_relationships.components;

import com.codeclan.example.hw_spring_relationships.models.File;
import com.codeclan.example.hw_spring_relationships.models.Folder;
import com.codeclan.example.hw_spring_relationships.models.User;
import com.codeclan.example.hw_spring_relationships.repository.FileRepository;
import com.codeclan.example.hw_spring_relationships.repository.FolderRepository;
import com.codeclan.example.hw_spring_relationships.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRespository userRespository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args){

        User john = new User("John Smith");
        userRespository.save(john);

        User sarah = new User("Sarah Jane");
        userRespository.save(sarah);

        Folder unity = new Folder("unity", sarah);
        folderRepository.save(unity);

        Folder documents = new Folder("documents", john);
        folderRepository.save(documents);

        Folder games = new Folder("games", sarah);
        folderRepository.save(games);

        Folder misc = new Folder("misc", sarah);
        folderRepository.save(misc);

        File file1 = new File("Temp","doc",31, documents);
        fileRepository.save(file1);

        File file2 = new File("Mine Sweeper","exe",40, games);
        fileRepository.save(file2);

        File file3 = new File("Measurements","xml",65, misc);
        fileRepository.save(file3);

        File file4 = new File("Move List","doc",20, misc);
        fileRepository.save(file4);

    }
}
