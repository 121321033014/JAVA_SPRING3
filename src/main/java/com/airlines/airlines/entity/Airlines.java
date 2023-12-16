package com.airlines.airlines.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

@Entity
@Table(name="AirlinesList")
public class Airlines {
    @Id
    @GeneratedValue
    public int id;
    public String airlines_number;
    public String airlines_name;
    public String airlines_departuredate;
    public String airlines_boardingtime;
    public String airlines_type;
    public String airlines_checkintime;
    public String airlines_boardingdate;
    public String  airlines_destination;
    public String airlines_departuretime;
    public String airlines_terminalno;
    public Double price;
    public String details;

    public Airlines(int id, String airlines_number, String airlines_name, String airlines_departuredate, String airlines_boardingtime, String airlines_type, String airlines_checkintime, String airlines_boardingdate, String airlines_destination, String airlines_departuretime, String airlines_terminalno, Double price, String details) {
        this.id = id;
        this.airlines_number = airlines_number;
        this.airlines_name = airlines_name;
        this.airlines_departuredate = airlines_departuredate;
        this.airlines_boardingtime = airlines_boardingtime;
        this.airlines_type = airlines_type;
        this.airlines_checkintime = airlines_checkintime;
        this.airlines_boardingdate = airlines_boardingdate;
        this.airlines_destination = airlines_destination;
        this.airlines_departuretime = airlines_departuretime;
        this.airlines_terminalno = airlines_terminalno;
        this.price = price;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAirlines_type() {
        return airlines_type;
    }

    public void setAirlines_type(String airlines_type) {
        this.airlines_type = airlines_type;
    }

    public String getAirlines_checkintime() {
        return airlines_checkintime;
    }

    public void setAirlines_checkintime(String airlines_checkintime) {
        this.airlines_checkintime = airlines_checkintime;
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

    public Airlines(){

    }

}
