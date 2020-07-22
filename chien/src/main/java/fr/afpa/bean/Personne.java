package fr.afpa.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {

	private int idPersonne;
	private String login;
	private String mdp;
	private String email;

}
