package fr.afpa.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afpa.bean.Personne;
import fr.afpa.service.PersonneService;

public class TestPersonne {

	@Test
	public void testJdbcTemplate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		PersonneService personneService = context.getBean("personneService", PersonneService.class);

		Personne personne = new Personne();
		personne.setLogin("testlogin");
		personne.setPassword("123");
		personne.setEmail("test@afpa.fr");

		personneService.addPersonne(personne);
	}
}
