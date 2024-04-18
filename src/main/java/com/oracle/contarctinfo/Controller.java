package com.oracle.contarctinfo;

import com.oracle.contarctinfo.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RestController
@RequestMapping("/contractinfo")
public class Controller {

    @Autowired
    ReportService reportService;

    @GetMapping(value = "healthcheck")
    public @ResponseBody String healthCheck(){
        return "UP";
    }
    @GetMapping(value = "/retrivecontractinfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> retriveContractInfo(@RequestParam(required = true) String input){

        reportService.processInput(input);
        return  reportService.generateReport();

    }
}
