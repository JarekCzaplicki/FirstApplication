package com.hotel.repositories;

import com.hotel.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByRoomIdAndReservationDate(Long roomId, Date reservationDate);
}
