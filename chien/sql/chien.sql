create table personne(
	`id` int primary key auto_increment,
	`login` varchar(20) not null unique,
	`password` varchar(32) not null,
	`email` varchar(200)
);

insert into personne(`login`,`password`,`email`) values('admin','admin','admin@gmail.com');

select * from personne;

create table chien(
	`id` int primary key auto_increment,	
	`puce` int,
	`nom` varchar(100),
	`couleur` varchar(100),
	`age` int,
	`img_path` varchar(200)
);