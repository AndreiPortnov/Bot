package com.example.nailssamarabot.service;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class Buttons {
    private static final InlineKeyboardButton MAKE_AN_APPOINTMENT_BUTTON = new InlineKeyboardButton("Start");
    private static final InlineKeyboardButton LEARN_ABOUT_MEETING_BUTTON = new InlineKeyboardButton("Help");
    private static final InlineKeyboardButton CANCEL_APPOINTMENT_BUTTON = new InlineKeyboardButton("Cancel");

    public static InlineKeyboardMarkup inLineMarkup() {
        MAKE_AN_APPOINTMENT_BUTTON.setCallbackData("Записаться на услугу");
        LEARN_ABOUT_MEETING_BUTTON.setCallbackData("Узнать детали записи");
        CANCEL_APPOINTMENT_BUTTON.setCallbackData("Отменить услугу");

        List<InlineKeyboardButton> rowInLine = List.of(MAKE_AN_APPOINTMENT_BUTTON, LEARN_ABOUT_MEETING_BUTTON, CANCEL_APPOINTMENT_BUTTON);
        List<List<InlineKeyboardButton>> rowsInLine = List.of(rowInLine);

        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        markupInLine.setKeyboard(rowsInLine);

        return markupInLine;
    }

}
