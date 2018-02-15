package com.madhu.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.madhu.entities.Bookmark;

@RepositoryRestResource(collectionResourceRel = "bookmarks", path = "bookmarks")
public interface BookmarkRepository extends MongoRepository<Bookmark, String> {

}
