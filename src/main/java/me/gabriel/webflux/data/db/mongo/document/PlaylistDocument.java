package me.gabriel.webflux.data.db.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Getter
@Document
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistDocument extends BaseDocument {

  private String nome;

}
