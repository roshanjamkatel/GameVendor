package com.group7ooec.gamevendor;

import com.group7ooec.gamevendor.model.BlogPost;
import com.group7ooec.gamevendor.model.Genre;
import com.group7ooec.gamevendor.repository.BlogPostRepository;
import com.group7ooec.gamevendor.repository.GenreRepository;
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

    public static void main(String[] args) {
        SpringApplication.run(GamevendorApplication.class, args);
    }

    @Override
    public void run(String ...args) throws Exception {
        genreRepository.deleteAll();
        blogPostRepository.deleteAll();

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

        // fetch all genres
        System.out.println("Genres found with findAll():");
        System.out.println("-------------------------------");
        for (Genre genre : genreRepository.findAll()) {
            System.out.println(genre);
        }
        System.out.println();

        // fetch all blog posts
        System.out.println("BlogPosts found with findAll():");
        System.out.println("-------------------------------");
        for (BlogPost post : blogPostRepository.findAll()) {
            System.out.println(post);
        }
        System.out.println();
    }

}
