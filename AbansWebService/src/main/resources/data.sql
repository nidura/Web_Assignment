DROP TABLE IF EXISTS item;

CREATE TABLE item (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  item_name VARCHAR(250) NOT NULL,
  brand VARCHAR(250) NOT NULL,
  unit_price VARCHAR(250) NOT NULL,
  logo_url VARCHAR(250) NOT NULL,
  color VARCHAR(250) DEFAULT NULL
);

INSERT INTO item (item_name,brand, unit_price,logo_url, color) VALUES
  ('Lap top i3', 'DELL', '300', '','black'),
    ('Lap top i3', 'HP', '300', '','white');