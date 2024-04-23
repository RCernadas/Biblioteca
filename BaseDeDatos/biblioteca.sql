DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE Documento (
id INT AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(45),
disponible BOOLEAN
);

CREATE TABLE Libro (
id_documento INT AUTO_INCREMENT,
autor VARCHAR(30),
FOREIGN KEY(id_documento) REFERENCES Documento(id)
);

CREATE TABLE Revista (
id_documento INT AUTO_INCREMENT,
FOREIGN KEY(id_documento) REFERENCES Documento(id)
);

CREATE TABLE Usuario(
id INT AUTO_INCREMENT PRIMARY KEY,
dni VARCHAR(9),
nombre VARCHAR(15),
apellido_1 VARCHAR(25),
apellido_2 VARCHAR(25),
tipo_usuario ENUM('socio', 'usuario_ocasional')
);

CREATE TABLE Prestamo(
id_prestamo INT AUTO_INCREMENT PRIMARY KEY,
duracion_prestamo VARCHAR(2),
fecha_prestamo DATE,
id_documento INT,
id_usuario INT,
FOREIGN KEY(id_documento) REFERENCES Documento(id),
FOREIGN KEY(id_usuario) REFERENCES Documento(id)
);

