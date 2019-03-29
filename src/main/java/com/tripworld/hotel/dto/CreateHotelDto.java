package com.tripworld.hotel.dto;

import com.tripworld.hotel.domain.Room;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class CreateHotelDto {

    @NotBlank
    private String hotelName;
    @NotBlank
    private String description;
    @NotBlank
    private String cityCode;
    //can be empty
    private List<Room> rooms;




}
