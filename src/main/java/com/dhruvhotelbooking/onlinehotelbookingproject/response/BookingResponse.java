package com.dhruvhotelbooking.onlinehotelbookingproject.response;

import com.dhruvhotelbooking.onlinehotelbookingproject.model.Room;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingResponse {
    private Long bookingId;
    private LocalDate checkedInDate;
    private LocalDate checkedOutDate;
    private String guestFullName;
    private String guestEmail;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;
    private RoomResponse room;

    public BookingResponse(Long bookingId, LocalDate checkedInDate, LocalDate checkedOutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }


}
