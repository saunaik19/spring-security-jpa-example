package com.saurabh.resources;

import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeResource {

    public String home(){
        return "<h1>Welcome Visitor</h1>";
    }

    public String user(){
        return "<h1>Welcome User</h1>";
    }
    public String admin(){
        return "<h1>Welcome Admin</h1>";
    }

}
