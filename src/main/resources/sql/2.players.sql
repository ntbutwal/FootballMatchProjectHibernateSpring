create table Players(
id int not null auto_increment primary key,
name varchar(50) not null,
position varchar(50),
age int,
Team_id int,
foreign key(Team_id) references Team(id)
);