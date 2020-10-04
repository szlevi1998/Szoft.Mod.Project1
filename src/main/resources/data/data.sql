create table szavak (id bigint auto_increment not null, fk_korosztaly int, fk_kategoria int, szo varchar(255),hasznalt boolean(255));

alter table szavak add primary key (id);
alter table szavak add foreign key (fk_korosztaly,fk_kategoria)
    references szavak(fk_korosztaly,fk_kategoria);

insert into szavak values (1,1,2,'foci',FALSE);
insert into szavak values (2,2,2,'tenisz',FALSE);
insert into szavak values (3,3,2,'sakk',FALSE);
insert into szavak values (4,1,1,'kutya',FALSE);
insert into szavak values (5,2,1,'rozmar',FALSE);
insert into szavak values (6,3,1,'dodo',FALSE);
insert into szavak values (7,1,3,'leaugeoflegends',FALSE);
insert into szavak values (8,2,3,'leaugeoflegends',FALSE);
insert into szavak values (9,3,3,'leaugeoflegends',FALSE);
commit;
select * from szavak;

create table kategoria (id bigint auto_increment not null, neve varchar(255));
alter table kategoria add primary key (id);
insert into kategoria values (1, 'állatvilág');
insert into kategoria values (2,'sport');
insert into kategoria values (3,'e-sport játékok');

commit;

select * from kategoria;

create table korosztaly (id bigint auto_increment not null, leiras varchar(255));
alter table korosztaly add primary key (id);
insert into korosztaly values (1,'fiatal');
insert into korosztaly values (2,'középkorú');
insert into korosztaly values (3,'idős');

commit;

select * from korosztaly;

create table user (id bigint auto_increment not null, nev varchar(255),jatszott int, nyert int);
alter table user add primary key (id);
insert into user values (1,'Béla',0,0);
commit;

select * from user;
