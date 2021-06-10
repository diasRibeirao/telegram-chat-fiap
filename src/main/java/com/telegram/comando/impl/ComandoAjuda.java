package com.telegram.comando.impl;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.comando.ComandoEnum;
import com.telegram.modelo.ChatFiap;

/**
 * 
 * classe responsavel por processar a mensagem do usuario e retornar a lista de comandos possiveis. 
 *
 */
public class ComandoAjuda implements Comando {

	
	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("Este chat cont�m os seguintes comandos dispon�veis:");
		mensagem.append(ComandoEnum.exibirComandos());

		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}

}
