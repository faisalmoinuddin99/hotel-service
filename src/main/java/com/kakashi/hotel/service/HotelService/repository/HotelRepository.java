package com.kakashi.hotel.service.HotelService.repository;

import com.kakashi.hotel.service.HotelService.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
}
