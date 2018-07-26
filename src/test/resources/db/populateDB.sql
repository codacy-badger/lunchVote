-- Emptying existing tables
DELETE FROM votes;
DELETE FROM dishes;
DELETE FROM menus;
DELETE FROM restaurants;
DELETE FROM user_roles;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users(username, password) VALUES
  ('admin', 'adminpassword'),
  ('user', 'userpassword');

INSERT INTO user_roles(user_id, role) VALUES
  (100000, 0),
  (100000, 1),
  (100001, 1);

INSERT INTO restaurants(name) VALUES
  ('Кафе ДЕПО'),
  ('Ресторан БИРХАУЗ');

INSERT INTO menus(target_date, restaurant_id) VALUES
  ('2018-07-26', 100002),
  ('2018-07-26', 100003);

INSERT INTO dishes(name, price, menu_id) VALUES
  ('Греческий салат', 40, 100004),
  ('Куриный бульон', 34, 100004),
  ('Бифштекс из телятины', 48, 100004),
  ('Помидоры с грилированными кабачками', 35, 100005),
  ('Суп гороховый', 30, 100005),
  ('Куриное филе по-французски', 43, 100005);

INSERT INTO votes(user_id, restaurant_id, local_date_time, target_date) VALUES
  (100000, 100002, '2018-07-26 09:00:00', '2018-07-26'),
  (100001, 100003, '2018-07-26 10:30:00', '2018-07-26');