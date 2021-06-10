package com.telegram.comando;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.modelo.ChatFiap;

/**
 * 
 * interface para criacao do metodo que recebe o bot e o chat para responder
 * @author marcosantos
 *
 */
public interface Comando {
	
	SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception;
	
}
