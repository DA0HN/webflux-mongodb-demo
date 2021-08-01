package me.gabriel.webflux.application.adapters;

import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import me.gabriel.webflux.core.ports.PlaylistService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Service
public class PlaylistServiceAdapter implements PlaylistService {
  @Override public Mono<Playlist> save(Playlist playlist) {
    return null;
  }

  @Override public Mono<Playlist> findById(Identity id) {
    return null;
  }

  @Override public Mono<Identity> deleteById(Identity id) {
    return null;
  }

  @Override public Flux<Playlist> findAll() {
    return null;
  }
}
