package com;

public class WhatsApp2 extends WhatsApp1 {
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("double tick supported");
	}
	void story() {
		System.out.println("images supported");
	}
}
