create database FootBall_Game;
use FootBall_Game;
create table Team(
id int not null auto_increment primary key,
name varchar(50) not null,
country varchar(50) not null,
manager varchar(50) not null,
logo varchar(300) not null
);

alter table team add column created_at datetime not null;
alter table team add column updated_at datetime not null;