CREATE database airlinemanagementsystem;
use airlinemanagementsystem;
create table login(username varchar(20),password varchar(20));
show tables;
insert  into  login values("sonam","Kandari");
select * from login;

create table passenger(name  varchar(20), nationality varchar(20),Phone integer,email varchar (30),address varchar(30),Aadhar varchar(20),Gender varchar(20));
select *from passenger;
CREATE table flightdetails(flight_code varchar(20),Flight_name varchar(20),source varchar(40), Destination varchar(20));
describe flightdetails;
insert into flightdetails values("001","AI-1","Mumbai","Dehradun");
insert into flightdetails values("002","AI-2","Mumbai","Delhi");
insert into flightdetails values("003","AI-3","Delhi","Dehradun");
insert into flightdetails values("004","AI-4","Kolkata","Chennai");
insert into flightdetails values("005","AI-5","Puna","BAngloru");
insert into flightdetails values("006","AI-6","India","Canada");
select *from flightdetails;

create table reservation  (PNR varchar(15),TICKET varchar (20), aadhar varchar(20),name varchar(20),nationallity varchar(20), flightname varchar(15),flightcode varchar(20),src varchar(20 ),des varchar(20));

select * from reservation;
