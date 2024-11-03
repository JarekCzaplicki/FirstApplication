package controller;

import entity.Guest;
import entity.Room;
import model.RomReservation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Rest {
//    controller -> service -> repository (entity)
    // Rest rest = new Rest();
    private final ReservationService reservationService;

    public Rest(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/guests") //localhost:8080/api/guests
    @ResponseStatus(HttpStatus.CREATED) // 201 -> CREATED
    public void addGuest(@RequestBody Guest guest){
        this.reservationService.addGuest(guest);
    }

    @GetMapping("/guests")   //localhost:8080/api/guests   200 -> OK
    public List<Guest> getGuests(){
       return this.reservationService.getGuests();
    }

    @RequestMapping(path="/reservations", method = RequestMethod.GET) //localhost:8080/api/reservation
    public List<RomReservation> getReservations(){
        return this.reservationService.getReservations();
    }

    @GetMapping("/rooms")  //localhost:8080/api/rooms
    public List<Room> getRooms(){
        List<Room> rooms = this.reservationService.getRooms();
        return rooms;
    }

}
