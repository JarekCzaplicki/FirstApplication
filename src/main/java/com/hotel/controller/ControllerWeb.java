package com.hotel.controller;

import com.hotel.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/web")
public class ControllerWeb {
    private final ReservationService reservationService;

    public ControllerWeb(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/guests")
    public String guests(Model model) {
        model.addAttribute("guests", this.reservationService.getAllGuest());
        return "hotel-guests";
    }

    @GetMapping("/reservations")
    public String reservations(Model model) {
        model.addAttribute("reservations", this.reservationService.getReservationForDate(new Date()));
        return "hotel-reservations";
    }
}
