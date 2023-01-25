package com.company.springcourse.RestApiConcumer;

public class Translate {
	private String status;
	private String to;
	private String original_text;
	private TranslatedText translated_text;
	private String translated_characters;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getOriginal_text() {
		return original_text;
	}
	public void setOriginal_text(String original_text) {
		this.original_text = original_text;
	}
	public TranslatedText getTranslated_text() {
		return translated_text;
	}
	public void setTranslated_text(TranslatedText translated_text) {
		this.translated_text = translated_text;
	}
	public String getTranslated_characters() {
		return translated_characters;
	}
	public void setTranslated_characters(String translated_characters) {
		this.translated_characters = translated_characters;
	}
	
	
}
