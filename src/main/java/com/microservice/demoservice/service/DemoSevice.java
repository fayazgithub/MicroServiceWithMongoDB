package com.microservice.demoservice.service;

import com.microservice.demoservice.model.DemoServiceModel;
import com.microservice.demoservice.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DemoSevice {

    @Autowired
    DemoServiceModel demoServiceModel;

    @Autowired
    DemoRepository demoRepository;

    public DemoServiceModel getDemoService(String firstname){

        //demoServiceDao.getDemoServicebyFirstName();
        demoServiceModel = demoRepository.findByFirstname(firstname);

        return demoServiceModel;
    }

    public DemoServiceModel findByResourceid(String resourceid){

        //demoServiceDao.getDemoService();
        demoServiceModel = demoRepository.findByResourceid(resourceid);

        return demoServiceModel;
    }

    @PostMapping("/addResource")
    public String addResource(@RequestBody DemoServiceModel addResource){
        demoRepository.save(addResource);

        return "Added Resource Successfully";
    }
}
