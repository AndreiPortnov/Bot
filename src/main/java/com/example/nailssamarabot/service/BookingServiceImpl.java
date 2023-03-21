package com.example.nailssamarabot.service;

import com.example.nailssamarabot.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService{

    //не получается через @Autowired
    //когда нам нужен синглтон


    private ClientRepository clientRepository;

    public void registerClient(Update update) {
        if(clientRepository.findById(update.getMessage().getChatId()).isEmpty()) {
            Long chatId = update.getMessage().getChatId();
            update.getMessage().


            //объект entity туда все поля и save();

        }
    }
}
//метод регистрации пользователя
