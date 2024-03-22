CREATE DATABASE IF NOT EXISTS cafe_management_system;

USE cafe_management_system;

CREATE TABLE IF NOT EXISTS customers (
    cust_id     INT(10) PRIMARY KEY,
    cust_name   VARCHAR(25) NOT NULL,
    phone_no    CHAR(15),
    cust_dob    DATE,
    email_addr  VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS employees (
    emp_id          INT(10) PRIMARY KEY,
    emp_name        VARCHAR(25) NOT NULL,
    phone_no        CHAR(15),
    emp_title       VARCHAR(50),
    gender          VARCHAR(7),
    emp_doj         DATE,
    email_addr      VARCHAR(50),
    address         VARCHAR(225)
);

CREATE TABLE IF NOT EXISTS stocks (
    prod_id             INT(10) PRIMARY KEY,
    prod_name           VARCHAR(25) NOT NULL,
    prod_category       VARCHAR(50),
    price               INT(5) NOT NULL,
    ideal_stock         INT(5) NOT NULL,
    avail_stock         INT(5) NOT NULL
);

CREATE TABLE IF NOT EXISTS suppliers (
    sup_id      INT(10) PRIMARY KEY,
    sup_name    VARCHAR(25) NOT NULL,
    sup_prod    VARCHAR(30),
    phone_no    CHAR(15),
    email_addr  VARCHAR(50),
    address     VARCHAR(225)
);
