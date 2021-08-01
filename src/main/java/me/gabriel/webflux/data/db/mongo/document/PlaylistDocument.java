package me.gabriel.webflux.data.db.mongo.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
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
}
