package me.gabriel.webflux.application.config;

import lombok.AllArgsConstructor;
import me.gabriel.webflux.data.db.mongo.document.PlaylistDocument;
import me.gabriel.webflux.data.db.mongo.repositories.ReactivePlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.UUID;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Configuration
@AllArgsConstructor
public class DatabaseInitializer implements CommandLineRunner {

  private final ReactivePlaylistRepository playlistRepository;

  @Override public void run(String... args) {

    var notHavePlaylistRegistered = playlistRepository.count().blockOptional().orElse(0L) == 0;

    if(notHavePlaylistRegistered) {
      playlistRepository.deleteAll()
        .thenMany(
          Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
                    "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework"
            )
            .map(name -> new PlaylistDocument(UUID.randomUUID().toString(), name))
            .flatMap(playlistRepository::save)
        ).subscribe(System.out::println);
    }
  }
}
