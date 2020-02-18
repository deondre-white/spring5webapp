package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Long>{

}
