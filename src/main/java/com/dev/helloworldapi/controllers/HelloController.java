package com.dev.helloworldapi.controllers;

import com.dev.helloworldapi.models.Address;
import com.dev.helloworldapi.models.HelloResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/{name}")
    public HelloResponse helloName(@PathVariable("name") String name) {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setMessage("Hello1 " + name);
        helloResponse.setResponseCode(1);
        helloResponse.setResponseMessage("Success");
        return helloResponse;
    }


    @GetMapping
    public HelloResponse helloQuery(@RequestParam("name") String name) {
        HelloResponse helloResponse = new HelloResponse();

        if (name.equals("keerthi")) {
            helloResponse.setMessage("Hello " + name);
            helloResponse.setResponseCode(1);
            helloResponse.setResponseMessage("Success");
        } else {
            helloResponse.setResponseCode(0);
            helloResponse.setResponseMessage("Failed");
        }
        return helloResponse;
    }
//   @GetMapping
//    public Address helloAddress(){
//        Address address= new Address();
//       address.setApt(123);
//      address.setState("Georgia");
//     return address;
//  }

}
