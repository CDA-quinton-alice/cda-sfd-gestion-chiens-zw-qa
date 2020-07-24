package fr.afpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chien {

	Integer idChien;
	Integer puce;
	String nom;
	String couleur;
	Integer age;
	String imgPath;
}
