
-- create table (optional if Hibernate creates schema)
CREATE TABLE IF NOT EXISTS users (
  email VARCHAR(255) PRIMARY KEY,
  password VARCHAR(255) NOT NULL,
  firstname VARCHAR(255) NOT NULL,
  lastname VARCHAR(255) NOT NULL
);

-- create table (optional if Hibernate creates schema)
CREATE TABLE IF NOT EXISTS orders (
  orderid BIGINT AUTO_INCREMENT PRIMARY KEY,
  useremail VARCHAR(255) NOT NULL,
  productname VARCHAR(255) NOT NULL,
  quantity INT NOT NULL,
  price DECIMAL(10,2) NOT NULL,
  totalprice DECIMAL(10,2) NOT NULL,
  status VARCHAR(50) NOT NULL,
  orderdate VARCHAR(20) NOT NULL
);

-- create table (optional if Hibernate creates schema)
CREATE TABLE IF NOT EXISTS nudge (
  nudgeid BIGINT AUTO_INCREMENT PRIMARY KEY,
  useremail VARCHAR(255) NOT NULL,
  productname VARCHAR(255) NOT NULL,
  nudgetype INT NOT NULL
);