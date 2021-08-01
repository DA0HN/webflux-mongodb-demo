package me.gabriel.webflux.core.ports;

import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;

import java.util.List;

/**
 * @author daohn
 * @since 01/08/2021
 */
public interface PlaylistRepository {

  Playlist save(Playlist playlist);
  Playlist findById(Identity identity);
  Identity deleteById(Identity identity);
  List<Playlist> findAll();
}
