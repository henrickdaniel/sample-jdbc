package com.henrick.samplejdbc.controller;

import com.henrick.samplejdbc.controller.vo.CostumerVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Test1Controller {

    @GetMapping("/")
    public ResponseEntity test(){
        List<CostumerVO> costumers = new ArrayList<>();
        costumers.add(new CostumerVO(1, "Henrick Daniel Soares"));
        final String DATABASE_URL = "CLEARDB_DATABASE_URL";

        System.out.println("ENV...: " + System.getenv(DATABASE_URL));
        System.out.println("PRO...: " + System.getProperty(DATABASE_URL));

        return new ResponseEntity<List<CostumerVO>>(costumers, HttpStatus.OK);
    }

}
