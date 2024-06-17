package com.formationkilo;

public class Message {
	private String content;
	private String consignor;
	private String recipient;
	public Message() {
	}
	public Message(String content, String consignor) {
		this.content = content;
		this.consignor = consignor;
	}
	public Message(String content, String consignor, String recipient) {
		this.content = content;
		this.consignor = consignor;
		this.recipient = recipient;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getConsignor() {
		return consignor;
	}
	public void setConsignor(String consignor) {
		this.consignor = consignor;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	@Override
	public String toString() {
		return "Message [content=" + content + ", consignorr=" + consignor + ", recipient=" + recipient + "]";
	}
	

}
