package me.gabriel.webflux.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author daohn
 * @since 01/08/2021
 */
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Playlist {

  private Identity identity;
  @NonNull private String nome;
}
