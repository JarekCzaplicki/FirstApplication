package controller;

import entity.Guest;
import entity.Room;
import model.RoomReservation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.ReservationService;
import util.DateUtil;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Rest {
    private final ReservationService reservationService;
    private final DateUtil dateUtil;

    public Rest(ReservationService reservationService, DateUtil dateUtil) {
        this.reservationService = reservationService;
        this.dateUtil = dateUtil;
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
    public List<RoomReservation> getReservations(@RequestParam(value="date"
            , required = false) String dateString){
        Date date = dateUtil.createDateFrom(dateString);
        return this.reservationService.getReservations(date);
    }

    @GetMapping("/rooms")  //localhost:8080/api/rooms
    public List<Room> getRooms(){
        return this.reservationService.getRooms();
    }
}
