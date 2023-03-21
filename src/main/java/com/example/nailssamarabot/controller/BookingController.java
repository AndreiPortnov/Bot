package com.example.nailssamarabot.controller;

import com.example.nailssamarabot.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.telegram.telegrambots.meta.api.objects.Update;


@Controller
@RequiredArgsConstructor
public class BookingController {
    @Autowired
    private final BookingService bookingService;

    public void registerClient(Update update) {
        //валидация
        //аутентицикация
        bookingService.registerClient(update);
    }



}




