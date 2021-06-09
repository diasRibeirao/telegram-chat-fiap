package com.telegram.comando;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.modelo.ChatFiap;

public interface Comando {
	
	SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception;
	
}
