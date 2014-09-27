package com.rp.aula.design.singleton;

public class Sistema {

	public static void main(String[] args) {
		CacheManager c = CacheManager.getInstance("CacheTabelaEstados");
		c.getObjeto("BR");
		
		CacheManager c1 = CacheManager.getInstance("CacheTabelaMunicipios");
		c1.getObjeto("USA");
		
		System.out.println(c);
		System.out.println(c1);
		

	}

}
