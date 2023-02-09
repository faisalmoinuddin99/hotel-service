package com.kakashi.hotel.service.HotelService.service;

import com.kakashi.hotel.service.HotelService.exception.ResourceNotFoundException;
import com.kakashi.hotel.service.HotelService.model.Hotel;
import com.kakashi.hotel.service.HotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel create(Hotel hotel) {
        String hotelID = UUID.randomUUID().toString();
        hotel.setId(hotelID);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(
                () -> new ResourceNotFoundException("Hotel with given id not found")
        );
    }
}
