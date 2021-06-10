package com.telegram.comando;

import com.telegram.comando.impl.ComandoAjuda;
import com.telegram.comando.impl.ComandoClimatempo;
import com.telegram.comando.impl.ComandoDataHora;
import com.telegram.comando.impl.ComandoDefault;
import com.telegram.comando.impl.ComandoEmail;
import com.telegram.comando.impl.ComandoSobre;
import com.telegram.comando.impl.ComandoStart;
import com.telegram.modelo.ChatFiap;

public class ComandoFactory {

	public static Comando getComando(ChatFiap chat) {
		ComandoEnum comando = ComandoEnum.getPeloCodigo(chat.getMessage());
		
		if (comando == null) {
			comando = ComandoEnum.getPeloCodigo(chat.getCommand() != null ? chat.getCommand() : ComandoEnum.DEFAULT.getCodigo());
		}
		 
		switch (comando) {
			case START: {
				return new ComandoStart();
			}
			case DATA_HORA: {
				return new ComandoDataHora();
			}
			case SOBRE: {
				return new ComandoSobre();
			}
			case CLIMATEMPO: {
				return new ComandoClimatempo();
			}
			case VALIDAR_EMAIL: {
				return new ComandoEmail();
			}
			case AJUDA: {
				return new ComandoAjuda();
			}
			default:
				return new ComandoDefault();
			}
		}
}
