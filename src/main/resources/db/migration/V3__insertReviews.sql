INSERT INTO reviews(game_id, user_id, rating, review)
VALUES (1, 1, 8, 'Love Fortnite');

INSERT INTO reviews(game_id, user_id, rating, review)
VALUES (1, 2, 8, 'I am Justin and I am CRACKED at Fortnite! Great game!');

INSERT INTO reviews(game_id, user_id, rating, review)
VALUES (2, 2, 8, 'Warzone is the best COD of this generation! Grew up playing all of them and this one is perfect!');

INSERT INTO reviews(game_id, user_id, rating, review)
VALUES (3, 3, 8, 'Okay, so if you never played any FPS this is the one to play! CSGO fan? This one as well! I can not wait until I am as good as Calatlas in Valorant!');

INSERT INTO reviews(game_id, user_id, rating, review)
VALUES (3, 4, 8, 'Love the game! I keep seeing Halfmoon at the leaderboard and my goal is to beat him in a tournement with no cheating!');


-- Users Migration

INSERT INTO authority(name, id) 
VALUES ('ROLE_ADMIN', 1);

INSERT INTO authority(name, id) 
VALUES ('ROLE_USER', 2);

INSERT INTO users_authority(authority_id, user_id) 
VALUES (1, 1);

INSERT INTO users_authority(authority_id, user_id) 
VALUES (2, 2);


-- Hash is a 12 round iteration of BCrypt, it comes out to password (for both users!)
INSERT INTO users (id, username, password)
VALUES (DEFAULT,'admin', '$2y$12$tWu1dcvBj5pX4/HZVs9/ZOucMWeGwFG40t67L8kKQmBq26mPCWPZu'); 

INSERT INTO users (id, username, password)
VALUES (DEFAULT,'user', '$2y$12$tWu1dcvBj5pX4/HZVs9/ZOucMWeGwFG40t67L8kKQmBq26mPCWPZu');
