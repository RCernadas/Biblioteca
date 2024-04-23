-- Insertar datos en la tabla Documento
INSERT INTO Documento (titulo, disponible) VALUES
('Introducción a la Programación', TRUE),
('La Odisea', TRUE),
('Revista de Ciencia', FALSE),
('Matemáticas Avanzadas', TRUE),
('Historia del Arte', TRUE);

-- Insertar datos en la tabla Libro
INSERT INTO Libro (id_documento, autor) VALUES
(1, 'Juan Pérez'),
(2, 'Homero'),
(4, 'María Rodríguez');

-- Insertar datos en la tabla Revista
INSERT INTO Revista (id_documento) VALUES
(3),
(5);

-- Insertar datos en la tabla Usuario
INSERT INTO Usuario (dni, nombre, apellido_1, apellido_2, tipo_usuario) VALUES
('12345678A', 'Ana', 'García', 'Pérez', 'socio'),
('98765432B', 'Pedro', 'López', 'Martínez', 'usuario_ocasional'),
('87654321C', 'María', 'Rodríguez', 'González', 'socio'),
('13579246D', 'Luis', 'Martínez', 'Sánchez', 'usuario_ocasional');

-- Insertar datos en la tabla Prestamo
INSERT INTO Prestamo (duracion_prestamo, fecha_prestamo, id_documento, id_usuario) VALUES
('14', '2024-04-23', 1, 1),
('7', '2024-04-20', 2, 2),
('21', '2024-04-18', 4, 3),
('14', '2024-04-21', 5, 4);
