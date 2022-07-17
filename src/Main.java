import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descricao Curso JavaScript");
		curso2.setCargaHoraria(4);		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao JavaScript");
		mentoria.setData(LocalDate.now());
		
		/*
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println(mentoria.toString());*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAnonimo = new Dev();
		devAnonimo.setNome("Anonimo");
		devAnonimo.inscreverBootCamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Anonimo " + devAnonimo.getConteudosInscritos());
		devAnonimo.progredir();
		devAnonimo.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Anonimo " + devAnonimo.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de Aninomo " + devAnonimo.getConteudosConcluidos());
		System.out.println("XP: " + devAnonimo.calcularXp());

		System.out.println("-----------");

		Dev devOculto = new Dev();
		devOculto.setNome("Oculto");
		devOculto.inscreverBootCamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Oculto " + devOculto.getConteudosInscritos());
		devOculto.progredir();
		devOculto.progredir();
		devOculto.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Oculto " + devOculto.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de Oculto " + devOculto.getConteudosConcluidos());
		System.out.println("XP: " + devOculto.calcularXp());
	}
}
