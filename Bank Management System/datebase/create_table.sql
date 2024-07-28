create database bankSystem;
use bankSystem;

create table login (
    form_no INT PRIMARY KEY,
    card_number VARCHAR(30) NOT NULL,
    pin VARCHAR(30) NOT NULL
);

create table signup(form_no varchar(30),name varchar(30),father_name varchar(30),
DOB varchar(30),gender varchar(10),email varchar(60),marital_status varchar(10),
address varchar(60),city varchar(30),pincode varchar(10),state varchar(50));

create table signuptwo(form_no varchar(30),religion varchar(30),category varchar(30),
income varchar(30),education varchar(30),occupation varchar(60),pan varchar(20),
aadhar varchar(30),seniorcitizen varchar(30),existing_account varchar(10));
 
create table signupthree(form_no varchar(30),account_type varchar(30),card_number varchar(30),
pin varchar(30),facility varchar(200));
create table login(form_no varchar(30),card_number varchar(50),pin varchar(30));

create table bank(pin varchar(30),date varchar(50),type varchar(30),amount varchar(20));

