/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository.oracle;

import com.epam.training.taranovski.spring.domain.CheckDocument;
import com.epam.training.taranovski.spring.domain.Employee;
import com.epam.training.taranovski.spring.domain.Skill;
import com.epam.training.taranovski.spring.repository.EmployeeRepository;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository("employeeRepository")
public class EmployeeRepositoryOracle implements EmployeeRepository {

    private DataSource ds;

    /**
     *
     * @param ds
     */
    @Autowired
    public EmployeeRepositoryOracle(DataSource ds) {
        this.ds = ds;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Employee getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public boolean create(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public boolean update(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public boolean delete(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @param skill
     * @return
     */
    @Override
    public boolean addSkill(Employee employee, Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @param skill
     * @return
     */
    @Override
    public boolean removeSkill(Employee employee, Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public boolean clearSkills(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public List<Skill> getSkills(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public CheckDocument getCheckDocument(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param patronymic
     * @return
     */
    @Override
    public Employee getByCredentials(String firstName, String lastName, String patronymic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
