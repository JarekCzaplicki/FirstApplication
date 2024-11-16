package com.hotel.controller;

import com.hotel.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class GuestControllerWeb {
    private final ReservationService reservationService;

    public GuestControllerWeb(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/guests")
    public String guests(Model model) {
        model.addAttribute("guests", this.reservationService.getAllGuest());
        return "hotel-guests";
    }
}
