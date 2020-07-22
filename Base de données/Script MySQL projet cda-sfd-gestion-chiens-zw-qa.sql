#------------------------------------------------------------
#        Script MySQL projet cda-sfd-gestion-chiens-zw-qa
#------------------------------------------------------------

#------------------------------------------------------------
#        Création de la base de données gestion_chiens
#------------------------------------------------------------

DROP DATABASE IF EXISTS gestion_chiens;
CREATE DATABASE IF NOT EXISTS gestion_chiens; 
alter database gestion_chiens character set utf8 collate utf8_general_ci;
use gestion_chiens;

#-----------------------------------------------------------------------------------------------------
#        Creation de l'utilisateur dédié à la base de données gestion_chiens : user_gestion_chiens
#-----------------------------------------------------------------------------------------------------
CREATE USER if not EXISTS'user_gestion_chiens'@'localhost' IDENTIFIED BY 'pwd';
grant all privileges on gestion_chiens.* to 'user_gestion_chiens'@'localhost';
FLUSH PRIVILEGES;

#------------------------------------------------------------
#        Création de la table personne 
#------------------------------------------------------------

create table personne(
	idPersonne int primary key auto_increment,
	login varchar(20) not null unique,
	mdp varchar(32) not null,
	email varchar(200) not null
) ENGINE = InnoDB;
insert into personne(`login`,`mdp`,`email`) values('admin','admin','admin@gmail.com');
select * from personne;

#------------------------------------------------------------
#        Création de la table chien
#------------------------------------------------------------


create table chien(
idChien int primary key auto_increment,	
	puce int not null,
	nom varchar(100) not null,
	couleur varchar(100) not null,
	age int not null,
	imgPath varchar(200)
)	ENGINE = InnoDB;

#------------------------------------------------------------
#        Création de la table personne_chien
#------------------------------------------------------------
create table personne_chien(
	idPersonne INT,
   idChien INT,
   PRIMARY KEY(idPersonne, idChien),
   FOREIGN KEY(idPersonne) REFERENCES Personne(idPersonne),
   FOREIGN KEY(idChien) REFERENCES Chien(idChien)
)ENGINE=InnoDB;
