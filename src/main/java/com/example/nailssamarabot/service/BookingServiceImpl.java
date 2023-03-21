package com.example.nailssamarabot.service;

import com.example.nailssamarabot.config.BotConfig;
import com.example.nailssamarabot.entity.ClientEntity;
import com.example.nailssamarabot.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;


@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    //не получается через @Autowired
    //когда нам нужен синглтон


    private ClientRepository clientRepository;

    @Override
    public void registerClient(Update update) {
        if (clientRepository.findById(update.getMessage().getChatId()).isEmpty()) {
            Long chatId = update.getMessage().getChatId();//добавлять самому или генерировать на стороне таблицы? B что это за Id?
            String firstName = update.getMessage().getChat().getFirstName();
            String phoneNumber = update.getMessage().getContact().getPhoneNumber();

            ClientEntity clientEntity = new ClientEntity();
            clientEntity.setName(firstName);
            clientEntity.setPhoneNumber(phoneNumber);

            clientRepository.save(clientEntity);

        } else {
            clientRepository.getClientEntityByPhoneNumber(update.getMessage().getContact().getPhoneNumber());
        }

    }

    private void startBotCommand(Long chatId, String userName) {
        String answer = "Здравствуйте " + userName + ", выберите мастера";
        sendMessage(chatId, answer);

        //далее кнопки с мастерами
    }

    private void sendMessage(Long chatId, String message) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);


//        try {
//
//            execute(sendMessage);??????????????????????????????????????????????????
//        } catch (TelegramApiException e) {
//            throw new RuntimeException(e);
//        }

    }
}

