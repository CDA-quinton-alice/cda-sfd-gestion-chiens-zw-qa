package fr.afpa.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {

	public Personne(String login, String mdp, String email) {
	}
	private int idPersonne;
	private String login;
	private String mdp;
	private String email;

}
