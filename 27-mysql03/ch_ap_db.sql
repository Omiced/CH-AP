-- Creando DB con MySQL
-- La convención de escritura en SQL es snake_case
CREATE DATABASE ch_ap;

-- Indicarle a MySQL que voy a utilizar la DB que acabo de crear
USE ch_ap;

-- Crear tablas en nuestra DB. Se le nombren en plural
CREATE TABLE users (
	id_user INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    email VARCHAR(60) NOT NULL,
    phone VARCHAR(20),
    password VARCHAR(60) NOT NULL
);

-- Crear la tabla orders, pero la vamos a eliminar posteriormente. 
CREATE TABLE orders (
	id_order INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(120)
);

-- Vamos a eliminar la tabla orders con DROP
DROP TABLE orders;

-- Crear tabla para modificar posteriormente
CREATE TABLE products (
	id_product INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60) NOT NULL,
    description VARCHAR(180) NOT NULL,
    price DOUBLE NOT NULL,
    availability VARCHAR(10) NOT NULL
);

-- Modificar tabla products
-- ALTER TABLE (ADD, MODIFY, DROP)
ALTER TABLE products MODIFY COLUMN availability BOOLEAN NOT NULL;

ALTER TABLE products ADD COLUMN test VARCHAR(100);

ALTER TABLE products DROP COLUMN test;

-- Agregar datos a mis tablas de la DB
INSERT INTO users (id_user, name, email, phone, password) 
VALUE
(5, "Daniel Maldonado", "daniel@gmail.com", "+52 9932111111", "genmx123");

INSERT INTO users (id_user, name, email, phone, password) 
VALUE
(8, "Luis Ramos", "l.ramos@gmail.com", "+52 5588223366", "mexico1"),
(9, "Orlando Lopez", "orlando.l@gmail.com", "+52 721 022 1253", "realmadrid");

-- Consultar los datos de la tabla users
	SELECT * FROM users;

-- Agregando datos a la tabla products
INSERT INTO products (name, description, price, availability)
value
('Oppo Reno 10x zoom', 'Maecenas pulvinar lobortis est.', 5237.3, true),
('BLU Gol', 'Nullam sit amet turpis elementum ligula vehicula consequat.', 6995.0, false),
('alcatel 1S (2021)', 'Suspendisse accumsan tortor quis turpis.', 24690.0, false),
('Gionee P12', 'Integer ac neque.', 12502.0, false),
('Sony Xperia XA Dual', 'Quisque id justo sit amet sapien dignissim vestibulum.', 9642.8, false),
('Micromax Bolt Supreme Q300', 'Nulla ut erat id mauris vulputate elementum.', 4410.1, false),
('Samsung S8530 Wave II', 'Nullam porttitor lacus at turpis.', 17530.7, true),
('Archos 50 Platinum', 'Vestibulum ac est lacinia nisi venenatis tristique.', 17387.2, false),
('Samsung G800', 'Suspendisse potenti.', 10593.4, false),
('Qtek S200', 'Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', 9117.9, false),
('Oppo A12e', 'Nullam porttitor lacus at turpis.', 20997.7, true),
('OnePlus 7T Pro 5G McLaren', 'Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', 13286.4, true),
('Samsung C270', 'Nulla mollis molestie lorem.', 15117.7, false),
('alcatel OT 757', 'Maecenas pulvinar lobortis est.', 15250.0, false),
('XOLO Q800', 'Aliquam erat volutpat.', 11939.5, false),
('Allview V2 Viper X+', 'Curabitur convallis.', 12034.4, false),
('Celkon A7', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.', 2880.8, false),
('i-mate JASJAM', 'Aliquam sit amet diam in magna bibendum imperdiet.', 23932.5, false),
('Gionee F5', 'Morbi quis tortor id nulla ultrices aliquet.', 23580.4, false),
('Motorola W230', 'Sed accumsan felis.', 24042.2, false);

SELECT * FROM products;

-- Crear tablas para que los usuarios puedan comprar productos en una ecommerce
	-- users, products, reviews, orders, order_details, shopping_cart
-- Crear tablas para el proyecto integrador
	-- Shops, payment_details, wallet, roles, providers
	-- posts, user_preferences

-- Eliminar la DB
DROP SCHEMA ch_ap;


