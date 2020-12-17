create database if not exists demo;

use demo;


create table users(
	uname varchar(20) primary key,
	passwd varchar(20),
	job varchar(10)
);

create table clients(
	cID int not null primary key AUTO_INCREMENT,
	cName varchar(50),
	cAddress varchar(100),
	cType varchar(10),
	uName varchar(20) references users(uname)
);

create table employee(
	eID int not null primary key AUTO_INCREMENT,
	eName varchar(50),
	eAddress varchar(100),
	uName varchar(20) references users(uname)
);

create table operations(
    oID int not null primary key AUTO_INCREMENT,
    eID int references employee(eID),
    cID int references clients(cID),
    oDate date,
    oTime time,
    nSlot int,
    charge float
);


create table booking_slots(
    sID int not null primary key AUTO_INCREMENT,
    eID int references employee(eID),
    cID int references clients(cID),
    sDate date,
    sTime time
);

INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('meaydin', 'aydinmeusersunameuname', 'doctor');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('eaydin', '12345me', 'nurse');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('caidan', '5432@10', 'client');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('princehassan', 'prince_passwd', 'client');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('admin', 'admin', 'admin');

INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('james', 'james_passwd', 'doctor');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('duncan', 'duncan_passwd', 'nurse');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('TomK', 'TomK_passwd', 'client');
INSERT INTO USERS (UNAME, PASSWD, JOB) VALUES ('Oliver', 'Oliver_passwd', 'client');

INSERT INTO EMPLOYEE (ENAME, EADDRESS, UNAME) VALUES ('Mehmet Aydin', 'Mehmets Address, London, NW4 0BH', 'meaydin');
INSERT INTO EMPLOYEE (ENAME, EADDRESS, UNAME) VALUES ('Emin Aydin', 'Emiin''s Address, Bristol, BS16', 'eaydin');

INSERT INTO EMPLOYEE (ENAME, EADDRESS, UNAME) VALUES ('James Ericks', 'James Ericks Address, Bristol, BS70', 'james');
INSERT INTO EMPLOYEE (ENAME, EADDRESS, UNAME) VALUES ('Duncan Rolls', 'Duncan Address, Bristol, BS20', 'duncan');

INSERT INTO CLIENTS (CNAME, CADDRESS, CTYPE, UNAME) VALUES ('Charly Aidan', '14 King Street, Aberdeen, AB24 1BR', 'NHS', 'caidan');
INSERT INTO CLIENTS (CNAME, CADDRESS, CTYPE, UNAME) VALUES ('Prince Hassan', 'Non-UK street, Non-UK Town, Non_UK', 'private', 'princehassan');

INSERT INTO CLIENTS (CNAME, CADDRESS, CTYPE, UNAME) VALUES ('Oliver B Hughes', '85  Union Terrace, LOCHEND, KW14 5TF', 'NHS', 'Oliver');
INSERT INTO CLIENTS (CNAME, CADDRESS, CTYPE, UNAME) VALUES ('Tom K Wheeler', '88  Boar Lane, SHACKERSTONE, CV13 0GX', 'private', 'TomK');
