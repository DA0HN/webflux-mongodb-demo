package me.gabriel.webflux.data.db.mongo.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.gabriel.webflux.core.domain.Identity;
import me.gabriel.webflux.core.domain.Playlist;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Getter
@Setter
@Document
@ToString(callSuper = true)
public class PlaylistDocument extends BaseDocument {

  private String nome;

  public PlaylistDocument(String id, String nome) {
    super(id);
    this.nome = nome;
  }

  public static PlaylistDocument fromDomain(Playlist playlist) {
    return new PlaylistDocument(playlist.getIdentity().getId(), playlist.getNome());
  }

  public Playlist toDomain() {
    return new Playlist(new Identity(this.getId()), this.getNome());
  }
}
