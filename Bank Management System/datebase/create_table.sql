CREATE DATABASE bankSystem;
USE bankSystem;

CREATE TABLE login (
    form_no INT PRIMARY KEY,
    card_number VARCHAR(30) NOT NULL,
    pin VARCHAR(30) NOT NULL
);

CREATE TABLE signup (
    form_no VARCHAR(30),
    name VARCHAR(30),
    father_name VARCHAR(30),
    DOB VARCHAR(30),
    gender VARCHAR(10),
    email VARCHAR(60),
    marital_status VARCHAR(10),
    address VARCHAR(60),
    city VARCHAR(30),
    pincode VARCHAR(10),
    state VARCHAR(50)
);

CREATE TABLE signuptwo (
    form_no VARCHAR(30),
    religion VARCHAR(30),
    category VARCHAR(30),
    income VARCHAR(30),
    education VARCHAR(30),
    occupation VARCHAR(60),
    pan VARCHAR(20),
    aadhar VARCHAR(30),
    seniorcitizen VARCHAR(30),
    existing_account VARCHAR(10)
);

CREATE TABLE signupthree (
    form_no VARCHAR(30),
    account_type VARCHAR(30),
    card_number VARCHAR(30),
    pin VARCHAR(30),
    facility VARCHAR(200)
);

CREATE TABLE bank (
    pin VARCHAR(30),
    date VARCHAR(50),
    type VARCHAR(30),
    amount VARCHAR(20)
);
