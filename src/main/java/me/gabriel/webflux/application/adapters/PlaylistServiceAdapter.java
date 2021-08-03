package me.gabriel.webflux.application.adapters;

import lombok.AllArgsConstructor;
import me.gabriel.webflux.application.api.dto.PlaylistDto;
import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import me.gabriel.webflux.core.ports.PlaylistRepository;
import me.gabriel.webflux.core.ports.PlaylistService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Service
@AllArgsConstructor
public class PlaylistServiceAdapter implements PlaylistService {

  private final PlaylistRepository playlistRepository;

  @Override public Mono<Playlist> save(PlaylistDto playlist) {
    return this.playlistRepository.save(new Playlist(playlist.getNome()));
  }

  @Override public Mono<Playlist> findById(String id) {
    return this.playlistRepository.findById(new Identity(id));
  }

  @Override public Mono<Identity> deleteById(String id) {
    return this.playlistRepository.deleteById(new Identity(id));
  }

  @Override public Flux<Playlist> findAll() {
    return playlistRepository.findAll();
  }
}
