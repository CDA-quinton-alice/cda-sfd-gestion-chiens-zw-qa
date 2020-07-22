package fr.afpa.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Personne {

	private int idPersonne;
	private String login;
	private String mdp;
	private String email;

}
