package com.microservice.demoservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.microservice.demoservice.model.DemoServiceModel;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public interface DemoRepository extends MongoRepository<DemoServiceModel, String> {

    public DemoServiceModel findByFirstname(String firstName);

    public DemoServiceModel findByResourceid(String resourceid);

    public String addResource(DemoServiceModel demoServiceModel);

    }
