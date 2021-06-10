package com.telegram;

import com.telegram.bot.Bot;
import com.telegram.utils.Utils;

/**
 * 
 * Classe main do projeto 
 * 
 * utiliza o valor do telegram.bot.token pego da resources para recuperar o token de acesso ao telegram
 */
public class Main {

	public static void main(String[] args) {
		// t.me/JavaGroup2Bot
		Bot bot = new Bot(Utils.get("telegram.bot.token"));
		bot.executar();
	}

}