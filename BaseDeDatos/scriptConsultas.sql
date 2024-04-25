# Devuelve todos los libros
SELECT * FROM documento as d JOIN libro as l ON d.id = l.id_documento;

# Devuelve todas las revistas
SELECT * FROM documento as d JOIN revista as r ON d.id = r.id_documento;

# Devuelve un usuarios con ese dni
SELECT * FROM biblioteca.usuario where dni like "%5%" limit 1;

# Devuelve todo la informacion de los usuarios y con sus prestamos que SI estan en plazo
SELECT * FROM prestamo as p  JOIN usuario as u ON p.id_usuario = u.id 
WHERE (Date(p.fecha_prestamo) + interval p.duracion_prestamo DAY) > Date(now());

# Devuelve todo la informacion de los usuarios y con sus prestamos que NO estan en plazo
SELECT * FROM prestamo as p  JOIN usuario as u ON p.id_usuario = u.id 
WHERE (Date(p.fecha_prestamo) + interval p.duracion_prestamo DAY) < Date(now());
