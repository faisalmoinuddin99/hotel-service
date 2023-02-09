package com.kakashi.hotel.service.HotelService.controller;

import com.kakashi.hotel.service.HotelService.model.Hotel;
import com.kakashi.hotel.service.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    // create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(hotelService.create(hotel));
    }

    // get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelDetails(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.FOUND).body(hotelService.getHotel(hotelId));
    }

    // get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel() {
        return ResponseEntity.status(HttpStatus.FOUND).body(hotelService.getAllHotel());
    }
}
