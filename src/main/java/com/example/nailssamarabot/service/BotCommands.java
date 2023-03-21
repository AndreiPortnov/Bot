package com.example.nailssamarabot.service;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("/start", "Записаться на услугу"),
            new BotCommand("/help", "Узнать детали записи"),
            new BotCommand("/cancel", "Отменить услугу")
    );

}
