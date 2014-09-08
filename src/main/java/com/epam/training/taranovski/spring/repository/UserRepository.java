/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository;

import com.epam.training.taranovski.spring.domain.User;
import java.util.List;

/**
 *
 * @author Oleksandr_Taranovsky
 */
public interface UserRepository {

    User getById(int id);

    User getByName(String name);

    List<User> getAll();

    String getTypeOf(int id);

    boolean validate(User user);

    boolean create(User user);

    boolean update(User user);

    boolean delete(User user);

}
