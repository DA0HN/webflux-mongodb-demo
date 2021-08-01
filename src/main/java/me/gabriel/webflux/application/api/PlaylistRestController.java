package me.gabriel.webflux.application.api;

import lombok.AllArgsConstructor;
import me.gabriel.webflux.core.domain.Playlist;
import me.gabriel.webflux.core.ports.PlaylistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author daohn
 * @since 01/08/2021
 */
@RestController
@AllArgsConstructor
@RequestMapping("/playlists")
public class PlaylistRestController {

  private final PlaylistService playlistService;

  @GetMapping
  public Flux<Playlist> findAll() {
    return playlistService.findAll();
  }

}
