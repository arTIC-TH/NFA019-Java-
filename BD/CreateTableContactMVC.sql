drop database if exists bdcontact;

create database if not exists bdcontact;
use bdcontact;

CREATE TABLE contacts(
id_cont int(6) not null primary key AUTO_INCREMENT,
nom_cont varchar(250) not null,
prenom_cont  varchar(250) not null,
email_cont varchar(250) default null,
tel_cont varchar(9) default null
);