package com.hotel.repositories;

import com.hotel.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Component - basic one
 * @Repository - for database layer
 * @Service - biznes logic
 * @Controller - web presentation layer 'WEB'
 * @RestController - rest presentation layer 'JSON'
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
