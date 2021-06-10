package com.telegram;

import com.telegram.bot.Bot;
import com.telegram.utils.Utils;
/**
 * 
 * metodo main, recebe o parametro do token vindo do resources
 *
 */
public class Main {

	public static void main(String[] args) {
		// t.me/JavaGroup2Bot
		Bot bot = new Bot(Utils.get("telegram.bot.token"));
		bot.executar();
	}

}