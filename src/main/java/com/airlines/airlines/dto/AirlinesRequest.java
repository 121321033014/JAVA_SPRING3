package com.airlines.airlines.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class AirlinesRequest {
    @NotNull(message ="Airlinescode should be blank")
    public String airlines_number;
    @NotBlank
    public String airlines_name;
    @NotBlank
    public String airlines_departuredate;
    @NotBlank
    public String airlines_boardingtime;
    @NotBlank
    public String airline_type;
    @NotBlank
    public String airline_checkintime;
    @NotBlank
    public String airlines_boardingdate;
    @NotBlank
    public String  airlines_destination;
    @NotBlank
    public String airlines_departuretime;
    @NotBlank
    public String airlines_terminalno;
    @Min(2500)
    @Max(10000)
    public Double price;

    public AirlinesRequest(){

    }
    public AirlinesRequest(String airlines_number, String airlines_name, String airlines_departuredate, String airlines_boardingtime, String airline_type, String airline_checkintime, String airlines_boardingdate, String airlines_destination, String airlines_departuretime, String airlines_terminalno, Double price, String details) {
        this.airlines_number = airlines_number;
        this.airlines_name = airlines_name;
        this.airlines_departuredate = airlines_departuredate;
        this.airlines_boardingtime = airlines_boardingtime;
        this.airline_type = airline_type;
        this.airline_checkintime = airline_checkintime;
        this.airlines_boardingdate = airlines_boardingdate;
        this.airlines_destination = airlines_destination;
        this.airlines_departuretime = airlines_departuretime;
        this.airlines_terminalno = airlines_terminalno;
        this.price = price;
        this.details = details;
    }

    @NotBlank
    public String details;

    public String getAirlines_number() {
        return airlines_number;
    }

    public void setAirlines_number(String airlines_number) {
        this.airlines_number = airlines_number;
    }

    public String getAirlines_name() {
        return airlines_name;
    }

    public void setAirlines_name(String airlines_name) {
        this.airlines_name = airlines_name;
    }

    public String getAirlines_departuredate() {
        return airlines_departuredate;
    }

    public void setAirlines_departuredate(String airlines_departuredate) {
        this.airlines_departuredate = airlines_departuredate;
    }

    public String getAirlines_boardingtime() {
        return airlines_boardingtime;
    }

    public void setAirlines_boardingtime(String airlines_boardingtime) {
        this.airlines_boardingtime = airlines_boardingtime;
    }

    public String getAirline_type() {
        return airline_type;
    }

    public void setAirline_type(String airline_type) {
        this.airline_type = airline_type;
    }

    public String getAirline_checkintime() {
        return airline_checkintime;
    }

    public void setAirline_checkintime(String airline_checkintime) {
        this.airline_checkintime = airline_checkintime;
    }

    public String getAirlines_boardingdate() {
        return airlines_boardingdate;
    }

    public void setAirlines_boardingdate(String airlines_boardingdate) {
        this.airlines_boardingdate = airlines_boardingdate;
    }

    public String getAirlines_destination() {
        return airlines_destination;
    }

    public void setAirlines_destination(String airlines_destination) {
        this.airlines_destination = airlines_destination;
    }

    public String getAirlines_departuretime() {
        return airlines_departuretime;
    }

    public void setAirlines_departuretime(String airlines_departuretime) {
        this.airlines_departuretime = airlines_departuretime;
    }

    public String getAirlines_terminalno() {
        return airlines_terminalno;
    }

    public void setAirlines_terminalno(String airlines_terminalno) {
        this.airlines_terminalno = airlines_terminalno;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
