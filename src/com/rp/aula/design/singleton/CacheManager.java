package com.rp.aula.design.singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

	private static CacheManager INSTANCE = null;

	private String nomeCache = null;
	private Map<String, Object> cache = new HashMap<String, Object>();

	private CacheManager() {
	}

	public static synchronized CacheManager getInstance(String nomeCache) {
		if (INSTANCE == null) {
			INSTANCE = new CacheManager();
			INSTANCE.nomeCache = nomeCache;
		}
		return INSTANCE;
	}

	public Object getObjeto(String chave) {
		Object objeto = cache.get(chave);
		if (objeto == null) {
			objeto = buscaDadosBancoDados(chave);
		}
		return objeto;
	}

	private Object buscaDadosBancoDados(String chave) {
		// realiza uma conexão com o banco
		// faz a consulta e retorna
		return new Object();
	}

	public String getNomeCache() {
		return nomeCache;
	}

	public void setNomeCache(String nomeCache) {
		this.nomeCache = nomeCache;
	}

	@Override
	public String toString() {
		return "CacheManager [nomeCache=" + nomeCache + "]";
	}

}
