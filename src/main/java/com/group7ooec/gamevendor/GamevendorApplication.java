package com.group7ooec.gamevendor;

import com.group7ooec.gamevendor.model.BlogPost;
import com.group7ooec.gamevendor.model.ForumPost;
import com.group7ooec.gamevendor.model.ForumTopic;
import com.group7ooec.gamevendor.model.Game;
import com.group7ooec.gamevendor.model.Genre;
import com.group7ooec.gamevendor.model.Reviews;
import com.group7ooec.gamevendor.repository.BlogPostRepository;
import com.group7ooec.gamevendor.repository.ForumPostRepository;
import com.group7ooec.gamevendor.repository.ForumTopicRepository;
import com.group7ooec.gamevendor.repository.GameRepository;
import com.group7ooec.gamevendor.repository.GenreRepository;
import com.group7ooec.gamevendor.repository.ReviewRepository;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GamevendorApplication implements CommandLineRunner {

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private ForumTopicRepository forumTopicRepository;

    @Autowired
    private ForumPostRepository forumPostRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    public static void main(String[] args) {
        SpringApplication.run(GamevendorApplication.class, args);
    }

    @Override
    public void run(String ...args) throws Exception {
        genreRepository.deleteAll();
        blogPostRepository.deleteAll();
        forumTopicRepository.deleteAll();
        forumPostRepository.deleteAll();

        //Add Genres
        genreRepository.save(new Genre("Battle Royale", "fn.jpeg"));
        genreRepository.save(new Genre("Tactical Shooter", "valorant.jpeg"));
        genreRepository.save(new Genre("FPS", "cod.jpeg"));
        genreRepository.save(new Genre("Strategy", "aoe.jpeg"));

        //Add Blog Posts
        blogPostRepository.save(new BlogPost("Colin McAtee", "Video games are a passion of mine. We build GameVendor to scratch out own itch", "Why we build GameVendor", "This is why we built GameVendor", "why-we-built-gameVendor.png"));

        blogPostRepository.save(new BlogPost("Roshan Jamkatel", "SpringBoot was the obvious choice to build the app. There are other options but SpringBoot is superior.", "How we built GameVendor.", "This is how we built GameVendor", "how-we-built-gameVendor.png"));

        blogPostRepository.save(new BlogPost("Andy", "Steam has been around for years. GameVendor will be the modern gaming library users will love for years to come.", "GameVendor vs Steam", "This is why GameVendor is better than steam", "steam-vs-gameVendor.png"));

        blogPostRepository.save(new BlogPost("Mosi", "GameVendor is simple for now. Our MVP was made to validate the idea. We are super excited to share what is coming next", "What's Next for GameVendor", "The future of GameVendor is bright", "future-of-gameVendor.png"));

        //Add Topics
        ForumTopic topicOne = new ForumTopic("Support", "support.png");
        forumTopicRepository.save(topicOne);
        ForumTopic topicTwo = new ForumTopic("Gaming", "gaming.png");
        forumTopicRepository.save(topicTwo);
        ForumTopic topicThree = new ForumTopic("Community", "community.png");
        forumTopicRepository.save(topicThree);

        //Add Posts
        forumPostRepository.save(new ForumPost(topicTwo.id, "Ninja", "Fortnite is the best Game Ever", "I Love Fortnite"));
        forumPostRepository.save(new ForumPost(topicOne.id, "Bad User", "How do I log in to this app?", "Confused on how to log in"));
        forumPostRepository.save(new ForumPost(topicThree.id, "TimTheTatMan", "Make sure to buy a Herman Miller Chair #Ad", "Herman Miller is the best #Ad"));
        
    }

    private static final Logger log = LoggerFactory.getLogger(GamevendorApplication.class);

    @Bean
    public CommandLineRunner log(GenreRepository repository){
        return (args) -> {
            // fetch all genres
            log.trace("Trace info");
            log.info("Genres found with findAll():");
            log.info("-------------------------------");
            for (Genre genre : genreRepository.findAll()) {
                log.info(genre.toString());
            }
            log.info("");

            // fetch all blog posts
            log.info("BlogPosts found with findAll():");
            log.info("-------------------------------");
            for (BlogPost post : blogPostRepository.findAll()) {
                log.info(post.toString());
            }
            log.info("");

            // fetch all forum topics
            log.info("ForumTopics found with findAll():");
            log.info("-------------------------------");
            for (ForumTopic topic : forumTopicRepository.findAll()) {
                log.info(topic.toString());
            }
            log.info("");

            // fetch all forum posts
            log.info("ForumPosts found with findAll():");
            log.info("-------------------------------");
            for (ForumPost post : forumPostRepository.findAll()) {
                log.info(post.toString());
            }
            log.info("");

            // fetch all games
            log.info("Games found with findAll():");
            log.info("-------------------------------");
            for (Game game : gameRepository.findAll()) {
                log.info(game.toString());
            }
            log.info("");

            // reviews
            // fetch all reviews
            log.info("Reviews found with findAll():");
            log.info("-------------------------------");
            for (Reviews review : reviewRepository.findAll()) {
                log.info(review.toString());
            }
            log.info("");
        };
    }

}
