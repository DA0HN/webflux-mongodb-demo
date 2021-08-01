package me.gabriel.webflux.data.db.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Document
@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class BaseDocument {

  @Id
  private String id;

}
