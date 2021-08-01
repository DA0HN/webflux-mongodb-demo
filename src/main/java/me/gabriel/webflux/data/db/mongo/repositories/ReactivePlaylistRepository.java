package me.gabriel.webflux.data.db.mongo.repositories;

import me.gabriel.webflux.data.db.mongo.document.PlaylistDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author daohn
 * @since 01/08/2021
 */

@Repository
public interface ReactivePlaylistRepository extends ReactiveMongoRepository<PlaylistDocument, String> {
}
