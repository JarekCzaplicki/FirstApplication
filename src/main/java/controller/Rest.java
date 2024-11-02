package controller;

import entity.Guest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Rest {
//    controller -> service -> repository (entity)

    // guest

    public List<Guest> getGuest(){
        return new ArrayList<>();
//        return reservationService.getGuest();
    }
    // rooms
    // reservations
}
