
-- База данных
CREATE DATABASE minibasefortests;

-- Таблица
CREATE TABLE IF NOT EXISTS clients
( id INTEGER NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

