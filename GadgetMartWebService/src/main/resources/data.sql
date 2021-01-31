DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS order_details;

CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mobile_no VARCHAR(250) NOT NULL,
  status VARCHAR(250) DEFAULT NULL
);

CREATE TABLE client (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  company_name VARCHAR(250) NOT NULL,
  url VARCHAR(250) NOT NULL,
  joined_date DATE NOT NULL,
  status VARCHAR(250) DEFAULT NULL
);


CREATE TABLE orders (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  order_date_time DATE NOT NULL,
  user_id VARCHAR(250) NOT NULL,
  order_amount VARCHAR(250) DEFAULT NULL
);

CREATE TABLE order_details (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  order_id VARCHAR(250) NOT NULL,
  item_code VARCHAR(250) NOT NULL,
  item_name VARCHAR(250) NOT NULL,
  qty VARCHAR(250) NOT NULL,
  unit_price VARCHAR(250) DEFAULT NULL
);


INSERT INTO users (first_name, last_name,mobile_no, status) VALUES
  ('Aliko', 'Dangote', '0775544825', 'Billionaire Industrialist'),
  ('Bill', 'Gates', '0775544825', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', '0775544825', 'Billionaire Oil Magnate');