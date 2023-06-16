package dev.bitan.SpringBootThymeleafForm.user.repository;

import dev.bitan.SpringBootThymeleafForm.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
