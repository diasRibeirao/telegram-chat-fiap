package com.telegram.comando.impl;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telegram.comando.Comando;
import com.telegram.modelo.ChatFiap;
import com.telegram.utils.Constantes;
import com.telegram.utils.Utils;

public class ComandoClimatempo implements Comando {

	@Override
	public SendResponse processar(TelegramBot bot, ChatFiap chat) throws Exception {
		StringBuilder mensagem = new StringBuilder();

		try {
			String url = Constantes.CLIMATEMPO_URL + Utils.get("climatempo.token");
			ResponseEntity<String> response = new RestTemplate().exchange(url, HttpMethod.GET, null, String.class);
			JSONObject jonResponse = new JSONObject(response.getBody());

			if (response.getStatusCode() == HttpStatus.OK) {
				mensagem.append(jonResponse.get("name")).append(" - ").append(jonResponse.get("state")).append("\n\n");

				JSONArray array = jonResponse.getJSONArray("data");

				JSONObject jsonHoje = new JSONObject(array.getJSONObject(0).get("temperature").toString());

				mensagem.append("Hoje").append(" - ").append(array.getJSONObject(0).get("date_br")).append("\n");
				mensagem.append("Temperatura: min. ").append(jsonHoje.get("min")).append(" º C   ");
				mensagem.append("máx. ").append(jsonHoje.get("max")).append(" °C \n\n");

				JSONObject jsonAmanha = new JSONObject(array.getJSONObject(1).get("temperature").toString());

				mensagem.append("Amanhã").append(" - ").append(array.getJSONObject(1).get("date_br")).append("\n");
				mensagem.append("Temperatura: min. ").append(jsonAmanha.get("min")).append(" °C   ");
				mensagem.append("máx. ").append(jsonAmanha.get("max")).append(" °C \n");
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			mensagem.append("Não é possível acessar o climatempo.\nTente novamente mais tarde.");
		}
		
		chat.setCommand(null);

		return bot.execute(new SendMessage(chat.getChatId(), mensagem.toString()));
	}

}
