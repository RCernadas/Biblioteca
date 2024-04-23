-- Insertar datos en la tabla Documento
INSERT INTO Documento (id, titulo, disponible) VALUES
('L-P22', 'Introducción a la Programación', TRUE),
('L-V21','La Odisea', TRUE),
('R-121','Revista de Ciencia', FALSE),
('L-CVA', 'Matemáticas Avanzadas', TRUE),
('R-BNV','Historia del Arte', TRUE);

-- Insertar datos en la tabla Libro
INSERT INTO Libro (id_documento, autor, anho_publicacion) VALUES
('L-P22', 'Juan Pérez', '1973-01-01'),
('L-V21', 'Homero', '1976-01-01'),
('L-CVA', 'María Rodríguez', '1898-01-01');

-- Insertar datos en la tabla Revista
INSERT INTO Revista (id_documento, num_revista) VALUES
('R-121', 132),
('R-BNV', 12);

-- Insertar datos en la tabla Usuario
INSERT INTO Usuario (dni, nombre, apellido_1, apellido_2, tipo_usuario) VALUES
('12345678A', 'Ana', 'García', 'Pérez', 'socio'),
('98765432B', 'Pedro', 'López', 'Martínez', 'usuario_ocasional'),
('87654321C', 'María', 'Rodríguez', 'González', 'socio'),
('13579246D', 'Luis', 'Martínez', 'Sánchez', 'usuario_ocasional');

-- Insertar datos en la tabla Prestamo
INSERT INTO Prestamo (fecha_prestamo, fecha_devolucion, id_documento, id_usuario) VALUES
('2024-04-13', '2024-04-23', 'L-P22', 1),
('2024-04-3', '2024-04-20', 'L-V21', 2),
('2024-04-2', '2024-04-18', 'L-CVA', 3),
('2024-04-1', '2024-04-21', 'R-121', 4);
