package com.api.taller.programacion.worktallerprogramacionmysqlapirest.repositories;

import com.api.taller.programacion.worktallerprogramacionmysqlapirest.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
