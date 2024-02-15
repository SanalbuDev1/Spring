-- DDL Oracle
alter session set "_ORACLE_SCRIPT"=true;
create user springstudy identified by llolo1212 default tablespace USERS;
-- Otorgar privilegios al nuevo usuario
GRANT CONNECT, RESOURCE TO springstudy;
SELECT * FROM dba_users WHERE UPPER(username) = UPPER('springstudy');
-- Opcional: asignar cuotas de espacio para el usuario
ALTER USER springstudy QUOTA UNLIMITED ON USERS;
-- Puedes otorgar todos los privilegios de un golpe con el siguiente comando,
-- pero ten en cuenta que esto puede ser demasiado permisivo y se debe hacer con precaución.
GRANT ALL PRIVILEGES TO springstudy;
GRANT DBA TO springstudy;

-- DDL creacion de tablas

CREATE TABLE personas (
    tipoDocumento VARCHAR2(50) NOT NULL,
    documento NUMBER(10) NOT NULL,
    nombre VARCHAR2(50),
    apellido VARCHAR2(50),
    PRIMARY KEY (tipoDocumento, documento)
);

ALTER TABLE personas
ADD (edad NUMBER(3));

-- DML

INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 1234567890, 'Juan', 'Perez', 30);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 2345678901, 'Maria', 'Gomez', 25);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 3456789012, 'Carlos', 'Rodriguez', 35);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('PA', 4567890123, 'Ana', 'Lopez', 40);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 5678901234, 'Pedro', 'Gonzalez', 45);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('T', 6789012345, 'Carmen', 'Martinez', 50);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('T', 7890123456, 'Luis', 'Hernandez', 55);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 8901234567, 'Sofia', 'Torres', 60);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 9012345678, 'Ricardo', 'Ramirez', 65);
INSERT INTO personas (tipoDocumento, documento, nombre, apellido, edad) VALUES ('CC', 1234567891, 'Isabel', 'Sanchez', 70);


-- Base de datos
se instalo una base de datos oracle local
se configure el listener.ora y el tsname.ora con el hostname
se procedio a ejecutar los siguientes comandos

-- CMD para reiniciar los listeners
lsnrctl status
lsnrctl stop
lsnrctl start

-- Para reiniciar el servicio de oracle
SHUTDOWN INMEDIATE;
STARTUP

---------------------------------------------------------------------------------------------------------------------------
# Servicios Rest
-- Arquitectura Rest
-- Spring
-- Arquitectura cliente servidor
-- Clienes y Ajax
-- Arquitecturas SPA

