create table `root`.`Team`(
team_id int primary key,
capton_name varchar(20),
country varchar(30),
matches_played int not null,
total_runs int not null,
match_looses int not null);

create table `root`.`Batsman`(
player_id int primary key,
name varchar(20),
country varchar(20),
batsman_score int ,
team_id int ,
foreign key(team_id) references Team (team_id) );


create table `root`.`Bolwer`(
player_id int primary key,
name varchar(20),
country varchar(30),
wicket_taken int,
no_of_matches_played int,
team_id int,
foreign key(team_id) references Team (team_id));



insert into `root`.`Team`(team_id,capton_name,country,matches_played,total_runs,match_looses) values (1,'Dhoni','India',5,9000,2);
insert into `root`.`Team`(team_id,capton_name,country,matches_played,total_runs,match_looses) values (2,'Joe Root','England',5,8000,3);
insert into `root`.`Team`(team_id,capton_name,country,matches_played,total_runs,match_looses) values (3,'Tim Paine','Australia',5,8500,2);
insert into `root`.`Team`(team_id,capton_name,country,matches_played,total_runs,match_looses) values (4,'Dimuth Karunaratne','Sri Lanka',5,7000,3);

insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (7,'MS Dhoni','India',500,1);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (18,'Virath kolhi','India',700,1);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (11,'Rohit Sharma','India',800,1);

insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (1,'Alastair Cook','England',500,2);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (2,'Graham Gooch','Englan',550,2);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (3,'Alec Stewart','England',330,2);

insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (4,'Donald Bradman','Australia',400,3);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (5,'Ricky Ponting','Australia',450,3);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (6,'Steve Waugh','Australi',820,3);

insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (8,'Russel Arnold','Sri Lanka',810,4);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (9,'Dilhara Fernando','Sri Lanka',710,4);
insert into `root`.`Batsman`(player_id,name,country,batsman_score,team_id) values (10,'Mahela Jayawardene ','Sri Lanka',610,4);


insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(21,'Bhuwnashwer Kumar','India',9,5,1);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(22,'Ravindra Jadeja','India',10,5,1);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(23,'Ajit Agarkar','India',7,5,1);

insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(24,'AU Rashid','England',1,3,2);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(25,'BA Stokes','England',4,5,2);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(26,'JC Archer','England',2,4,2);

insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(27,'Somachandra de Silva','Sri Lanka',4,5,4);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(28,'BA Stokes','Ajit de Silva',8,5,4);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(29,'JC Archer','Ashantha de Mel',6,5,4);

insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(30,'Greg Chappell','Australia',7,5,3);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(31,'Bob Massie','Australia',6,5,3);
insert into `root`.`Bolwer`(player_id,name,country,wicket_taken,no_of_matches_played,team_id) values(32,'Brett Lee','Australia',9,5,3);



select  name,batsman_score from `root`.`Batsman` order by batsman_score desc limit 5;

select name,wicket_taken from `root`.`Bolwer` order by wicket_taken desc limit 5;

select team_id,(total_runs/matches_played) as average from `root`.`Team`;


update  `root`.`Batsman` set batsman_score=batsman_score+10 where team_id=(select team_id from `root`.`Team` order by (total_runs/matches_played) limit 1); 



USE `root`;
DROP procedure IF EXISTS `new_procedure`;

DELIMITER $$
USE `root`$$
CREATE PROCEDURE `new_procedure` (cntry VARCHAR(255), OUT total INT)
BEGIN
SELECT total_runs into total from `root`.`Team` where country=cntry;
END$$

DELIMITER ;

CALL new_procedure('India',@total);
SELECT @total;





