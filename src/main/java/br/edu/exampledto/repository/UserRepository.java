package br.edu.exampledto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.exampledto.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
