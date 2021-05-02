package com.henrick.samplejdbc.controller;

import com.henrick.samplejdbc.connection.JDBCConnection;
import com.henrick.samplejdbc.controller.vo.CostumerVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SampleController {

    @GetMapping("/v1")
    public ResponseEntity test() throws Exception {
        List<CostumerVO> costumers = new JDBCConnection().load();
        return new ResponseEntity<List<CostumerVO>>(costumers, HttpStatus.OK);
    }

    @GetMapping("/v2")
    public ResponseEntity testWithTry() throws Exception {
        List<CostumerVO> costumers = new JDBCConnection().load();
        return new ResponseEntity<List<CostumerVO>>(costumers, HttpStatus.OK);
    }

}
