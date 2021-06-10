package com.telegram.comando.impl;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.modelo.ChatFiap;
import com.telegram.utils.Constantes;
import com.telegram.utils.Utils;

/**
 * metodo padrao, sempre que o usuario digitar algo que o robo nao entende ou for uma interacao de saudacao ira cair nesse metodo. 
 */
public class ComandoDefault implements Comando {

	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();
		
		if (chat.getMessage().matches(Constantes.ENTRADA_SAUDACOES)) {
			mensagem.append(String.format("Olá %s! %s, seja bem vindo ao nosso chat", chat.getFirstName(), Utils.getSaudacao()));
			mensagem.append("\nGostaria de pedir /ajuda?");
		} else {
			mensagem.append("Desculpe! Não consegui entender. \nGostaria de pedir /ajuda?");
		}
	
		chat.setCommand(null);
		
		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}
}
