package com.telegram.utils;

/**
 * classe resonsavel pelas constantes do projeto, URL da clima tempo, regex de saudacao e dias da semana. 
 *
 */
public class Constantes {
	
	public static final String CLIMATEMPO_URL = "http://apiadvisor.climatempo.com.br/api/v1/forecast/locale/3477/days/15?token=";

	// Dias da semana
	public static String[] DIAS_SEMANA = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
	
	// Entrada
	public static final String ENTRADA_SAUDACOES = "o+(l(a|á|i)|h+(i|ello)|bo+(a|m)+\\s+(dia|tarde|noite)";
	
}
