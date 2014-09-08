/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository.oracle;

import com.epam.training.taranovski.spring.domain.Skill;
import com.epam.training.taranovski.spring.domain.Vacancy;
import com.epam.training.taranovski.spring.repository.VacancyRepository;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository("vacancyRepository")
public class VacancyRepositoryOracle implements VacancyRepository {

    private DataSource ds;

    /**
     *
     * @param ds
     */
    @Autowired
    public VacancyRepositoryOracle(DataSource ds) {
        this.ds = ds;
    }

    /**
     *
     * @param vacancy
     * @param skill
     * @return
     */
    @Override
    public boolean addSkill(Vacancy vacancy, Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param vacancy
     * @param skill
     * @return
     */
    @Override
    public boolean removeSkill(Vacancy vacancy, Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param vacancy
     * @return
     */
    @Override
    public boolean clearSkills(Vacancy vacancy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param vacancy
     * @return
     */
    @Override
    public List<Skill> getSkills(Vacancy vacancy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Vacancy getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Vacancy> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param admin
     * @return
     */
    @Override
    public boolean create(Vacancy admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param admin
     * @return
     */
    @Override
    public boolean update(Vacancy admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param admin
     * @return
     */
    @Override
    public boolean delete(Vacancy admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
