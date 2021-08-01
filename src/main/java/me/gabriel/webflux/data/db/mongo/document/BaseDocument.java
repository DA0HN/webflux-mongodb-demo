package me.gabriel.webflux.data.db.mongo.document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Document
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDocument {

  @Id
  private String id;

}
