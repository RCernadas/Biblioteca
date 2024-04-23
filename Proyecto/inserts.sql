-- Insertar datos en la tabla documentos
INSERT INTO documentos (cod_documento, titulo, año_publicacion) VALUES
(101, 'La Odisea', 800),
(102, 'Cien años de soledad', 1967),
(103, '1984', 1949),
(104, 'El principito', 1943);

-- Insertar datos en la tabla libro
INSERT INTO libro (id_documento, disponible) VALUES
(1, TRUE),
(2, TRUE),
(3, TRUE),
(4, TRUE);

-- Insertar datos en la tabla revista
INSERT INTO revista (id_documento, disponible) VALUES
(5, TRUE),
(6, TRUE),
(7, TRUE),
(8, TRUE);

-- Insertar datos en la tabla usuarios
INSERT INTO usuarios (dni, nombre, apellido, direccion, telefono, email, tipo_usuario) VALUES
('12345678A', 'Juan', 'García', 'Calle Mayor 123', '123456789', 'juan@example.com', 'socio'),
('87654321B', 'María', 'López', 'Avenida Principal 456', '987654321', 'maria@example.com', 'ocasional'),
('45678912C', 'Carlos', 'Martínez', 'Plaza Central 789', '654321987', 'carlos@example.com', 'socio'),
('78912345D', 'Laura', 'Rodríguez', 'Calle Secundaria 321', '321654987', 'laura@example.com', 'ocasional');

-- Insertar datos en la tabla préstamos
INSERT INTO prestamos (id_usuario, id_documento, fecha_prestamo, fecha_devolucion, devuelto) VALUES
(1, 1, '2024-04-01', '2024-04-15', TRUE),
(2, 2, '2024-04-02', '2024-04-16', TRUE),
(3, 3, '2024-04-03', '2024-04-17', TRUE),
(4, 4, '2024-04-04', '2024-04-18', TRUE);
