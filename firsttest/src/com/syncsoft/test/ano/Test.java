package com.syncsoft.test.ano;


@Ano(name="sys",age=12)
public class Test {
	public static void main(String[] args) {
		Ano ano =Test.class.getAnnotation(Ano.class);
		System.out.println(ano.name());
		System.out.println(ano.age());
	}
}
