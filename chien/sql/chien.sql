create table personne(
	id_personne int primary key auto_increment,
	login varchar(20) not null unique,
	mdp varchar(32) not null,
	email varchar(200) not null
)ENGINE=InnoDB;

insert into personne(login,mdp,email) values('admin','admin','admin@gmail.com');

select * from personne;

create table chien(
	id_chien int primary key auto_increment,	
	puce int not null,
	nom varchar(100) not null,
	couleur varchar(100) not null,
	age int not null,
	img_path varchar(200)
)ENGINE=InnoDB;

create table personne_chien(
	id_personne INT,
   id_chien INT,
   PRIMARY KEY(id_personne, id_chien),
   FOREIGN KEY(id_personne) REFERENCES Personne(id_personne),
   FOREIGN KEY(id_chien) REFERENCES Chien(id_chien)
);
