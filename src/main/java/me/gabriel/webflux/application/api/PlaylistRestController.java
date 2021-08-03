package me.gabriel.webflux.application.api;

import lombok.AllArgsConstructor;
import me.gabriel.webflux.application.api.dto.PlaylistDto;
import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import me.gabriel.webflux.core.ports.PlaylistService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

  @GetMapping("/{id}")
  public Mono<Playlist> findById(@PathVariable String id) {
    return playlistService.findById(id);
  }

  @DeleteMapping("/{id}")
  public Mono<Identity> deleteById(@PathVariable String id) {
    return playlistService.deleteById(id);
  }

  @PostMapping
  public Mono<Playlist> save(@RequestBody PlaylistDto playlist) {
    return playlistService.save(playlist);
  }

}
