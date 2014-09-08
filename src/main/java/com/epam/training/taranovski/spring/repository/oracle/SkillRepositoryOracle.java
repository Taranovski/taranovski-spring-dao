/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository.oracle;

import com.epam.training.taranovski.spring.domain.Skill;
import com.epam.training.taranovski.spring.repository.SkillRepository;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository("skillRepository")
public class SkillRepositoryOracle implements SkillRepository {

    private DataSource ds;

    /**
     *
     * @param ds
     */
    @Autowired
    public SkillRepositoryOracle(DataSource ds) {
        this.ds = ds;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Skill getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Skill> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param skill
     * @return
     */
    @Override
    public boolean create(Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param skill
     * @return
     */
    @Override
    public boolean update(Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param skill
     * @return
     */
    @Override
    public boolean delete(Skill skill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
