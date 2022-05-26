package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/giufetta")
public class GiufettaController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
//  @GetMapping(path ="/hello" )
    private String giufa(@RequestParam(required = false,defaultValue = "Pippo") String name){
        return "Ciao " + name + ", io sono una giufetta";
    }
    @RequestMapping(method = RequestMethod.POST,path = "/prova")
    @ResponseBody
    private BodyResponseProva prova(@RequestBody BodyRequestProva breqp){
        BodyResponseProva bresp= new BodyResponseProva();
        System.out.println(breqp.getA());
        System.out.println(breqp.getB());
        bresp.setSomma(breqp.getA()+breqp.getB());
        System.out.println(bresp.getSomma());

        return bresp;
    }
}


