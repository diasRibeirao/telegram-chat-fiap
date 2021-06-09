package com.telegram.utils;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Properties;

public class Utils {
	private static Properties props;

	static {
		try {
			InputStream resource = Utils.class.getResourceAsStream("/config.properties");
			props = new Properties();

			props.load(resource);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getDiaSemana() {
		return Constantes.DIAS_SEMANA[LocalDateTime.now().getDayOfWeek().getValue()];
	}

	public static String getSaudacao() {
		int hora = LocalDateTime.now().getHour();

		if (hora >= 18 && hora < 24) {
			return "Boa noite";
		} else if (hora >= 12 && hora < 18) {
			return "Boa tarde";
		} else {
			return "Bom dia";
		}
	}

	public static String get(String key) {
		return props.getProperty(key);
	}
}
