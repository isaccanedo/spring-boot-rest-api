package br.com.isaccanedo.crm.restfulwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaccanedo.crm.restfulwebservices.model.BasicAuthentication;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public BasicAuthentication basicAuth() {
        return new BasicAuthentication("You are authenticated!");
    }
}
