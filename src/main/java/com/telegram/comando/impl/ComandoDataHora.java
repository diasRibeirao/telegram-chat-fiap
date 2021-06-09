package com.telegram.comando.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.modelo.ChatFiap;
import com.telegram.utils.Utils;

public class ComandoDataHora implements Comando {

	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();
		mensagem.append(Utils.getDiaSemana());
		mensagem.append(", ");
		mensagem.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}

}
