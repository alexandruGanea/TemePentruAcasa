-- 1. Sa se modeleze o baza de date cu filme cu urmatoarele tabele:
	-- Actori: nume, prenume, gen
	-- Filme: titlu, anul lansarii, durata, limba, tara lansarii genul filmului, regia
	-- Gen de filme: nume, tip vizionare
	-- Regizor: nume, prenume
	-- Reviewer: nume, prenume, varsta
	-- Rating: reviewer-ul, filmul, numarul de stele
	-- Movie cast: filmul, actorii, rol
        
drop database if exists cinema;
create database if not exists cinema;
use cinema;

create table if not exists actors(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
surname VARCHAR(50) NOT NULL,
gender VARCHAR(1) NOT NULL
);

create table if not exists directors(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
surname VARCHAR(50) NOT NULL
);

create table if not exists genres(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
genre VARCHAR(20) NOT NULL,
projection VARCHAR(2) NOT NULL
);

create table if not exists movies(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
year INT NOT NULL,
duration INT NOT NULL,
country VARCHAR(20) NOT NULL,
director_id INT NOT NULL,
genre_id INT NOT NULL,
CONSTRAINT fk_movies_directors
FOREIGN KEY (director_id)
REFERENCES directors(id),
CONSTRAINT fk_movies_genres
FOREIGN KEY (genre_id)
REFERENCES genres(id)
);

create table if not exists reviewers(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name VARCHAR(20) NOT NULL,
surname VARCHAR(50) NOT NULL,
age INT NOT NULL
);

create table if not exists ratings(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
stars FLOAT NOT NULL,
movie_id INT NOT NULL,
reviewer_id INT NOT NULL,
CONSTRAINT fk_ratings_movies
FOREIGN KEY (movie_id)
REFERENCES movies(id),
CONSTRAINT fk_ratings_reviewers
FOREIGN KEY (reviewer_id)
REFERENCES reviewers(id)
);

create table if not exists movie_casts(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
part VARCHAR(10) NOT NULL,
actor_id INT NOT NULL,
movie_id INT NOT NULL,
CONSTRAINT fk_movie_casts_actors
FOREIGN KEY (actor_id)
REFERENCES actors(id),
CONSTRAINT fk_movie_casts_movies
FOREIGN KEY (movie_id)
REFERENCES movies(id)
);

-- 2. Sa se insereze in tabel cel putin cate 10 randuri de fiecare tabel
insert into actors(name,surname,gender) values('Arnold', 'Schwarzenegger','M');
insert into actors(name,surname,gender) values('Sylvester', 'Stallone','M');
insert into actors(name,surname,gender) values('Sergiu', 'Nicolaescu','M');
insert into actors(name,surname,gender) values('Oana', 'Sarbu','F');
insert into actors(name,surname,gender) values('Harrison', 'Ford','M');
insert into actors(name,surname,gender) values('Mila', 'Jovovich','F');
insert into actors(name,surname,gender) values ('Bruce', 'Willis','M');
insert into actors(name,surname,gender) values ('Cameron', 'Diaz','F');
insert into actors(name,surname,gender) values ('Ryan', 'Gosling','M');
insert into actors(name,surname,gender) values ('Emma', 'Stone','F');

insert into directors(name,surname) values('James','Cameron');
insert into directors(name,surname) values('Sylvester','Stallone');
insert into directors(name,surname) values('Dennis','Villeneuve');
insert into directors(name,surname) values('Damien','Chazelle');
insert into directors(name,surname) values('Sergiu','Nicolaescu');
insert into directors(name,surname) values('Nicolae','Corjos');
insert into directors(name,surname) values('Luc','Besson');
insert into directors(name,surname) values('Wolfgang','Peterson');
insert into directors(name,surname) values('John','Moore');
insert into directors(name,surname) values('Cameron','Crowe');

insert into genres(genre,projection) values('Action','2D');
insert into genres(genre,projection) values('Action','3D');
insert into genres(genre,projection) values('Drama','2D');
insert into genres(genre,projection) values('Crime','2D');
insert into genres(genre,projection) values('Mystery','3D');
insert into genres(genre,projection) values('Musical','3D');
insert into genres(genre,projection) values('Comedy','2D');
insert into genres(genre,projection) values('Sci-Fi','2D');
insert into genres(genre,projection) values('Romance','2D');
insert into genres(genre,projection) values('Thriller','2D');

insert into movies(title, year,duration,country,director_id,genre_id) values('The Terminator',1984,107,'USA',1,1);
insert into movies(title, year,duration,country,director_id,genre_id) values('Rocky',1976,145,'USA',2,3);
insert into movies(title, year,duration,country,director_id,genre_id) values('Blade Runner 2049',2017,164,'USA',3,5);
insert into movies(title, year,duration,country,director_id,genre_id) values('Un comisar acuza',1974,114,'Romania',5,4);
insert into movies(title, year,duration,country,director_id,genre_id) values('La La Land',2016,128,'USA',4,6);
insert into movies(title, year,duration,country,director_id,genre_id) values('Liceenii',1986,95,'Romania',6,9);
insert into movies(title, year,duration,country,director_id,genre_id) values('The Fifth Element',1997,126,'USA',7,8);
insert into movies(title, year,duration,country,director_id,genre_id) values('Air Force One',1997,124,'USA',8,10);
insert into movies(title, year,duration,country,director_id,genre_id) values('Vanilla Sky',2001,141,'USA',10,9);
insert into movies(title, year,duration,country,director_id,genre_id) values ('A Good Day To Die Hard',2013,101,'USA',9,2);

