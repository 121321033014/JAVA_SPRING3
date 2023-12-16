package com.airlines.airlines.controller;

import com.airlines.airlines.dto.AirlinesRequest;
import com.airlines.airlines.entity.Airlines;
import com.airlines.airlines.exception.AirlinesNotFoundException;
import com.airlines.airlines.service.AirlinesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Airlines")
public class AirlinesController {
    @Autowired
    private AirlinesService service;

    @PostMapping("/schedule")
    public ResponseEntity<Airlines> saveAirlines(@RequestBody @Valid AirlinesRequest request){

        return new ResponseEntity<>(service.saveAirlines(request), HttpStatus.CREATED);
    }
    @PostMapping("/schedules")
    public ResponseEntity<List<Airlines>> saveListAirlines(@RequestBody @Valid List<AirlinesRequest> requests) {
        List<Airlines> savedAirlines = service.saveListAirlines(requests);

        // Check if any airlines were saved
        if (savedAirlines != null && !savedAirlines.isEmpty()) {
            return new ResponseEntity<>(savedAirlines, HttpStatus.CREATED);
        } else {
            // Handle the case where no airlines were saved
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fetchall")
    public ResponseEntity<List<Airlines>>getallAirlines(){

        return ResponseEntity.ok(service.getAirlines());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Airlines>getAirlinesbyID(@PathVariable int id)throws AirlinesNotFoundException {

        return ResponseEntity.ok(service.getAirline(id));
    }
    @DeleteMapping("/Airlines/{id}")
    public String deleteAirlinesById(int id)  {
        return service.deleteAirlinesById(id);
    }

}
