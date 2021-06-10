package com.telegram.comando.impl;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.comando.ComandoEnum;
import com.telegram.modelo.ChatFiap;
import com.telegram.utils.Utils;

public class ComandoEmail implements Comando {

	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();

		if (chat.getCommand() != null && chat.getCommand().equals(ComandoEnum.VALIDAR_EMAIL.getCodigo())) {
			if (Utils.validarEmail(chat.getMessage())) {
				mensagem.append("Este é um e-mail válido!");
			} else {
				mensagem.append("Este é um e-mail inválido!");
			}
			
			chat.setCommand(null);
		} else {
			mensagem.append("Por favor, informe um e-mail");
			chat.setCommand(ComandoEnum.VALIDAR_EMAIL.getCodigo());
		}

		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}

}
