package service;

import entity.Guest;
import entity.Reservation;
import entity.Room;
import model.RoomReservation;
import org.springframework.stereotype.Service;
import reposiotory.GuestRepository;
import reposiotory.ReservationRepository;
import reposiotory.RoomRepository;

import java.util.*;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<Room> getRooms() {
        return this.roomRepository.findAll();
    }

    public List<Guest> getGuests() {
        return this.guestRepository.findAll();
    }

    public List<RoomReservation> getReservations(Date date) {
        // get all rooms
        List<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getId(), roomReservation);
        });
        // for each room look for reservations
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(roomReservation.getFirstName());
            roomReservation.setLastName(roomReservation.getLastName());
            roomReservation.setGuestId(roomReservation.getGuestId());
        });
        List<RoomReservation> roomReservations = new ArrayList<>();
        // for each reservations ad date, Guest (first name, last name)

        for (Long id : roomReservationMap.keySet()) {
            roomReservations.add(roomReservationMap.get(id));
        }
        return roomReservations;
    }

    public void addGuest(Guest guest) {
        if (null == guest){
            throw new RuntimeException("Guest cannot be null");
        }
        this.guestRepository.save(guest);
    }

}
