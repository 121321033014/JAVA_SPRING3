package com.airlines.airlines.service;

import com.airlines.airlines.dto.AirlinesRequest;
import com.airlines.airlines.entity.Airlines;
import com.airlines.airlines.exception.AirlinesNotFoundException;
import com.airlines.airlines.repository.AirlinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AirlinesService {
    @Autowired
    private AirlinesRepo repo;

    public Airlines saveAirlines(AirlinesRequest request) {
        Airlines saveAirlines = new Airlines();

        saveAirlines.setId(0);
        saveAirlines.setAirlines_number(request.getAirlines_number());
        saveAirlines.setAirlines_name(request.getAirlines_name());
        saveAirlines.setAirlines_departuredate(request.getAirlines_departuredate());
        saveAirlines.setAirlines_destination(request.getAirlines_destination());
        saveAirlines.setAirlines_departuretime(request.getAirlines_departuretime());
        saveAirlines.setAirlines_terminalno(request.getAirlines_terminalno());
        saveAirlines.setAirlines_checkintime(request.getAirline_checkintime());
        saveAirlines.setAirlines_boardingdate(request.getAirlines_boardingdate());
        saveAirlines.setAirlines_boardingtime(request.getAirlines_boardingtime());
        saveAirlines.setAirlines_type(request.getAirline_type());
        saveAirlines.setPrice(request.getPrice());
        saveAirlines.setDetails(request.getDetails());
        return repo.save(saveAirlines);
    }
    public List<Airlines> saveListAirlines(List<AirlinesRequest> requests) {
        List<Airlines> savedAirlines = new ArrayList<>();

        for (AirlinesRequest request : requests) {
            Airlines saveAirlines = new Airlines();
            saveAirlines.setId(0);
            saveAirlines.setAirlines_number(request.getAirlines_number());
            saveAirlines.setAirlines_name(request.getAirlines_name());
            saveAirlines.setAirlines_departuredate(request.getAirlines_departuredate());
            saveAirlines.setAirlines_destination(request.getAirlines_destination());
            saveAirlines.setAirlines_departuretime(request.getAirlines_departuretime());
            saveAirlines.setAirlines_terminalno(request.getAirlines_terminalno());
            saveAirlines.setAirlines_checkintime(request.getAirline_checkintime());
            saveAirlines.setAirlines_boardingdate(request.getAirlines_boardingdate());
            saveAirlines.setAirlines_boardingtime(request.getAirlines_boardingtime());
            saveAirlines.setAirlines_type(request.getAirline_type());
            saveAirlines.setPrice(request.getPrice());
            saveAirlines.setDetails(request.getDetails());

            savedAirlines.add(repo.save(saveAirlines));
        }

        return savedAirlines;
    }


    public List<Airlines> getAirlines() {
        return repo.findAll();
    }

    public Airlines getAirline(int id) throws AirlinesNotFoundException {
        Airlines airbus=repo.findById(id);
        if(airbus!=null){
            return airbus;

        }else{
            throw new AirlinesNotFoundException("the airLines your searching is not available");
        }
    }

    public String deleteAirlinesById(int id) {
        repo.deleteById(id);
        return "Airlines details deleted with id "+id;
    }

}
