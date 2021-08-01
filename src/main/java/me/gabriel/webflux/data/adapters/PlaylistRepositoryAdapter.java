package me.gabriel.webflux.data.adapters;

import lombok.AllArgsConstructor;
import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import me.gabriel.webflux.core.ports.PlaylistRepository;
import me.gabriel.webflux.data.db.mongo.repositories.ReactivePlaylistRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Repository
@AllArgsConstructor
public class PlaylistRepositoryAdapter implements PlaylistRepository {

  private final ReactivePlaylistRepository playlistRepository;

  @Override public Playlist save(Playlist playlist) {
    return null;
  }

  @Override public Playlist findById(Identity identity) {
    return null;
  }

  @Override public Identity deleteById(Identity identity) {
    return null;
  }

  @Override public List<Playlist> findAll() {
    return null;
  }

}
