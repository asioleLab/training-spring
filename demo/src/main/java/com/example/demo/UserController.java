package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/language")
    public String getLanguage(@RequestHeader(value = "lang",required = false,defaultValue = "de") String lan ){
        return lan;
    }
    @GetMapping("/double")
    public ResponseEntity<String> doubleNumber(@RequestHeader(value = "num",required = false,defaultValue = "2") int num,
                                               @RequestParam(value = "flag",defaultValue = "true") Boolean flg ){
        if(flg){
            return new ResponseEntity<String>( String.format("%d * 2 = %d",num, num*2), HttpStatus.OK);
        }else{
           return new ResponseEntity<String>(String.valueOf(flg),HttpStatus.BAD_GATEWAY);
        }
    }
    @GetMapping("/listHeaders")
    public ResponseEntity<String> listAllHeaders(@RequestHeader Map<String,String> headers){
        headers.forEach((key,value)->{
            System.out.println(String.format("Header '%s' = %s", key, value));
        });
        return new ResponseEntity<String>(String.format("Listed %d headers", headers.size()), HttpStatus.OK);
    }
    @GetMapping("/multiValue")
    public ResponseEntity<String> multiValue(
            @RequestHeader MultiValueMap<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format(
                    "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
        });

        return new ResponseEntity<String>(
                String.format("Listed %d headers", headers.size()), HttpStatus.OK);
    }
    @GetMapping("/getBaseUrl")
    public ResponseEntity<String> getBaseUrl(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        String url = "http://" + host.getHostName() + ":" + host.getPort();
        return new ResponseEntity<String>(String.format("Base URL = %s", url), HttpStatus.OK);
    }
}
