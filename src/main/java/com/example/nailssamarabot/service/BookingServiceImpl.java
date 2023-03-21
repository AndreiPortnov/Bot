package com.example.nailssamarabot.service;

import com.example.nailssamarabot.entity.ClientEntity;
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
            Long chatId = update.getMessage().getChatId();//добавлять самому или генерировать на стороне таблицы?
            String firstName = update.getMessage().getChat().getFirstName();
            String phoneNumber = update.getMessage().getContact().getPhoneNumber();

            ClientEntity clientEntity = new ClientEntity();
            clientEntity.setName(firstName);
            clientEntity.setPhoneNumber(phoneNumber);

            clientRepository.save(clientEntity);


            //объект entity туда все поля и save();

        }
    }
}

