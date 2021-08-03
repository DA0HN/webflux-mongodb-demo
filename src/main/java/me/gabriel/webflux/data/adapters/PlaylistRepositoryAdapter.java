package me.gabriel.webflux.data.adapters;

import lombok.AllArgsConstructor;
import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import me.gabriel.webflux.core.ports.PlaylistRepository;
import me.gabriel.webflux.data.db.mongo.document.PlaylistDocument;
import me.gabriel.webflux.data.db.mongo.repositories.ReactivePlaylistRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Repository
@AllArgsConstructor
public class PlaylistRepositoryAdapter implements PlaylistRepository {

  private final ReactivePlaylistRepository playlistRepository;

  @Override public Mono<Playlist> save(Playlist playlist) {
    return this.playlistRepository
      .save(PlaylistDocument.fromDomain(playlist))
      .map(PlaylistDocument::toDomain)
      .log();
  }

  @Override public Mono<Playlist> findById(Identity identity) {
    return this.playlistRepository.findById(identity.getId())
      .map(PlaylistDocument::toDomain)
      .log();
  }

  @Override public Mono<Identity> deleteById(Identity identity) {
    this.playlistRepository.deleteById(identity.getId());
    return Mono.just(identity);
  }

  @Override public Flux<Playlist> findAll() {
    return this.playlistRepository
      .findAll()
      .map(PlaylistDocument::toDomain)
      .log();
  }

}
