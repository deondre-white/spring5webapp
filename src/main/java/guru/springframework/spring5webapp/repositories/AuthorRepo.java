package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

public interface AuthorRepo extends CrudRepository<Author, Long>{

}
