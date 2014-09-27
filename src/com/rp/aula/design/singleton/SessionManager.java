package com.rp.aula.design.singleton;

public class SessionManager {

	private static SessionManager INSTANCE;

	private int contadorInstancias;

	private SessionManager() {

	}

	public static SessionManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SessionManager();
			INSTANCE.contadorInstancias = 1;
		} else {
			INSTANCE.contadorInstancias++;
		}

		return INSTANCE;
	}

	public int getContadorInstancias() {
		return INSTANCE.contadorInstancias;
	}
	
	public static void main(String[] args) {
		SessionManager s = SessionManager.getInstance();
		SessionManager s1 = SessionManager.getInstance();
		SessionManager s3 = SessionManager.getInstance();
		
		System.out.println(s.getContadorInstancias());
		System.out.println(s1.getContadorInstancias());
		System.out.println(s3.getContadorInstancias());
		
	}

}
