package me.gabriel.webflux.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Data
@NoArgsConstructor
public class Playlist {

  private Identity identity;
  private String nome;

}
