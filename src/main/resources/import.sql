INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'jonathan', 'Rojas', 'jonathan31@gmail.com', '2020-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'pablo', 'perez', 'pablo1@gmail.com', '2020-03-01');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jonathan', '$2a$10$kGqR7z5nomA41ElP3MkaAOZeLu2m51wy8lhkxs4xWjhtwTLYEEsJG', 1, "Jonathan", "Rojas", "jonathanrojas31@gmail.com");
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$pu8mbcxh.7hFcIBLurJ1.OSH5QheYMfDVpCkvYJy4iNjrETr1YXjm', 1, "Hannah", "Rojas", "hannah@gmail.com");

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);

INSERT INTO productos (nombre, precio, create_at) VALUES ('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Sony Camara Digital DSC', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Ipod', 130000, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1,1,1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2,1,3);