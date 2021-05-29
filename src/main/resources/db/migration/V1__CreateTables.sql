-- Game Table
CREATE TABLE games
(
    id               SERIAL         NOT NULL PRIMARY KEY,
    name             VARCHAR(100) NOT NULL,
    image            VARCHAR(100),
    genre            VARCHAR(100) NOT NULL,
    rating           int,
    price            int          NOT NULL,
    operating_system VARCHAR(100) NOT NULL,
    summary text
);

-- Friends Table
CREATE TABLE friends
(
    user_1_id int NOT NULL,
    user_2_id int NOT NULL
);

-- Library Table
CREATE TABLE library
(
    game_id int NOT NULL,
    user_id int NOT NULL
);

-- Users Table
CREATE TABLE users
(
    id       SERIAL          NOT NULL PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    date_created timestamp default current_timestamp
);

-- Authority
create table authority (
    id serial primary key,
    name varchar(15)
);

create table users_authority (
    authority_id int,
    user_id int
);

-- Points Table
CREATE TABLE points
(
    user_id int NOT NULL,
    points  int NOT NULL DEFAULT 0
);

-- Reviews Tabel
CREATE TABLE reviews
(
    id      SERIAL NOT NULL PRIMARY KEY,
    game_id int NOT NULL,
    user_id int NOT NULL,
    rating  int NOT NULL,
    review  text,
    FOREIGN KEY (game_id) REFERENCES games(id)
);

-- stats table
CREATE TABLE stats
(
    game_id        int NOT NULL,
    players_online int NOT NULL DEFAULT 0
);

-- wishlist table
CREATE TABLE wishlist
(
    game_id int NOT NULL,
    user_id int NOT NULL
);