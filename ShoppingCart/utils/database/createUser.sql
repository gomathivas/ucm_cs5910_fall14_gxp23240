-- Oracle Database
-- Creating table space, user, granting previleges. 



1.-- create permenant table space
CREATE TABLESPACE tbs_ecom_sc_01
  DATAFILE 'tbs_ecom_sc_01.dat' 
    SIZE 20M
    REUSE
    AUTOEXTEND ON NEXT 20M MAXSIZE 100M;

2. --create temporary table space
CREATE TEMPORARY TABLESPACE tbs_ecom_sc_temp_01
  TEMPFILE 'tbs_ecom_sc_temp_01.dbf'
    SIZE 5M
    AUTOEXTEND ON;
    
    
3. --create user 
-- USER SQL
CREATE USER ase_ecom_sc IDENTIFIED BY abcd123 
DEFAULT TABLESPACE "TBS_ECOM_SC_01"
TEMPORARY TABLESPACE "TBS_ECOM_SC_TEMP_01";

-- QUOTAS
ALTER USER ase_ecom_sc QUOTA 20M ON TBS_ECOM_SC_01;

-- ROLES

-- SYSTEM PRIVILEGES
GRANT CREATE TRIGGER TO ase_ecom_sc ;
GRANT CREATE SEQUENCE TO ase_ecom_sc ;
GRANT CREATE TABLE TO ase_ecom_sc ;
GRANT CREATE PROCEDURE TO ase_ecom_sc ;
GRANT CREATE SYNONYM TO ase_ecom_sc ;
GRANT CREATE VIEW TO ase_ecom_sc ;
GRANT CREATE SESSION TO ase_ecom_sc ;

---------------------------------------------------------------------

4. -- create objects
CREATE TABLE CUSTOMER 
(
  CUSTOMER_ID VARCHAR2(20) NOT NULL 
, GENDER VARCHAR2(20) 
, FIRST_NAME VARCHAR2(20) 
, MIDDLE_NAME VARCHAR2(20) 
, LAST_NAME VARCHAR2(20) 
, CONSTRAINT CUSTOMER_PK PRIMARY KEY 
  (
    CUSTOMER_ID 
  )
  ENABLE 
);


-------------------------------------------------------------------------
