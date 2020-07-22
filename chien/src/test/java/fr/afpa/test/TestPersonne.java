package fr.afpa.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afpa.bean.Personne;
import fr.afpa.service.PersonneService;

public class TestPersonne {

	@Test
	public void testAddPersonne() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		PersonneService personneService = context.getBean("personneService", PersonneService.class);

		Personne personne = new Personne();
		personne.setLogin("testlogin123");
		personne.setMdp("123456");
		personne.setEmail("testlogin@afpa.fr");

		personneService.addPersonne(personne);
//	}
//
//	@Test
//	public void testUpdatePersonne() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		PersonneService personneService = context.getBean("personneService", PersonneService.class);
//
//		Personne personne = new Personne();
//		personne.setIdPersonne(2);
//		personne.setLogin("testlogin");
//		personne.setMdp("123456");
//		personne.setEmail("test@afpa.fr");
//
//		personneService.updatePersonne(personne);
//	}
//
//	@Test
//	public void testDeletePersonne() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		PersonneService personneService = context.getBean("personneService", PersonneService.class);
//
//		personneService.deletePersonne(2);
//	}
//
//	@Test
//	public void testSelectCount() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		PersonneService personneService = context.getBean("personneService", PersonneService.class);
//
//		int count = personneService.findCount();
//		System.out.println(count);
//	}
//
//	@Test
//	public void testFindPersonne() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		PersonneService personneService = context.getBean("personneService", PersonneService.class);
//
//		Personne personne = personneService.findPersonne(1);
//		System.out.println(personne);
//	}
//
//	@Test
//	public void testFindAllPersonne() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		PersonneService personneService = context.getBean("personneService", PersonneService.class);
//
//		List<Personne> list = personneService.findAllPersonne();
//		System.out.println(list);
	}
}
