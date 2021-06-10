package com.telegram.comando;

/**
 * 
 * enum dos comandos possiveis de serem executados no bot e as suas descricoes
 *
 */
public enum ComandoEnum {

	/**
	 * enum das opcoes e string retornada para o usuario. 
	 */
	START("/start", "Inicio o chat com as boas vindas", true), 
	SOBRE("/sobre", "Informa sobre o chat", true),
	DATA_HORA("/datahora", "Informa a data e hora", true),
	CLIMATEMPO("/climatempo", "Informa a temperatura de hoje e amanh� (Cidade de S�o Paulo)", true),
	AJUDA("/ajuda", "Informa os comandos dispon�veis", true),
	DEFAULT("/deafult", "Enviar mensagens caso n�o seja nenhum comando acima", false);

	private String codigo;
	private String descricao;
	private boolean exibir;

	ComandoEnum(String codigo, String descricao, Boolean exibir) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.exibir = exibir;
	}

	public static ComandoEnum getPeloCodigo(String codigo) {
		for (ComandoEnum comando : ComandoEnum.values()) {
			if (comando.codigo.equals(codigo)) {
				return comando;
			}
		}
		return ComandoEnum.DEFAULT;
	}

	public static String exibirComandos() {
		StringBuilder comandos = new StringBuilder();

		for (ComandoEnum comando : ComandoEnum.values()) {
			if (!comando.exibir) {
				continue;
			}
			
			comandos.append("\n" + comando.codigo + " - " + comando.descricao);
		}

		return comandos.toString();
	}

}
