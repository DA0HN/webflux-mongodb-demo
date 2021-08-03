package me.gabriel.webflux.core.ports;

import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author daohn
 * @since 01/08/2021
 */
public interface PlaylistRepository {

  Mono<Playlist> save(Playlist playlist);
  Mono<Playlist> findById(Identity identity);
  Mono<Identity> deleteById(Identity identity);
  Flux<Playlist> findAll();
}