insert into reviewers(name,surname,age) values('Karen','Valby',45);
insert into reviewers(name,surname,age) values('David','Bianculli',23);
insert into reviewers(name,surname,age) values('Brooke','Hauser',56);
insert into reviewers(name,surname,age) values('Lucy','Mangan',17);
insert into reviewers(name,surname,age) values('Sal','Cinquemany',78);
insert into reviewers(name,surname,age) values('Wanda','Hale',18);
insert into reviewers(name,surname,age) values('Zach','Campbell',15);
insert into reviewers(name,surname,age) values('Kate','Cameron',35);
insert into reviewers(name,surname,age) values('Alexis','Gunderson',44);
insert into reviewers(name,surname,age) values('Mark','Harris',22);

insert into ratings(stars,movie_id,reviewer_id) values(8.0,1,10);
insert into ratings(stars,movie_id,reviewer_id) values(8.1,2,9);
insert into ratings(stars,movie_id,reviewer_id) values(8.1,3,8);
insert into ratings(stars,movie_id,reviewer_id) values(7.6,4,7);
insert into ratings(stars,movie_id,reviewer_id) values(8.0,5,6);
insert into ratings(stars,movie_id,reviewer_id) values(8.0,6,5);
insert into ratings(stars,movie_id,reviewer_id) values(7.7,7,4);
insert into ratings(stars,movie_id,reviewer_id) values(6.5,8,3);
insert into ratings(stars,movie_id,reviewer_id) values(6.9,9,2);
insert into ratings(stars,movie_id,reviewer_id) values(5.3,10,1);

insert into movie_casts(part,actor_id,movie_id) values('secondary',8,9);
insert into movie_casts(part,actor_id,movie_id) values('secondary',6,7);
insert into movie_casts(part,actor_id,movie_id) values('secondary',6,6);
insert into movie_casts(part,actor_id,movie_id) values('main',7,10);
insert into movie_casts(part,actor_id,movie_id) values('main',5,8);
insert into movie_casts(part,actor_id,movie_id) values('main',10,5);
insert into movie_casts(part,actor_id,movie_id) values('main',3,4);
insert into movie_casts(part,actor_id,movie_id) values('main',9,3);
insert into movie_casts(part,actor_id,movie_id) values('main',2,2);
insert into movie_casts(part,actor_id,movie_id) values('main',1,1);

-- 3. Sa se afiseze toti actorii de genul masculin
select *from actors where gender = 'M';

-- 4. Sa se afiseze actritele
select * from actors where gender = 'F';

-- 5. Sa se afiseze filmele lansate inainte de 1990
select title from movies where year<1990;

-- 6. Sa se afiseze filmele de drama si romance
select title, genre from movies INNER JOIN genres on movies.genre_id = genres.id where genre = 'Drama' or genre= 'Romance';

-- 7. Sa se afiseze filmele care nu au fost lansate in Romania
select title, year from movies where country <>'Romania';

-- 8. Sa se afiseze filmele care au fost regizate de Steven Spielberg (un anumit regizor)
select title, name, surname from movies INNER JOIN directors on movies.director_id = directors.id where directors.name = 'Sergiu' and directors.surname = 'Nicolaescu';

-- 9. Sa se afiseze filmele care dureaza mai mult de 2 ore
select title, duration from movies where duration>120;

-- 10. Sa se afiseze cate filme dureaza intre o ora si doua ore
select count(*) from movies where duration>60 and duration<120;

-- 11.Sa se afiseze toti reviewerii mai mari de 18 ani
select name, surname from reviewers where age<18;

-- 12.Sa se afiseze cati revieweri sunt mai mici de 18ani
select count(*) from reviewers where age<18;

-- 13. Sa se afiseze filmele care au mai mult de 7 stele la review
select movies.title, stars from ratings INNER JOIN movies on ratings.movie_id = movies.id where ratings.stars>7.0;

-- 14. Sa se afiseze cate filme au mai putin de 7 stele
select count(*) from ratings INNER JOIN movies on ratings.movie_id = movies.id where ratings.stars<7.0;

-- 15. Sa se afiseze media de varsta a tuturor reviewerilor
select avg(age) from reviewers;

-- 16. Sa se afiseze durata medie a tuturor filmelor
select avg(duration) from movies;

-- 17. Sa se afiseze actorii dintr-un anumit film
select name, surname, title from movie_casts 
inner join actors on movie_casts.actor_id = actors.id
inner join movies on movie_casts.movie_id = movies.id
where movies.title = 'Vanilla Sky';

-- 18. Sa se afiseze filmele in care un anumit actor a avut rolul principal
select name, surname, part, title from movie_casts
inner join actors on movie_casts.actor_id = actors.id
inner join movies on movie_casts.movie_id = movies.id
where movies.title = 'The Terminator' and movie_casts.part = 'main';

-- 19. Sa se afiseze filmele de un anumit tip (actiune, etc)
select title, genres.genre from movies inner join genres on movies.genre_id = genres.id
where genre = 'Action';

-- 20. Sa se afiseze filmele care nu sunt 3D
select title, genres.projection from movies inner join genres on movies.genre_id = genres.id
where projection <> '3D';

-- 21. Sa se afiseze filmele comedie 2D
select title, genres.genre, genres.projection from movies inner join genres on movies.genre_id = genres.id
where genre = 'Romance' and projection = '2D';



