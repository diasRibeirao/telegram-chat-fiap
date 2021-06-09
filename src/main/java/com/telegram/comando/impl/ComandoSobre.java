package com.telegram.comando.impl;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.modelo.ChatFiap;

public class ComandoSobre implements Comando {

	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("MBA EM FULL STACK DEVELOPMENT - DESIGN, ENGINEERING & DEPLOYMENT\n");
		mensagem.append("JAVA PLATFORM - RAFAEL TSUJI MATSUYAMA\n");
		mensagem.append("Telegram Bot: Avaliação Total da Disciplina");
		
		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}

}
