package controller;

import entity.Guest;
import entity.Room;
import model.RomReservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Rest {
//    controller -> service -> repository (entity)


    @GetMapping("/guests")   //localhost:8080/api/guests
    public List<Guest> getGuests(){
        return new ArrayList<>();
//        return reservationService.getGuests();
    }

    @RequestMapping(path="/reservation", method = RequestMethod.GET) //localhost:8080/api/reservation
    public List<RomReservation> getReservations(){
        return new ArrayList<>();
    }

    @GetMapping("/rooms")
    public List<Room> getRooms(){
        return new ArrayList<>();
    }
}
