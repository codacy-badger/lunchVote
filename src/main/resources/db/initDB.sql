-- Dropping existing tables
DROP TABLE IF EXISTS votes;
DROP TABLE IF EXISTS dishes;
DROP TABLE IF EXISTS menus;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

-- Sequence: global_seq
CREATE SEQUENCE  global_seq START 100000;


-- Table: users
CREATE TABLE users(
    id INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('global_seq'),
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    CONSTRAINT users_unique_username_idx UNIQUE (username)
);

-- Table for mapping users and their roles: user_roles
CREATE TABLE user_roles(
    user_id INTEGER NOT NULL,
    role INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT user_roles_unique_user_role_idx UNIQUE (user_id, role)
);

-- Table: restaurants
CREATE TABLE restaurants(
    id INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR(255) NOT NULL,
    CONSTRAINT restaurants_unique_name_idx UNIQUE (name)
);

-- Table: menus
CREATE TABLE menus (
    id INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('global_seq'),
    target_date DATE NOT NULL,
    restaurant_id INTEGER NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES restaurants(id) ON DELETE CASCADE
);

-- Table: dishes
CREATE TABLE dishes (
    id INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    menu_id INTEGER NOT NULL,
    FOREIGN KEY (menu_id) REFERENCES menus(id) ON DELETE CASCADE
);

-- Table: votes
CREATE TABLE votes(
    id INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('global_seq'),
    user_id INTEGER NOT NULL,
    restaurant_id INTEGER NOT NULL,
    local_date_time TIMESTAMP NOT NULL DEFAULT now(),
    target_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (restaurant_id) REFERENCES restaurants(id) ON DELETE CASCADE,
    CONSTRAINT votes_unique_user_id_target_date_idx UNIQUE (user_id, target_date)
);



