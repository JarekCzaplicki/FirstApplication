package com.hotel.repositories;

import com.hotel.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
//    @Override
//    List<Room> findAll();
}
