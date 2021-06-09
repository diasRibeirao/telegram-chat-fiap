package com.telegram.modelo;

import com.pengrad.telegrambot.model.Update;

public class ChatFiap {
	private Long chatId;
	private String message;
	private String firstName;
	private String lastName;

	public ChatFiap(Update update) {
		this.chatId = update.message().chat().id();
		this.message = update.message().text().toLowerCase().trim().replaceAll("\\s+", " ");
		this.firstName = update.message().from().firstName();
		this.lastName = update.message().from().lastName();
	}

	public Long getChatId() {
		return chatId;
	}

	public void setChatId(Long chatId) {
		this.chatId = chatId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
