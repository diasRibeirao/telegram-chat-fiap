package com.telegram.comando.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.modelo.ChatFiap;
import com.telegram.utils.Utils;

public class ComandoEmail implements Comando {

	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("caionta@gmail.com");
		
		if (matcher.matches()) {
			mensagem.append("seu e-mail é real");

		}
		else {
			mensagem.append("seu e-mail é falso =(");

		}
		
		
	
		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}

}
