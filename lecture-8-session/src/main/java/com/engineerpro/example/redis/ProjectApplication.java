package com.engineerpro.example.redis;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.engineerpro.example.redis.model.Article;
import com.engineerpro.example.redis.model.Category;
import com.engineerpro.example.redis.model.Comment;
import com.engineerpro.example.redis.model.Post;
import com.engineerpro.example.redis.model.Profile;
import com.engineerpro.example.redis.repository.ArticleRepository;
import com.engineerpro.example.redis.repository.CategoryRepository;
import com.engineerpro.example.redis.repository.CommentRepository;
import com.engineerpro.example.redis.repository.PostRepository;
import com.engineerpro.example.redis.repository.ProfileRepository;
import com.google.common.collect.Lists;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ProjectApplication {

	static CategoryRepository categoryRepository;
	static ArticleRepository articleRepository;
	static ProfileRepository profileRepository;
	static PostRepository postRepository;
	static CommentRepository commentRepository;

	static Category createCategory(String name) {
		Category category = Category.builder().name(name).build();
		categoryRepository.save(category);
		log.info("created category {}={}", category.getId(), category.getName());
		return category;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectApplication.class, args);

		categoryRepository = context.getBean(CategoryRepository.class);
		articleRepository = context.getBean(ArticleRepository.class);
		profileRepository = context.getBean(ProfileRepository.class);
		postRepository = context.getBean(PostRepository.class);
		commentRepository = context.getBean(CommentRepository.class);

		try {
			Profile profile = profileRepository.save(Profile.builder()
					.id(1)
					.username("manhdx")
					.bio("about me")
					.profileImageUrl("")
					.build());
			Profile profile2 = profileRepository.save(Profile.builder()
					.id(1)
					.username("engineerpro")
					.bio("about me")
					.profileImageUrl("")
					.build());
			List<Profile> likes = new ArrayList<>();
			likes.add(profile);
			likes.add(profile2);
			Post post = postRepository.save(Post.builder()
					.caption("this is a new post")
					.createdBy(profile)
					.userLikes(likes)
					.createdAt(new Date(1702467003000L))
					.build());
			commentRepository.save(Comment.builder()
					.post(post)
					.comment("this is a comment")
					.build());
			// Category entertainmentCategory = createCategory("Entertainment");
			// Category sportCategory = createCategory("Sport");

			// articleRepository
			// .save(Article.builder().url("spider-man-live-action")
			// .title("Spider-Man: Live-Action")
			// .content("...").category(entertainmentCategory).build());

			// articleRepository
			// .save(Article.builder().url("superman")
			// .title("Superman")
			// .content("...").category(entertainmentCategory).build());
		} catch (Exception e) {
			log.error("Cannot create seed data");
		}
	}

}
