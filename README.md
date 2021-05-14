# GameVendor
Application where users can access game content online

# How to run
- `cd database/docker`
- `docker-compose up -d`
- if first time, `docker exec -it data-postgres psql -Upostgres`
- `create DATABASE gamevendor;`
- Go to GamevendorApplication and run
- visit `http://localhost:8080/`
- To see data you can use a tool like https://tableplus.com/

#Tables
- games (Sql) -> any game across any os/console
- users (Sql) -> authenticated user
- library (sql) -> users library of owned games
- wishlist (sql) -> users wishlist of games
- friends (sql) -> one to one relationship of users
- reviews (Sql) -> review of a game made by a user
- points (Sql) -> Points for a certain user
- stats (Sql) -> how many current players are online playing certain games
- genres (NoSql) -> types of games
- forum_topics (Nosql) -> forum topics (i.e. "Help")
- forum_posts (Nosql) -> forum posts made by users
- blog_posts (NoSql) -> updates for the community made by the GameVendor team
- shopping cart (Sql) -> Users can add/edit/remove games on the cart
- 
