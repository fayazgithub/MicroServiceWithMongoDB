package com.microservice.demoservice.controller;

import com.microservice.demoservice.model.DemoServiceModel;
import com.microservice.demoservice.service.DemoSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceController {

    @Autowired
    DemoServiceModel demoServiceModel;

    @Autowired
    DemoSevice demoSevice;


    @GetMapping("/demoservice")
    public DemoServiceModel getDemoService(@RequestParam String resourceid) {
            demoServiceModel = demoSevice.findByResourceid(resourceid);
            return demoServiceModel;
    }

}
