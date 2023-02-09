package com.kakashi.hotel.service.HotelService.service;

import com.kakashi.hotel.service.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {

    // create
    Hotel create(Hotel hotel) ;
    // get all
    List<Hotel> getAllHotel() ;
    // single get
    Hotel getHotel(String hotelId) ;
}
