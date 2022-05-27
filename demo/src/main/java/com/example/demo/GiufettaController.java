package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/giufetta")
public class GiufettaController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
//  @GetMapping(path ="/hello" )
    private String giufa(@RequestParam(required = false,defaultValue = "Pippo") String name){
        return "Ciao " + name + ", io sono una giufetta";
    }
    @RequestMapping(method = RequestMethod.POST,path = "/prova",consumes = "application/json",produces="application/json")
//    @PostMapping(path = "/prova")
    private @ResponseBody BodyResponseProva prova(@RequestBody BodyRequestProva breqp){
        BodyResponseProva bresp= new BodyResponseProva();
        System.out.println(breqp.getA());
        System.out.println(breqp.getB());
        bresp.setSomma(breqp.getA()+breqp.getB());
        System.out.println(bresp.getSomma());

        return bresp;
    }

//    @PutMapping("/put")
    @RequestMapping(method = RequestMethod.PUT,path="/put", produces = "application/json")
//    private @ResponseBody BodyPut put(@RequestParam(required = false,defaultValue = "0") String id){
    private @ResponseBody BodyPut put(@RequestBody BodyPut bp){
//        BodyPut bp=new BodyPut();
        System.out.println(bp.getId());
        return bp;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/delete", produces = "application/json")
    private @ResponseBody BodyPut delete(@RequestBody BodyPut bp){
        System.out.println(bp.getId());
        return bp;
    }
    @RequestMapping(method = RequestMethod.PATCH, path = "/patch")
    private @ResponseBody BodyPut patch(@RequestBody BodyPut bp){
        System.out.println(bp.getId());
        return bp;
    }


}


