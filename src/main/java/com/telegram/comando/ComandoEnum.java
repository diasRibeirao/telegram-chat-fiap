package com.telegram.comando;

public enum ComandoEnum {

	START("/start", "Inicio o chat com as boas vindas", true), 
	SOBRE("/sobre", "Informa sobre o chat", true),
	DATA_HORA("/datahora", "Informa a data e hora", true),
	CLIMATEMPO("/climatempo", "Informa a temperatura de hoje e amanhã (Cidade de São Paulo)", true),
	VALIDAR_EMAIL("/validaremail", "Valida se um email é válido", true),
	AJUDA("/ajuda", "Informa os comandos disponíveis", true),
	DEFAULT("/deafult", "Enviar mensagens caso não seja nenhum comando acima", false);

	private String codigo;
	private String descricao;
	private boolean exibir;

	ComandoEnum(String codigo, String descricao, Boolean exibir) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.exibir = exibir;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isExibir() {
		return exibir;
	}

	public static ComandoEnum getPeloCodigo(String codigo) {
		for (ComandoEnum comando : ComandoEnum.values()) {
			if (comando.codigo.equals(codigo)) {
				return comando;
			}
		}
		return null;
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
