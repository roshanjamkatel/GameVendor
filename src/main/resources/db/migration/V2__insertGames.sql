INSERT INTO games (name, image, genre, rating, price ,operating_system, summary)
VALUES ('Fortnite', 'fn.jpeg', 'Battle Royale', 8, 0, 'pc,xbox,playstation', 'Fortnite Battle Royale is a competitive shooter between 100 players as they air-drop out of a moving “battle bus,” then fight to survive as the play area slowly shrinks, forcing people into combat.');

INSERT INTO games (name, image, genre, rating, price ,operating_system, summary)
VALUES ('Call of Duty Warzone', 'warzone.jpeg', 'Battle Royale', 9, 0, 'pc,xbox,playstation', 'Warzone allows online multiplayer combat among 150 players, although some limited-time game modes support 200 players. The game features both cross-platform play and cross-platform progression between three games. The game features three main modes: Plunder, Resurgence, and Battle Royale.');

INSERT INTO games (name, image, genre, rating, price ,operating_system, summary)
VALUES ('Valorant', 'valorant.jpeg', 'Tactical Shooter', 8, 0, 'pc', 'Valorant is a team-based tactical shooter and first-person shooter set in the near future. Players play as one of a set of agents, characters designed based on several countries and cultures around the world.');

INSERT INTO games (name, image, genre, rating, price ,operating_system, summary)
VALUES ('Resident Evil Village', 'rev.jpg', 'Survival game', 9, 69.99, 'pc,xbox,playstation', 'The sequel to Resident Evil 7: Biohazard, players control Ethan Winters, who is searching for his kidnapped daughter; after a fateful encounter with Chris Redfield, he finds himself in a village filled with mutant creatures.');

INSERT INTO games (name, image, genre, rating, price ,operating_system, summary)
VALUES ('Minecraft', 'minecraft.jpg', 'Survival game', 10, 19.99, 'pc,xbox,playstation', 'Minecraft is a sandbox video game developed by Mojang.');

INSERT INTO games (name, image, genre, rating, price ,operating_system, summary)
VALUES ('Grand Theft Auto V', 'gtav.jpg', 'Multiplayer', 10, 19.99, 'pc,xbox,playstation', 'Grand Theft Auto V is a 2013 action-adventure game developed by Rockstar North and published by Rockstar Games. It is the first main entry in the Grand Theft Auto series since 2008s Grand Theft Auto IV.');

INSERT INTO shopping_cart(id, game_id, price, quantity, image, name)
VALUES (2, 1, 0, 1, 'warzone.jpeg', 'Warzone');

INSERT INTO shopping_cart(id, game_id, price, quantity, image, name)
VALUES (1, 1, 0, 1, 'fn.jpeg', 'Fortnite');

INSERT INTO shopping_cart(id, game_id, price, quantity, image, name)
VALUES (3, 1, 0, 1, 'valorant.jpeg', 'Valorant');

INSERT INTO shopping_cart(id, game_id, price, quantity, image, name)
VALUES (4, 1, 69.99, 1, 'rev.jpg', 'Resident Evil Village');

INSERT INTO shopping_cart(id, game_id, price, quantity, image, name)
VALUES (5, 1, 1, 19.99, 'minecraft.jpg', 'Minecraft');

INSERT INTO shopping_cart(id, game_id, price, quantity, image, name)
VALUES (6, 1, 1, 19.99, 'gtav.jpg', 'Grand Theft Auto V');






