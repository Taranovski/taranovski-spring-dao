/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.taranovski.spring.repository.test;

import com.epam.training.taranovski.spring.domain1.Admin;
import com.epam.training.taranovski.spring.repository.AdminRepository;
import com.epam.training.taranovski.spring.repository.oracle.AdminRepositoryOracle;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alyx
 */
public class NewClass {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.epam.training.taranovski-webprojectPU");
       
        AdminRepository adminRepository = new AdminRepositoryOracle(emf);
        
        Admin admin = adminRepository.getById(1);
        System.out.println(admin.getAdminName());
        
        emf.close();
    }
}
