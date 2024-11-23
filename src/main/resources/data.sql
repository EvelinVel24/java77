INSERT INTO usuario (username, password, rol) VALUES 
('admin', '{bcrypt}password_encriptado', 'ADMIN'),
('cliente', '{bcrypt}password_encriptado', 'CLIENTE');

INSERT INTO producto (nombre, descripcion, precio) VALUES 
('Martillo', 'Martillo de acero', 150.0),
('Taladro', 'Taladro eléctrico', 850.0);
