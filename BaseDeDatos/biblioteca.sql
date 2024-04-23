DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE Documento (
id VARCHAR(10) PRIMARY KEY,
titulo VARCHAR(45),
disponible BOOLEAN
);

CREATE TABLE Libro (
id_documento VARCHAR(10),
autor VARCHAR(30),
FOREIGN KEY(id_documento) REFERENCES Documento(id)
);

CREATE TABLE Revista (
id_documento VARCHAR(10),
num_revista INT,
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
fecha_devolucion DATE,
fecha_prestamo DATE,
id_documento VARCHAR(10),
id_usuario INT,
FOREIGN KEY(id_documento) REFERENCES Documento(id),
FOREIGN KEY(id_usuario) REFERENCES Usuario(id)
);

