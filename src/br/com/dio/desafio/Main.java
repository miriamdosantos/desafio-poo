package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Curso curso1 = new Curso ();
     curso1.setTitulo("Curso Java");
	curso1.setDescricao("descricao cursojava");
	curso1.setCargaHoraria(8);
	Curso curso2 = new Curso ();
    curso2.setTitulo("Curso Js");
	curso2.setDescricao("descricao curso js");
	curso2.setCargaHoraria(9);
	Mentoria mentoria = new Mentoria ();
	mentoria.setTitulo("mentoria de java");
	mentoria.setDescricao("descricao mentoria java");
	mentoria.setData(LocalDate.now());
	System.out.println(curso1 );
	System.out.println( curso2);
	}
	

}
