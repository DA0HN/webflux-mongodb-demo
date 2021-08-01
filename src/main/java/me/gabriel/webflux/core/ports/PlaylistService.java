package me.gabriel.webflux.core.ports;

import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author daohn
 * @since 01/08/2021
 */
public interface PlaylistService {

  Mono<Playlist> save(Playlist playlist);
  Mono<Playlist> findById(Identity id);
  Mono<Identity> deleteById(Identity id);
  Flux<Playlist> findAll();

}
