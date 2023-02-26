package com.techstackx.techstackx;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

    public ResponseEntity<String> print(@RequestBody String requestBody){
        System.out.println("##### Webhook ####" + requestBody);
        return new ResponseEntity<String>(requestBody,HttpStatus.OK);
    }
    
}
