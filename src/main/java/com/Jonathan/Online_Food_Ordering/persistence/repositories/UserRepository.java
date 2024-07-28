package com.Jonathan.Online_Food_Ordering.persistence.repositories;

import com.Jonathan.Online_Food_Ordering.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    public UserEntity findByEmail(String username);
}
