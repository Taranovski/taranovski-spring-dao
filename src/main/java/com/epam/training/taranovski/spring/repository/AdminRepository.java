/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository;

import com.epam.training.taranovski.spring.domain.Admin;
import java.util.List;

/**
 *
 * @author Oleksandr_Taranovsky
 */
public interface AdminRepository {

    Admin getById(int id);

    List<Admin> getAll();

    Admin getByName(String name);

    boolean create(Admin admin);

    boolean update(Admin admin);

    boolean delete(Admin admin);

}
