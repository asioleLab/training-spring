package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/giufetta")
public class GiufettaController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    private String giufa(@RequestParam(required = false,defaultValue = "Pippo") String name){
        return "Ciao " + name + ", io sono una giufetta";
    }
    @RequestMapping(method = RequestMethod.POST,path = "/prova")
    @ResponseBody
    private BodyRequestProva prova(@RequestBody BodyRequestProva brp){
        System.out.println(brp.getA());
        System.out.println(brp.getB());
        brp.setSomma(brp.getA()+brp.getB());
        System.out.println(brp.getSomma());

        return brp;
    }
}


