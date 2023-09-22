
DROP DATABASE IF EXISTS usuarios;

CREATE DATABASE usuarios;

USE usuarios;

CREATE TABLE users(
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(25) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  edad INT NOT NULL,
  email VARCHAR(50) NOT NULL,
  contraseña VARCHAR(30) NOT NULL,
  ciudad VARCHAR(50) NOT NULL,
  pais VARCHAR(25) NOT NULL,
  telefono VARCHAR(10) NOT NULL
);