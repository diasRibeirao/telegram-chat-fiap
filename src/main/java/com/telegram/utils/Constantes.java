package com.telegram.utils;

public class Constantes {
	
	public static final String CLIMATEMPO_URL = "http://apiadvisor.climatempo.com.br/api/v1/forecast/locale/3477/days/15?token=";

	// Dias da semana
	public static String[] DIAS_SEMANA = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "S�bado"};
	
	// Entrada
	public static final String ENTRADA_SAUDACOES = "o+(l(a|�)|i)|h+(i|ello)|bo+(a|m)+\\s+(dia|tarde|noite)";
	public static final String REGEX_EMAIL = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	
}
