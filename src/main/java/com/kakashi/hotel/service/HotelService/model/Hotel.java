package com.kakashi.hotel.service.HotelService.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Hotels")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Hotel {


    @Id
    private String id;
    private String name ;
    private String location ;
    private String about ;
}
