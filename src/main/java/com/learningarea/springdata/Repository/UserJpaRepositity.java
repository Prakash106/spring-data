package com.learningarea.springdata.Repository;

import com.learningarea.springdata.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserJpaRepositity extends JpaRepository<User, Long> {

    public User findByName(String name);

}
