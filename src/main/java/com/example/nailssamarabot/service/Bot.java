package com.example.nailssamarabot.service;

import com.example.nailssamarabot.config.BotConfig;
import com.example.nailssamarabot.controller.BookingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;




//изучить реализации бота()webhook и longPol
//bot - ui
@Component
public class Bot extends TelegramLongPollingBot implements BotCommands {

    private final BotConfig botConfig;

    @Autowired
    private BookingController bookingController;

    public Bot(BotConfig botConfig) {
        this.botConfig = botConfig;
        try {
            this.execute(new SetMyCommands(LIST_OF_COMMANDS, new BotCommandScopeDefault(), null));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
            //log.error(e.getMessage());
        }
    }


    @Override
    public void onUpdateReceived(@NonNull Update update) {



        if (update.hasMessage() && update.getMessage().hasText()) {

            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String clientName = update.getMessage().getChat().getFirstName();

            switch (message) {
                case "/start":
                    bookingController.registerClient(update);
                    startBotCommand(chatId, clientName);
                    break;
                case "/help":

                    break;
                case "/cancel":

                    break;
            }
        }

    }

    private void startBotCommand(Long chatId, String userName) {
        String answer = "Hello piggy " + userName;
        sendMessage(chatId, answer);
    }

    private void sendMessage(Long chatId, String message) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {

            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String getBotUsername() {
        return botConfig.getBotName();
    }

    public String getBotToken() {
        return botConfig.getBotToken();
    }


}


