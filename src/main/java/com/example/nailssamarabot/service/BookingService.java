package com.example.nailssamarabot.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface BookingService {
    void registerClient(Update update);
}
