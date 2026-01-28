
-- sample users
INSERT INTO users (email, password, firstname, lastname) VALUES ('alice@pepsico.com', 'Test@123', 'Alice', 'Hood');
INSERT INTO users (email, password, firstname, lastname) VALUES ('bob@pepsico.com', 'Test@123', 'Bob', 'Peter');
INSERT INTO users (email, password, firstname, lastname) VALUES ('carol@pepsico.com', 'Test@123', 'Carlo', 'Hek');
INSERT INTO users (email, password, firstname, lastname) VALUES ('eric@pepsico.com', 'Test@123', 'Eric', 'Toal');

-- sample orders
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Lay''s Classic Sea Salt Chips', 2, 4.99, 9.98, 'CREATED', '01-11-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Doritos Spicy Jalapeño Poppers', 1, 5.49, 5.49, 'CREATED', '02-12-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Cheetos Cheddar Cheese Puffs', 3, 3.99, 11.97, 'CREATED', '03-09-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Smartfood Dark Chocolate Almonds', 1, 6.99, 6.99, 'CREATED', '04-01-2026');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Rold Gold Pretzel', 2, 3.49, 6.98, 'CREATED', '05-8-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Fritos Corn Chips', 4, 2.99, 11.96, 'CREATED', '06-7-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Simply Mixed Berry Trail Mix', 1, 7.99, 7.99, 'CREATED', '07-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Tostitos Matcha Energy Bites', 2, 8.49, 16.98, 'CREATED', '08-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Smartfood Salted Caramel Popcorn', 1, 5.99, 5.99, 'CREATED', '09-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('alice@pepsico.com', 'Chester''s Honey BBQ Beef Jerky', 1, 9.99, 9.99, 'CREATED', '10-01-2025');

INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Doritos Spicy Jalapeño Poppers', 2, 5.49, 10.98, 'CREATED', '01-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Smartfood Dark Chocolate Almonds', 1, 6.99, 6.99, 'CREATED', '02-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Funyuns Onion Rings', 3, 3.99, 11.97, 'CREATED', '03-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Lay''s Classic Sea Salt Chips', 1, 4.99, 4.99, 'CREATED', '04-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Cheetos Cheddar Cheese Puffs', 2, 3.99, 7.98, 'CREATED', '05-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Fritos Corn Chips', 5, 2.99, 14.95, 'CREATED', '06-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Rold Gold Pretzel', 1, 3.49, 3.49, 'CREATED', '07-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Smartfood Salted Caramel Popcorn', 2, 5.99, 11.98, 'CREATED', '08-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Tostitos Matcha Energy Bites', 1, 8.49, 8.49, 'CREATED', '09-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('bob@pepsico.com', 'Simply Mixed Berry Trail Mix', 1, 7.99, 7.99, 'CREATED', '10-01-2025');

INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Smartfood Dark Chocolate Almonds', 2, 6.99, 13.98, 'CREATED', '01-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Cheetos Cheddar Cheese Puffs', 1, 3.99, 3.99, 'CREATED', '02-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Lay''s Classic Sea Salt Chips', 2, 4.99, 9.98, 'CREATED', '03-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Simply Mixed Berry Trail Mix', 1, 7.99, 7.99, 'CREATED', '04-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Tostitos Matcha Energy Bites', 1, 8.49, 8.49, 'CREATED', '05-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Fritos Corn Chips', 3, 2.99, 8.97, 'CREATED', '06-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Rold Gold Pretzel', 1, 3.49, 3.49, 'CREATED', '07-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Smartfood Salted Caramel Popcorn', 2, 5.99, 11.98, 'CREATED', '08-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Chester''s Honey BBQ Beef Jerky', 1, 9.99, 9.99, 'CREATED', '09-01-2025');
INSERT INTO orders (useremail, productname, quantity, price, totalprice, status, orderdate) VALUES ('carol@pepsico.com', 'Funyuns Onion Rings', 2, 3.99, 7.98, 'CREATED', '10-01-2025');
