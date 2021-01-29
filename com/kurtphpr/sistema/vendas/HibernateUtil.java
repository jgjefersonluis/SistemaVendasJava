package com.kurtphpr.sistema.vendas;

import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory session = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (Throwable e){
			System.out.println("O sistema não conseguiu fazer a conexão! Tente novamente!\n" + e);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSession() {
		return session;
	}
	
	
			

}
