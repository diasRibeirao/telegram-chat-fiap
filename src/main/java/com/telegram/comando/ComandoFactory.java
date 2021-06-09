package com.telegram.comando;

import com.telegram.comando.impl.ComandoAjuda;
import com.telegram.comando.impl.ComandoClimatempo;
import com.telegram.comando.impl.ComandoDataHora;
import com.telegram.comando.impl.ComandoDefault;
import com.telegram.comando.impl.ComandoSobre;
import com.telegram.comando.impl.ComandoStart;

public class ComandoFactory {

	public static Comando getComando(String mensagem) {
		switch (ComandoEnum.getPeloCodigo(mensagem)) {
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
			case AJUDA: {
				return new ComandoAjuda();
			}
			default:
				return new ComandoDefault();
			}
		}
}
