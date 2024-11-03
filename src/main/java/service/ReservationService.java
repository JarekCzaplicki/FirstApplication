package service;

import entity.Guest;
import entity.Room;
import model.RomReservation;
import org.springframework.stereotype.Service;
import reposiotory.GuestRepository;
import reposiotory.RoomRepository;

import java.util.List;

@Service
public class ReservationService {
    // roomRepository
    // guestRepository
    // Reservation

    private final GuestRepository guestRepository; // beans
    private final RoomRepository roomRepository;

    public ReservationService(GuestRepository guestRepository, RoomRepository roomRepository) {
        this.guestRepository = guestRepository;
        this.roomRepository = roomRepository;
    }


    public List<Room> getRooms(){
        List<Room> rooms = this.roomRepository.findAll();
        return rooms;
    }

    public List<Guest> getGuests() {
        return null;
    }

    public List<RomReservation> getReservations() {
        return null;
    }
    public void addGuest(Guest guest){

    }

}
